object Application {
    const val id = "com.blank.ongithub"
}

object Releases {
    const val versionCode = 1
    const val versionName = "1.0"
}


object Libraries {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutine}"
    const val ktx = "androidx.core:core-ktx:${Versions.ktx}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val lifecycle =
        "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycle_viewmodel_ktx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycle_runtime_ktx =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val fragment =
        "androidx.fragment:fragment:${Versions.fragment}"
    const val fragment_ktx =
        "androidx.fragment:fragment-ktx:${Versions.fragment}"

    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val converter_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

    const val koin = "org.koin:koin-androidx-scope:${Versions.koin}"
    const val koin_viewmodel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"

    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"

    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
}

object TestLibraries {
    const val junit = "junit:junit:${Versions.junit}"
    const val junitExt = "androidx.test.ext:junit:${Versions.junitExt}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}

object Versions {
    const val compileSdk = 29
    const val targetSdk = 29
    const val minSdk = 21

    const val buildTools = "29.0.2"
    const val gradle = "3.5.2"

    const val kotlin = "1.3.50"
    const val coroutine = "1.3.2"
    const val ktx = "1.1.0"
    const val appCompat = "1.1.0"
    const val constraintLayout = "1.1.3"
    const val lifecycle = "2.2.0-rc02"
    const val fragment = "1.1.0"

    const val retrofit = "2.6.2"
    const val gson = "2.8.6"

    const val koin = "2.0.1"

    const val glide = "4.10.0"

    const val timber = "4.7.1"

    const val junit = "4.12"
    const val junitExt = "1.1.1"
    const val espresso = "3.2.0"
}
