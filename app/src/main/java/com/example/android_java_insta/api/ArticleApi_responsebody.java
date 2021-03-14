package com.example.android_java_insta.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArticleApi_responsebody {
    public String resultCode;
    public String msg;
    public Articles body;
    public boolean fail;
    public boolean success;
}
