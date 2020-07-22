package com.example.kengsophy;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecylerItem {
    private int mImageRescoure;
    private String mtxt1;
    private String mtxt2;

    public RecylerItem ( int imageRescoure , String text1 , String text2){
        mImageRescoure = imageRescoure;
        mtxt1 = text1;
        mtxt2 = text2;

    }

    public int getMimageRescoure(){

        return mImageRescoure;
    }
    public String getMtxt1(){

        return mtxt1;
    }

    public String getMtxt2 (){

        return mtxt2;
    }

}
