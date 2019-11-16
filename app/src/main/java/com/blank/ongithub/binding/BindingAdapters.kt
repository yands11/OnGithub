package com.blank.ongithub.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


@BindingAdapter("url")
fun ImageView.bindUrl(value: String?) = value?.let { url ->
    Glide.with(context)
        .load(url)
        .centerCrop()
        .into(this)
}