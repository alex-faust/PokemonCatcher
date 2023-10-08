package com.alex.pokemoncatcher.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PokemonDatabase constructor(
    @PrimaryKey
    val dexNum: Long,
    val name: String
)