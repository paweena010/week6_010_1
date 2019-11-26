package com.example.week6_010

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var recycleView : RecyclerView? = null

    var foodMenuText = arrayOf(
        "BEER",
        "RUM & COKE",
        "VODKA & ORANGE",
        "TEQUILA",
        "MARGARITA",
        "WHITE RUSSIAN",
        "SEX ON THE BEACH",
        "WINE(ไวน์)",
        "JAGER(เยเกอร์)",
        "ABSINTHE(แอ๊บซินธ์)",
        "The Macallan",
        "Jack & Coke",
        "LIQUEUR"
    )
    var foodMenuImage = arrayOf<Int>(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
        R.drawable.image6,
        R.drawable.image7,
        R.drawable.image8,
        R.drawable.image9,
        R.drawable.image10,
        R.drawable.image11,
        R.drawable.image12,
        R.drawable.image13
    )

    var context : Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleView = findViewById(R.id.menuRecyclerview)as RecyclerView
        recycleView!!.layoutManager = LinearLayoutManager(context)
        recycleView!!.setLayoutManager(GridLayoutManager(context,2))
        var myAdapter = MyAdapterRecycleView(foodMenuText,foodMenuImage,context)
        recycleView!!.adapter=myAdapter
    }
}
