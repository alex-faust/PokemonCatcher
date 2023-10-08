package com.alex.pokemoncatcher.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Pokemon(val dexNum: Long,
    val name: String) : Parcelable