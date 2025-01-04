plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.timzowen.noteapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.timzowen.noteapp"
        minSdk = 30
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    //Hilt-Dagger
    implementation(libs.androidx.hilt.navigation.compose)

////Room
//    implementation ("androidx.room:room-runtime:$room_version")
//    annotationProcessor ("androidx.room:room-compiler:$room_version")
//
//// To use Kotlin annotation processing tool (kapt) MUST HAVE!
//    kapt("androidx.room:room-compiler:$room_version")
//    implementation ("androidx.room:room-ktx:$room_version")
//
//
//
//// Coroutines
//    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
//    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2")
//    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.5.2")
}