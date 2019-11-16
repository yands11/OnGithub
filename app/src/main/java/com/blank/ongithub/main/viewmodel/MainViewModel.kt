package com.blank.ongithub.main.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.blank.entity.User
import com.blank.ongithub.UserAPI
import com.blank.ongithub.ext.map
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import timber.log.Timber


class MainViewModel(
    private val userAPI: UserAPI
) : ViewModel() {
    // for test
    private val userName = "android"

    private val _user = MutableLiveData<User>()

    val bundle = object : LiveBundle {
        override val photoUrl: LiveData<String> = _user.map { it.avatarUrl ?: "" }
        override val name: LiveData<String> = _user.map { it.name ?: "" }
        override val githubId: LiveData<String> = _user.map { it.login ?: "" }
        override val bio: LiveData<String> = _user.map { it.bio?.let { bio -> "\"$bio\"" } ?: "" }
        override val blog: LiveData<String> = _user.map { it.blog ?: "" }
        override val followers: LiveData<String> = _user.map { it.followers.toString() }
        override val following: LiveData<String> = _user.map { it.following.toString() }
        override val location: LiveData<String> = _user.map { it.location ?: "" }
    }

    init {
        viewModelScope.launch {
            try {
                fetchUser(userName).run {
                    _user.value = this.body()
                }
            } catch (e: Exception) {
                Timber.e(e)
            }
        }
    }

    private suspend fun fetchUser(userName: String) = withContext(Dispatchers.Default) {
        userAPI.getUser(userName)
    }

    interface LiveBundle {
        val photoUrl: LiveData<String>
        val name: LiveData<String>
        val githubId: LiveData<String>
        val bio: LiveData<String>
        val blog: LiveData<String>
        val followers: LiveData<String>
        val following: LiveData<String>
        val location: LiveData<String>
    }
}