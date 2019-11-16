package com.blank.ongithub

import com.blank.entity.User
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path


interface UserAPI {

    @GET("users/{user_name}")
    suspend fun getUser(
        @Path("user_name") userName: String
    ): Response<User>

}

