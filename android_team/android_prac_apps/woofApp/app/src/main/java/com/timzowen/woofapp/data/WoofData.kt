package com.timzowen.woofapp.data

import com.timzowen.woofapp.R
import com.timzowen.woofapp.module.Woof

class WoofData {

    fun loadWoof(): List<Woof>{
        return listOf(
            Woof(R.drawable.bella,R.string.dog_name_1,R.string.dog_description_1,4),
            Woof(R.drawable.faye,R.string.dog_name_2,R.string.dog_description_2,6),
            Woof(R.drawable.frankie,R.string.dog_name_3,R.string.dog_description_3,3),
            Woof(R.drawable.koda,R.string.dog_name_4,R.string.dog_description_4,4),
            Woof(R.drawable.leroy,R.string.dog_name_5,R.string.dog_description_5,7),
            Woof(R.drawable.lola,R.string.dog_name_6,R.string.dog_description_6,11),
            Woof(R.drawable.moana,R.string.dog_name_7,R.string.dog_description_7,12),
            Woof(R.drawable.nox,R.string.dog_name_8,R.string.dog_description_8,10),
            Woof(R.drawable.tzeitel,R.string.dog_name_9,R.string.dog_description_9,9),
        )
    }
}