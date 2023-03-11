package com.example.burcrehberiapp
//Context sistem kaynaklarına ve servislerine erişmek için kullanılan ve activity'lerin en üst sınıfıydı
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.teksatir.view.*
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.Job
import kotlinx.coroutines.NonDisposableHandle.parent
import java.util.zip.Inflater

class BurclarBaseAdapter(context: Context,tumBurcBilgileri:ArrayList<Burc>): BaseAdapter() {
    var allburc:ArrayList<Burc>
    var context:Context
    init {
        this.allburc=tumBurcBilgileri
        this.context=context
    }override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View { //herbir satırı oluştururken tetiklenen metot (listedeki)

        val teksatirView=LayoutInflater.from(context).inflate(R.layout.teksatir,p2,false)
        teksatirView.txtBurcAd.setText(allburc.get(p0).burcAdi)
        teksatirView.txtBilgi.setText(allburc.get(p0).burcTarih)
        return teksatirView
    }

    override fun getCount(): Int { //liste oluşturulurken kaç elemanlı olduğu
           return allburc.size
    }

    override fun getItem(p0: Int): Any { //ilgili satıedaki elemana nasıl ulaşılacağına daİR bilgi veren metot
        return allburc.get(p0)
    }

    override fun getItemId(p0: Int): Long {  //veritabanaları şle uğraşırken kullanmamız gereken metoto
        return 0
    }

}
