package com.example.wangchang.testpalette;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import okhttp3.*;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DemoAdapter adapter;
    ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recylerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter = new DemoAdapter());
        adapter.replaceAll(list);
    }
    public ArrayList<String> getData() {
        /*加载我们的数据*/
        String url = "http://wallpaper.apc.360.cn/index.php?c=WallPaper&a=getAppsByOrder&order=create_time&start=0&count=100&from=360chrome";
        OkHttpClient okHttpClient = new OkHttpClient();
        final Request request = new Request.Builder().url(url).get().build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            public void onFailure(Call call, IOException e) {
                System.out.print("数据获取失败！");
            }

            public void onResponse(Call call, Response response) throws IOException {
                System.out.print("数据获取成功！");
                String raw_data = response.body().string();
                /*开始解析json数据*/
                JSONObject jsonObject = JSONObject.parseObject(raw_data);
                JSONArray jsonArray = jsonObject.getJSONArray("data");
                /*遍历我们的数组*/
                for (Iterator iterator = jsonArray.iterator();iterator.hasNext();){
                    JSONObject item = (JSONObject) iterator.next();
//                    System.out.println((String) item.get("img_1600_900"));
                    list.add((String) item.get("img_1600_900"));
                }
            }
        });
        return list;
    }
}
