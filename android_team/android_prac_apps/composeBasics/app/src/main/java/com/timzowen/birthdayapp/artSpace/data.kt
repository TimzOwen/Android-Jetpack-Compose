package com.timzowen.birthdayapp.artSpace

import com.timzowen.birthdayapp.R

data class ArtWork(val artImage: Int,val title:String, val artist:String,val  year: String)

val artworks = listOf(
    ArtWork(R.drawable.art_01, "Sailing Under the Bridge", "Kat Kuan", "2017"),
    ArtWork(R.drawable.art_02, "Starry Night", "Vincent Van Gogh", "1889"),
    ArtWork(R.drawable.art_3, "Mona Lisa", "Leonardo da Vinci", "1503"),
    ArtWork(R.drawable.art_4, "Timz Owen", "Franco Madilu Goh", "2002"),
    ArtWork(R.drawable.art_5, "J Main Kim", "Sami de Munga", "2020"),
    ArtWork(R.drawable.art_6, "Josh Odhiambo", "Grego De hunter", "2025")
)