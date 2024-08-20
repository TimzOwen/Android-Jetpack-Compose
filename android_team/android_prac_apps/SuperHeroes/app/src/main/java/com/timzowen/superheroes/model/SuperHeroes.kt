package com.timzowen.superheroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.res.stringResource
import com.timzowen.superheroes.R

data class SuperHeroes(
    @DrawableRes val superHeroImageResourceId: Int,
    @StringRes val superHeroName: Int,
    @StringRes val superHeroDescription: Int
)

object HeroesRepository{
    val heroes = listOf(
        SuperHeroes(
            superHeroImageResourceId = R.drawable.android_superhero1,
            superHeroName =  R.string.hero1,
            superHeroDescription = R.string.description1
        ),
        SuperHeroes(
            superHeroImageResourceId = R.drawable.android_superhero2,
            superHeroName =  R.string.hero2,
            superHeroDescription = R.string.description2
        ),
        SuperHeroes(
            superHeroImageResourceId = R.drawable.android_superhero3,
            superHeroName =  R.string.hero3,
            superHeroDescription = R.string.description3
        ),
        SuperHeroes(
            superHeroImageResourceId = R.drawable.android_superhero4,
            superHeroName =  R.string.hero4,
            superHeroDescription = R.string.description4
        ),
        SuperHeroes(
            superHeroImageResourceId = R.drawable.android_superhero5,
            superHeroName =  R.string.hero5,
            superHeroDescription = R.string.description5
        ),
        SuperHeroes(
            superHeroImageResourceId = R.drawable.android_superhero6,
            superHeroName =  R.string.hero6,
            superHeroDescription = R.string.description6
        ),
        SuperHeroes(
            superHeroImageResourceId = R.drawable.android_superhero2,
            superHeroName =  R.string.hero2,
            superHeroDescription = R.string.description2
        ),
        SuperHeroes(
            superHeroImageResourceId = R.drawable.android_superhero3,
            superHeroName =  R.string.hero3,
            superHeroDescription = R.string.description3
        ),
        SuperHeroes(
            superHeroImageResourceId = R.drawable.android_superhero4,
            superHeroName =  R.string.hero4,
            superHeroDescription = R.string.description4
        ),
        SuperHeroes(
            superHeroImageResourceId = R.drawable.android_superhero5,
            superHeroName =  R.string.hero5,
            superHeroDescription = R.string.description5
        ),
        SuperHeroes(
            superHeroImageResourceId = R.drawable.android_superhero6,
            superHeroName =  R.string.hero6,
            superHeroDescription = R.string.description6
        )
    )
}