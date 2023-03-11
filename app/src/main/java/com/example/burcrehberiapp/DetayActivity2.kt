package com.example.burcrehberiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detay2.*
import kotlinx.android.synthetic.main.activity_main.*
class DetayActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay2)
        var position=intent.extras!!.get("pozisyonDegeri") as Int
        var tumBurcBilgileri= intent.extras!!.get("tumBurcBilgileri") as ArrayList<Burc>

        txtozellikleri.setText(tumBurcBilgileri.get(position).burcAciklama)
    }
}