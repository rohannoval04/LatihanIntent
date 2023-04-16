package com.example.LatihanIntentCs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.LatihanIntentCs.R

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn_PindahActivity : Button
    private lateinit var btn_PindahActivityData : Button
    private lateinit var btn_PindahActivityObjk :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_PindahActivity = findViewById(R.id.btnActivity)
        btn_PindahActivity.setOnClickListener(this)
        btn_PindahActivityData = findViewById(R.id.btnActivityData)
        btn_PindahActivityData.setOnClickListener(this)
        btn_PindahActivityObjk = findViewById(R.id.btnActivityObjek)
        btn_PindahActivityObjk.setOnClickListener(this)

    }

    override fun onClick(p0: View) {
        when(p0.id ){
            R.id.btnActivityData -> run{
                val pindahIntentData = Intent(this@MainActivity,PindahActivityData::class.java)
                pindahIntentData.putExtra(PindahActivityData.EXTRA_TEXT,"Ayo Belajar Kotlin Menyenangkan loh")
                startActivity(pindahIntentData)
            }
            R.id.btnActivity -> run{
                val pindahIntent = Intent(this@MainActivity, PindahActivity::class.java)
                startActivity(pindahIntent)
            }
            R.id.btnActivityObjek -> run{
                val Cars = Mobil(
                    "Toyota Avanza",
                    2023,
                    "BM 2023 SAR"

                )

                val pindahIntentObjek = Intent(this@MainActivity,PindahActivityObjek::class.java)
                pindahIntentObjek.putExtra(PindahActivityObjek.EXTRA_CARS,Cars)
                startActivity(pindahIntentObjek)
            }
        }
    }
}