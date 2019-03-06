package com.example.pijey.fadjartugas2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMatch.setOnClickListener { cariPasangan() }
    }

    fun cariPasangan() {
        val randomCewe = Random().nextInt(3 ) +1
        val randomCowo = Random().nextInt(3 ) +1
        val drawableResCewek = when (randomCewe) {
            1 -> R.drawable.cewe1
            2 -> R.drawable.cewe2
            else -> R.drawable.aa
        }
                 val drawableRescowo = when (randomCowo){
                     1 -> R.drawable.aa
                     2 -> R.drawable.bb
                     else -> R.drawable.cc
                     }

        ivDadu1.setImageResource(drawableResCewek)
        ivDadu2.setImageResource(drawableRescowo)
                 }
             }


