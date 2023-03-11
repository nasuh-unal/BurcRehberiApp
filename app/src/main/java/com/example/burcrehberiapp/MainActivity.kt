package com.example.burcrehberiapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var tumBurcBilgileri:ArrayList<Burc>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        veriKaynagiHazirla()


        //var myAdapter=BurclarArrayAdapter(this,R.layout.teksatir,R.id.txtBurcAd,burclar,burcTarih1) //
        //listBurclar.adapter=myAdapter //Yukarıda adapter kavramını kendimize göre özelleştirdik ve BUrclarArrayAdapter diye
        //bir sınıf oluşturduk ve orada kendimize göre oluşturduk
        //listburclar.adapter ile listeye belirlediğimi dizileri tek tek atadık

        var myBaseAdapter=BurclarBaseAdapter(this,tumBurcBilgileri)

        listBurclar.adapter=myBaseAdapter

        listBurclar.setOnItemClickListener { adapterView, view, i, l ->
            var intent= Intent(this@MainActivity,DetayActivity2::class.java)
            intent.putExtra("pozisyonDegeri",i)
            intent.putExtra("tumBurcBilgileri",tumBurcBilgileri)
            startActivity(intent)
        }
    }

    private fun veriKaynagiHazirla() {
        tumBurcBilgileri=ArrayList<Burc>(12)
        var burclar= resources.getStringArray(R.array.burclar)          //Kaynak dosyalarından alıp main activity'e taşımak için
        var burcTarih1=resources.getStringArray(R.array.brucTarih)        //Kaynak dosyalarından alıp main activity'e taşımak için
        //var burcResimler1= arrayOf(R.drawable.burc,R.drawable.burc2)     //Kaynak dosyalarından alıp main activity'e taşımak için
        var kapakresim=R.drawable.kapak
        var burcGenelOzellikler=resources.getStringArray(R.array.burcGenelOzellikler)

        for (i in 0..11){
            var arrayListeAtanacakBurc=Burc(burclar[i],burcTarih1[i],kapakresim,burcGenelOzellikler[i])
            tumBurcBilgileri.add(arrayListeAtanacakBurc)
        }
    }
}