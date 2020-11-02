package com.example.nearbyforeattogether

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = RowData.getDataList()
        val adapter = NearByRecycleViewAdapter(this, data)
        val list = findViewById<RecyclerView>(R.id.list)
        list.adapter = adapter
        val layoutManager = NotScrollLayoutManager(this)
        list.layoutManager = layoutManager
        list.isNestedScrollingEnabled = false
        val callback: ItemTouchHelper.Callback = SimpleItemTouchHelperCallback(adapter)
        val touchHelper = ItemTouchHelper(callback)
        touchHelper.attachToRecyclerView(list)

    }
}