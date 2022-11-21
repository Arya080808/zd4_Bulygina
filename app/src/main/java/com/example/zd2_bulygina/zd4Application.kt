package com.example.zd2_bulygina

import android.app.Application

class zd4Application : Application() {
    override fun onCreate(){
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}