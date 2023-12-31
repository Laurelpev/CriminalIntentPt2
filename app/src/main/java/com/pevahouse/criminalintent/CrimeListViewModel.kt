package com.pevahouse.criminalintent

import androidx.lifecycle.ViewModel
import java.util.*

class CrimeListViewModel : ViewModel() {
    val crimes = mutableListOf<Crime>()
    val random = Random()

    init{
        for(i in 0 until 100){
            val crime = Crime(
                id= UUID.randomUUID(),
                title = "Crime #$i",
                date = Date(),
                isSolved = i % 2 == 0,
                needPolice = random.nextBoolean()
            )
            crimes += crime
        }
    }
}