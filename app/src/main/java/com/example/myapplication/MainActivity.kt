package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.view.View
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val canvasFrame = findViewById<FrameLayout>(R.id.canvasContainer)
        val boxView = BoxView(this)
        canvasFrame.addView(boxView)
    }
    private inner class BoxView(context: Context) : View(context) {

        override fun onDraw(canvas: Canvas) {
            super.onDraw(canvas)
            val paint = Paint()
            paint.color = Color.BLUE

            val rect1 = Rect(100, 100, 300, 200)
            canvas.drawRect(rect1, paint)

            val rect2 = Rect(400, 100, 600, 200)
            canvas.drawRect(rect2, paint)
        }
    }
}