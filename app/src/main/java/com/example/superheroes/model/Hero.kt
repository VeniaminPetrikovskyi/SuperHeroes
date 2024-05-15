package com.example.superheroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.superheroes.R

data class Hero (
    @StringRes val name: Int,
    @DrawableRes val photo: Int,
    @StringRes val description: Int
)

val HeroesRepo = listOf<Hero> (
    Hero(
        name = R.string.hero1,
        description = R.string.description1,
        photo = R.drawable.android_superhero1
    ),
    Hero(
        name = R.string.hero2,
        description = R.string.description2,
        photo = R.drawable.android_superhero2
    ),
    Hero(
        name = R.string.hero3,
        description = R.string.description3,
        photo = R.drawable.android_superhero3
    ),
    Hero(
        name = R.string.hero4,
        description = R.string.description4,
        photo = R.drawable.android_superhero4
    ),
    Hero(
        name = R.string.hero5,
        description = R.string.description5,
        photo = R.drawable.android_superhero5
    ),
    Hero(
        name = R.string.hero6,
        description = R.string.description6,
        photo = R.drawable.android_superhero6
    )
)