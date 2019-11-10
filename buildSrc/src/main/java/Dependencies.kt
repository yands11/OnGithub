object Libraries {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val ktx = "androidx.core:core-ktx:${Versions.ktx}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val converter_moshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    const val moshi = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
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
    const val ktx = "1.1.0"
    const val appCompat = "1.1.0"
    const val constraintLayout = "1.1.3"

    const val retrofit = "2.6.2"
    const val moshi = "1.9.1"

    const val junit = "4.12"
    const val junitExt = "1.1.1"
    const val espresso = "3.2.0"
}

object Releases {
    const val versionCode = 1
    const val versionName = "1.0"
}

object Application {
    const val id = "com.blank.ongithub"
}
