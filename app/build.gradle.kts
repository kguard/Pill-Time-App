plugins {
    alias(libs.plugins.blueguard.android.application)
    alias(libs.plugins.blueguard.android.application.compose)
    id("com.google.android.gms.oss-licenses-plugin")
}

android {
    namespace = "com.blueguard.pilltime"

    defaultConfig {
        applicationId = "com.blueguard.pilltime"
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
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.android.material)
    testImplementation(libs.junit4)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.test.espresso.core)
}