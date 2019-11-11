package com.blank.ongithub

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    val retrofit by inject<Retrofit>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userApi = retrofit.create(UserAPI::class.java)
        GlobalScope.launch(Dispatchers.IO) {
            userApi.getUser("yands11").run {
                Log.d("A", this.toString())
            }
        }
    }
}