package com.example.burcrehberiapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.teksatir.view.*

class BurclarArrayAdapter(var gelencontext: Context, resource: Int, textViewResourceId: Int, var burcAdlari: Array<String>,var burcTarihleri:Array<String>)
    : ArrayAdapter<String>(gelencontext, resource, textViewResourceId, burcAdlari) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var inflater= LayoutInflater.from(gelencontext)
        var teksatirView=inflater.inflate(R.layout.teksatir,parent,false)

        var burcAdi=teksatirView.txtBurcAd
        var burcTarih=teksatirView.txtBilgi
        //var burcResim=teksatirView.imgBurcSembol

        //burcResim.setImageResource(burcResimleri[position])
        burcTarih.setText(burcTarihleri[position])
        burcAdi.setText(burcAdlari[position])


        return teksatirView
    }
}

/*
resource:Int kaynak çekeceğimiz yer
textviewresourceıd:Int text olarak kaynak çekeceğimiz yer
burclararrayadapterın yapıcı metodunu özelleştirdik bu sayede istediğimiz değerleri atayabileceğiz

İçerisine getView adında bir fonksiyon oluşturduk bu sayede xml dosyalarını layouta çevireceğiz yani her bir satırı
oluştururken tetiklenen metot
burcadı adında bir değişken oluşturduk ve ağaç ilişkisi ile layouta çevirilen text xml leri bu değişkene atadık

oluşturduğumuz değişkenlere dizi yarımıyla gelen değerleri atadık
 */


