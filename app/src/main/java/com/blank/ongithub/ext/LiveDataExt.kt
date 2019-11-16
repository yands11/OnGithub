package com.blank.ongithub.ext

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations


fun <X, Y> LiveData<X>.map(body: (X) -> Y): LiveData<Y> {
    return Transformations.map(this, body)
}