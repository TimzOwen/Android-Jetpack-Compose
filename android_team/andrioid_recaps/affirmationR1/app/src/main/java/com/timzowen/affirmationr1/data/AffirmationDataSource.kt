package com.timzowen.affirmationr1.data

import com.timzowen.affirmationr1.R
import com.timzowen.affirmationr1.model.Affirmation

class AffirmationDataSource {

    fun loadAffirmation(): List<Affirmation>{
        return listOf(
            Affirmation(R.drawable.image1,R.string.affirmation1),
            Affirmation(R.drawable.image2,R.string.affirmation2),
            Affirmation(R.drawable.image3,R.string.affirmation3),
            Affirmation(R.drawable.image4,R.string.affirmation4),
            Affirmation(R.drawable.image5,R.string.affirmation5),
            Affirmation(R.drawable.image6,R.string.affirmation6),
            Affirmation(R.drawable.image7,R.string.affirmation7),
            Affirmation(R.drawable.image8,R.string.affirmation8),
            Affirmation(R.drawable.image9,R.string.affirmation9),
            Affirmation(R.drawable.image10,R.string.affirmation10),
        )
    }
}