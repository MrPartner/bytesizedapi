package com.bytesizedapi.plugins.models

import kotlinx.serialization.Serializable

//Used in POST
@Serializable
data class UserInfo(
    val email: String,
    val password: String
)
