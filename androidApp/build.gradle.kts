plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.example.todo_list.android"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.example.todo_list.android"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
//    val nav_version = "";
    implementation(platform("androidx.compose:compose-bom:2025.02.00"))
    implementation("io.coil-kt:coil-compose:2.6.0")
    implementation("com.github.bumptech.glide:compose:1.0.0-beta01")
    implementation(projects.shared)
    implementation(libs.compose.ui)
    implementation("androidx.navigation:navigation-compose:2.5.3")
    implementation(libs.compose.ui.tooling.preview)
    implementation(libs.compose.material3)
    implementation(libs.androidx.activity.compose)
    debugImplementation(libs.compose.ui.tooling)
}