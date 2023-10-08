package com.alex.pokemoncatcher.domain

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alex.pokemoncatcher.database.PokemonDatabase

interface PokemonDao {

}

@Database(entities = [PokemonDatabase::class], version = 1)
abstract class DatabasePokemon: RoomDatabase() {

}