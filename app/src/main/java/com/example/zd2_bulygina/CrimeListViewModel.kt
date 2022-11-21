package com.example.zd2_bulygina

import androidx.lifecycle.ViewModel
import java.util.*

class CrimeListViewModel : ViewModel() {

    private val crimeRepository=CrimeRepository.get()
    val crimeListLiveData=crimeRepository.getCrimes()
}
