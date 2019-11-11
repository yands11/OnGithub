package com.blank.ongithub.koin

import okhttp3.OkHttpClient
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


val networkModule = module {

    single<String>(named("base_url")) {
        "https://api.github.com/"
    }

    single<OkHttpClient> {
        OkHttpClient.Builder()
            .build()
    }

    single<MoshiConverterFactory> {
        MoshiConverterFactory.create()
    }

    single<Retrofit> {
        Retrofit.Builder()
            .baseUrl(get<String>(named("base_url")))
            .client(get<OkHttpClient>())
            .addConverterFactory(get<MoshiConverterFactory>())
            .build()
    }
}