package com.example.android_java_insta.ui;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.android_java_insta.service.ArticleService;
import com.example.android_java_insta.util.Util;

import java.util.Random;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class MainViewModel extends ViewModel {
    public MutableLiveData<String> lvAvartarImgUrl = new MutableLiveData<>();
    private  ArticleService articleService;
    @Inject
    public MainViewModel(@NonNull Application application, ArticleService articleService){

        this.articleService = articleService;
        // 아바타 이미지 세팅
        lvAvartarImgUrl.setValue("https://i.pravatar.cc/600?img=" + (new Random().nextInt(36) + 1));

        articleService.getArticles(1,1, articleApi_responsebody -> {
            Util.log(articleApi_responsebody.body.articles.get(0).toString());
        });
    }
}
