package com.blank.entity

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("avatar_url")
    val avatarUrl: String?,
    val bio: String?,
    val blog: String?,
    val company: String?,
    val email: String,
    val followers: Int = 0,
    val following: Int = 0,
    val id: Int = 0,
    val location: String?,
    val login: String?,
    val name: String?
)