package com.authorl.radarview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    companion object{
        const val TAG = "custom"
    }
    private lateinit var radarView:RadarView
    private val map = mutableMapOf("经济" to 0.8F,"伤害" to 0.6F,"走位" to 0.78F)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radarView = findViewById<RadarView>(R.id.radar).apply {
            data = map
        }
    }

    fun changeData(view: View) {
        map["助攻"] = 0.5F
        map["团战"] = 0.8F
        map["承受伤害"] = 0.2F
        radarView.data = map
    }
    fun changeLine(view: View) {
        radarView.lineColor = Color.WHITE
    }
    fun changeColor(view: View) {
        radarView.mainColor = Color.parseColor("#00574B")
    }
}
