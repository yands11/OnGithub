package com.blank.ongithub.koin

import com.blank.ongithub.UserAPI
import com.blank.ongithub.main.viewmodel.MainViewModel
import com.google.gson.Gson
import okhttp3.OkHttpClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {

    single<String>(named("base_url")) {
        "https://api.github.com/"
    }

    single<OkHttpClient> {
        OkHttpClient.Builder()
            .build()
    }

    single<Gson> {
        Gson()
    }

    single<GsonConverterFactory> {
        GsonConverterFactory.create(get<Gson>())
    }

    single<Retrofit> {
        Retrofit.Builder()
            .baseUrl(get<String>(named("base_url")))
            .client(get<OkHttpClient>())
            .addConverterFactory(get<GsonConverterFactory>())
            .build()
    }
}

val apiModule = module {

    single<UserAPI> {
        get<Retrofit>().create(UserAPI::class.java)
    }

}

val viewModelModule = module {

    viewModel { MainViewModel(get<UserAPI>()) }

}