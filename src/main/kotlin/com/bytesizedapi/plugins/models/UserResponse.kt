package com.bytesizedapi.plugins.models

import kotlinx.serialization.Serializable

//Used in GET

@Serializable
data class UserResponse(
    val name: String,
    val email: String
)
