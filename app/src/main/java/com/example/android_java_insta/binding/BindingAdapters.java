package com.example.android_java_insta.binding;

import android.view.View;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.example.android_java_insta.util.Util;

public class BindingAdapters {
    @BindingAdapter({"imgUrl"})
    public static void imgUrl(ImageView view, String imgUrl){
        Util.loadImageOn(imgUrl, view);
    }

    @BindingAdapter({"imgUrl", "borderRadius"})
    public static void imgUrl(ImageView view, String imgUrl, int borderRadius){
        Util.loadImageOn(imgUrl, view, borderRadius);
    }
}
