import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
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
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(kotlin("stdlib-jdk7", KotlinCompilerVersion.VERSION))

    implementation(Libraries.appCompat)
    implementation(Libraries.coroutine)
    implementation(Libraries.ktx)
    implementation(Libraries.constraintLayout)
    implementation(Libraries.lifecycle)
    implementation(Libraries.lifecycle_viewmodel_ktx)
    implementation(Libraries.lifecycle_runtime_ktx)

    implementation(Libraries.retrofit)
    implementation(Libraries.converter_moshi)
    implementation(Libraries.moshi)

    implementation(Libraries.koin)
    implementation(Libraries.koin_viewmodel)

    testImplementation(TestLibraries.junit)
    androidTestImplementation(TestLibraries.junitExt)
    androidTestImplementation(TestLibraries.espresso)
}
