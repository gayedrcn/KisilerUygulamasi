package com.example.kisileruygulamasi.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasi.repo.KisilerdaoRepository

class KisiKayitFragmentViewModel : ViewModel() {
    val kdaor = KisilerdaoRepository()
    fun kayit(kisi_ad:String, kisi_tel:String){
        kdaor.kisiKayit(kisi_ad,kisi_tel)
    }
}