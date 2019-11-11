package com.blank.ongithub

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Path


interface UserAPI {

    @GET("users/{user_name}")
    suspend fun getUser(
        @Path("user_name") userName: String
    ): ResponseBody

}