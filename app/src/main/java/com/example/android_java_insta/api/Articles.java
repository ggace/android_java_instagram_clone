package com.example.android_java_insta.api;

import com.example.android_java_insta.dto.Article;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Articles {
    public List<Article> articles;
}
