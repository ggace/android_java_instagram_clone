package com.example.android_java_insta.service;

import androidx.annotation.NonNull;

import com.example.android_java_insta.api.ArticleApi;
import com.example.android_java_insta.api.ArticleApi_responsebody;
import com.example.android_java_insta.util.Util;

import javax.inject.Inject;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class ArticleService {
    private ArticleApi articleApi;

    @Inject
    public ArticleService(ArticleApi articleApi){
        this.articleApi = articleApi;
    }

    public void getArticles(int boardId, int page, @NonNull Consumer<? super ArticleApi_responsebody> onNext){
        articleApi.getArticles(boardId, page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(onNext, throwable -> {
                    Util.log("throwable : " + throwable.getMessage());
                });

    }


}
