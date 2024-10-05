plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.dependencyinjection"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.dependencyinjection"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    //
    implementation("com.google.android.material:material:1.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    // Koin main features for Android (Scope,ViewModel ...)
    implementation ("io.insert-koin:koin-android:3.1.2")
// Koin Java Compatibility
    implementation ("io.insert-koin:koin-android-compat:3.1.2")
// Koin for Jetpack WorkManager
    implementation ("io.insert-koin:koin-androidx-workmanager:3.1.2")
    // Koin for Jetpack Compose
    implementation ("io.insert-koin:koin-androidx-compose:3.1.2")

}