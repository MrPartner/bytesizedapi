package com.bytesizedapi

import kotlinx.serialization.Serializable

@Serializable
data class UserInfo(
    val email: String,
    val password: String
)
