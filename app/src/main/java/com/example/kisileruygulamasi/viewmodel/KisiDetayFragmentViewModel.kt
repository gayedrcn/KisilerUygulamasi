package com.example.kisileruygulamasi.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasi.repo.KisilerdaoRepository

class KisiDetayFragmentViewModel : ViewModel() {
    val kdaor = KisilerdaoRepository()
    fun guncelle(kisi_id:Int, kisi_ad:String, kisi_tel:String){
        kdaor.kisiGuncelle(kisi_id,kisi_ad,kisi_tel)
    }
}