package com.myanmaritc.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.myanmaritc.recyclerview.adapter.FlowerAdapter
import com.myanmaritc.recyclerview.model.Flower
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var flowerList = ArrayList<Flower>()
        flowerList.add(Flower("Daisy", 32.0, R.drawable.daisy))
        flowerList.add(Flower("Rose", 32.0, R.drawable.rose))

        var flowerAdapter = FlowerAdapter(flowerList)
        flowerRecycler.layoutManager = LinearLayoutManager(this)
        flowerRecycler.adapter = flowerAdapter
    }
}