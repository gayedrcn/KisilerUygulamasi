package com.example.kisileruygulamasi.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasi.entity.Kisiler
import com.example.kisileruygulamasi.repo.KisilerdaoRepository

class AnasayfaFragmentViewModel : ViewModel() {
    //Live data dinleme işlemi sağlar.
    var kisilerListesi = MutableLiveData<List<Kisiler>>()
    val kdaor = KisilerdaoRepository()
    init {
        kisilerYukle()
        kisilerListesi = kdaor.kisileriGetir()
    }
    fun kisilerYukle(){
       kdaor.tumKisileriAl()
    }
    fun sil(kisi_id:Int){
        kdaor.kisiSil(kisi_id)
    }
    fun ara(aramaKelimesi:String){
        kdaor.kisiAra(aramaKelimesi)
    }
}