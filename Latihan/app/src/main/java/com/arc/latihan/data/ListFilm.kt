package com.arc.latihan.data

import com.arc.latihan.R
import com.arc.latihan.model.Film

class ListFilm {
    fun loadFilm(): List<Film>{
        return listOf<Film>(
            Film(R.drawable.film_1, R.string.affirmation_1),
            Film(R.drawable.film_2, R.string.affirmation_2),
            Film(R.drawable.film_3, R.string.affirmation_3),
            Film(R.drawable.film_4, R.string.affirmation_4),
            Film(R.drawable.film_5, R.string.affirmation_5),
            Film(R.drawable.film_6, R.string.affirmation_6),
            Film(R.drawable.film_7, R.string.affirmation_7),
            Film(R.drawable.film_8, R.string.affirmation_8),
            Film(R.drawable.film_9, R.string.affirmation_9),
            Film(R.drawable.film_10, R.string.affirmation_10)
        )
    }
}