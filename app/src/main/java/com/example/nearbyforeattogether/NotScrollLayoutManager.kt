package com.example.nearbyforeattogether

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager

class NotScrollLayoutManager(context: Context) : LinearLayoutManager(context){
    override fun canScrollVertically(): Boolean {
        return false
    }
}