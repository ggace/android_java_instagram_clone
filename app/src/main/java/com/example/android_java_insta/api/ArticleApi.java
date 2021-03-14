package com.example.android_java_insta.api;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ArticleApi {
    String baseUrl = "http://192.168.35.218:8021/";



    @GET("usr/article/list")
    Observable<ArticleApi_responsebody> getArticles(@Query("boardId") int boardId, @Query("page") int page);


}
