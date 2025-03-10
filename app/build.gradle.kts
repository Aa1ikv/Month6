plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("com.google.devtools.ksp") version "1.9.0-1.0.13"

}

android {
    namespace = "kg.geeks.month6"
    compileSdk = 35

    defaultConfig {
        applicationId = "kg.geeks.month6"
        minSdk = 28
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
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
    // Для использования ViewModel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.0") // или актуальная версия

    // Для Jetpack Compose
    implementation ("androidx.compose.runtime:runtime-livedata:1.4.0") // или актуальная версия
    implementation ("androidx.activity:activity-compose:1.7.0") // для Compose с Activity
    implementation ("androidx.compose.material3:material3:1.1.0") // для Material3

    implementation("androidx.compose.ui:ui:1.5.0")
    implementation("androidx.compose.material3:material3:1.1.1")
    implementation("androidx.compose.foundation:foundation:1.5.0")

    // Navigation
    implementation("androidx.navigation:navigation-compose:2.7.2")

    // ViewModel для управления состоянием
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")

    // Accompanist (если нужно скрытие системных элементов)
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.31.1-alpha")

    // Coil для загрузки изображений
    implementation("io.coil-kt:coil-compose:2.2.2")


    implementation ("com.squareup.retrofit2:retrofit:2.9.0") // Retrofit
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0") // Gson-конвертер для обработки JSON
    implementation ("com.squareup.okhttp3:logging-interceptor:4.9.3") // Логирование запросов


    // Koin для DI
    implementation ("io.insert-koin:koin-android:3.5.0")
    implementation ("io.insert-koin:koin-androidx-compose:3.5.0")


    implementation ("androidx.room:room-runtime:2.6.1")
    implementation ("androidx.room:room-ktx:2.6.1")
}