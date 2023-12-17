plugins {
    alias(libs.plugins.blueguard.android.feature)
    alias(libs.plugins.blueguard.android.library.compose)
}

android {
    namespace = "com.blueguard.pilltime.feature.alarm"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.android.material)
    testImplementation(libs.junit4)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.test.espresso.core)
    implementation(libs.androidx.activity.compose)
}