package com.example.android_java_insta.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Article {
    public int id;
    public String regDate;
    public String updateDate;
    public int boardId;
    public int memberId;
    public String title;
    public String body;
    public String extra__writer;
    public String extra__boardName;
    public String extra__thumbImg;
    public String extra;

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", regDate='" + regDate + '\'' +
                ", updateDate='" + updateDate + '\'' +
                ", boardId=" + boardId +
                ", memberId=" + memberId +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", extra__writer='" + extra__writer + '\'' +
                ", extra__boardName='" + extra__boardName + '\'' +
                ", extra__thumbImg='" + extra__thumbImg + '\'' +
                ", extra='" + extra + '\'' +
                '}';
    }
}
