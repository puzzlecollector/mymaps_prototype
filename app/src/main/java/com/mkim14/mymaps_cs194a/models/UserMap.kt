package com.mkim14.mymaps_cs194a.models

import java.io.Serializable

data class UserMap(val title: String, val places: List<Place>) : Serializable