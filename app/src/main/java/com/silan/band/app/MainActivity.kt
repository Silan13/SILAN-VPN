package com.silan.band.app

import android.os.Bundle
import android.widget.*
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val layout = RelativeLayout(this)
        layout.setBackgroundColor(Color.BLACK)

        val btn = Button(this)
        btn.text = "CONNECT TO SILAN"
        btn.setTextColor(Color.BLACK)
        btn.setBackgroundColor(Color.parseColor("#D4AF37")) // رنگ طلایی

        val params = RelativeLayout.LayoutParams(500, 500)
        params.addRule(RelativeLayout.CENTER_IN_PARENT)
        layout.addView(btn, params)

        setContentView(layout)
        
        btn.setOnClickListener {
            Toast.makeText(this, "Connecting to: ${Config.SUB_URL}", Toast.LENGTH_LONG).show()
        }
    }
}
