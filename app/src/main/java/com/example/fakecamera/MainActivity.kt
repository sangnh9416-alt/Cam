package com.example.fakecamera

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCapture = findViewById<Button>(R.id.btnCapture)

        btnCapture.setOnClickListener {
            Toast.makeText(
                this,
                "Truy cập bị từ chối: Quyền Camera đã bị vô hiệu hóa!",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
