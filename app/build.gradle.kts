plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(Versions.compileSdk)
    buildToolsVersion = Versions.buildTools
    defaultConfig {
        applicationId = Application.id
        targetSdkVersion(Versions.targetSdk)
        minSdkVersion(Versions.minSdk)
        versionCode = Releases.versionCode
        versionName = Releases.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    dataBinding.isEnabled = true
}

kapt {
    correctErrorTypes = true
    useBuildCache = true
    javacOptions {
        // Increase the max count of errors from annotation processors.
        // Default is 100.
        option("-Xmaxerrs", 500)
    }
}

dependencies {
    api(project(mapOf("path" to ":entity")))

    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(Libraries.appCompat)
    implementation(Libraries.coroutine)
    implementation(Libraries.ktx)
    implementation(Libraries.fragment)
    implementation(Libraries.fragment_ktx)

    implementation(Libraries.constraintLayout)
    implementation(Libraries.lifecycle)
    implementation(Libraries.lifecycle_viewmodel_ktx)
    implementation(Libraries.lifecycle_runtime_ktx)

    implementation(Libraries.retrofit)
    implementation(Libraries.converter_gson)

    implementation(Libraries.koin)
    implementation(Libraries.koin_viewmodel)

    implementation(Libraries.glide)

    implementation(Libraries.timber)

    testImplementation(TestLibraries.junit)
    androidTestImplementation(TestLibraries.junitExt)
    androidTestImplementation(TestLibraries.espresso)
}
