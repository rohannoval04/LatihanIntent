package com.example.LatihanIntentCs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.LatihanIntentCs.R

class PindahActivityData : AppCompatActivity() {

    companion object{ const val EXTRA_TEXT = "extra text"}
    private lateinit var tvPenerima : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_data)

        tvPenerima = findViewById(R.id.tvPindahData)

        val tvDiterima = intent.getStringExtra(EXTRA_TEXT)
        val text = "Text yang dikirim:$tvDiterima"
        tvPenerima.text = text
    }
}