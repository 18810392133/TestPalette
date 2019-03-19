package com.example.wangchang.testpalette;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by WangChang on 2016/4/3.
 */
public class ImageUtil {
    public static String[] imageUrls = new String[]{
            "http://p15.qhimg.com/bdm/1600_900_85/t018ecbf9dd3a66bc0f.jpg",
            "http://p19.qhimg.com/bdm/1600_900_85/t01bdfa3f16a0391889.jpg", "http://p15.qhimg.com/bdm/1600_900_85/t018ecbf9dd3a66bc0f.jpg",
            "http://p19.qhimg.com/bdm/1600_900_85/t01bdfa3f16a0391889.jpg", "http://p15.qhimg.com/bdm/1600_900_85/t018ecbf9dd3a66bc0f.jpg",
            "http://p19.qhimg.com/bdm/1600_900_85/t01bdfa3f16a0391889.jpg", "http://p15.qhimg.com/bdm/1600_900_85/t018ecbf9dd3a66bc0f.jpg",
            "http://p19.qhimg.com/bdm/1600_900_85/t01bdfa3f16a0391889.jpg", "http://p15.qhimg.com/bdm/1600_900_85/t018ecbf9dd3a66bc0f.jpg",
            "http://p19.qhimg.com/bdm/1600_900_85/t01bdfa3f16a0391889.jpg", "http://p15.qhimg.com/bdm/1600_900_85/t018ecbf9dd3a66bc0f.jpg",
            "http://p19.qhimg.com/bdm/1600_900_85/t01bdfa3f16a0391889.jpg", "http://p15.qhimg.com/bdm/1600_900_85/t018ecbf9dd3a66bc0f.jpg",
            "http://p19.qhimg.com/bdm/1600_900_85/t01bdfa3f16a0391889.jpg", "http://p15.qhimg.com/bdm/1600_900_85/t018ecbf9dd3a66bc0f.jpg",
            "http://p19.qhimg.com/bdm/1600_900_85/t01bdfa3f16a0391889.jpg", "http://p15.qhimg.com/bdm/1600_900_85/t018ecbf9dd3a66bc0f.jpg",
            "http://p19.qhimg.com/bdm/1600_900_85/t01bdfa3f16a0391889.jpg", "http://p15.qhimg.com/bdm/1600_900_85/t018ecbf9dd3a66bc0f.jpg",
            "http://p19.qhimg.com/bdm/1600_900_85/t01bdfa3f16a0391889.jpg", "http://p15.qhimg.com/bdm/1600_900_85/t018ecbf9dd3a66bc0f.jpg",
            "http://p19.qhimg.com/bdm/1600_900_85/t01bdfa3f16a0391889.jpg", "http://p15.qhimg.com/bdm/1600_900_85/t018ecbf9dd3a66bc0f.jpg",
            "http://p19.qhimg.com/bdm/1600_900_85/t01bdfa3f16a0391889.jpg",
    };
}
