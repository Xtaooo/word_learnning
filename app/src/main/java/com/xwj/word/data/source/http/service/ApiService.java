package com.xwj.word.data.source.http.service;

import com.xwj.word.entity.DemoEntity;
import com.xwj.word.entity.WordEntity;

import io.reactivex.Observable;
import me.goldze.mvvmhabit.http.BaseResponse;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by goldze on 2017/6/15.
 */

public interface ApiService {
    @GET("action/apiv2/banner?catalog=1")
    Observable<BaseResponse<DemoEntity>> demoGet();

    @FormUrlEncoded
    @POST("action/apiv2/banner")
    Observable<BaseResponse<DemoEntity>> demoPost(@Field("catalog") String catalog);

    @FormUrlEncoded
    @POST("")
    Observable<BaseResponse<WordEntity>> getWordList(@Field("w") String name,@Field("key") String key);
}
