plugins {
    alias(libs.plugins.blueguard.android.library)
    alias(libs.plugins.blueguard.android.hilt)
}

android {
   namespace = "com.blueguard.pilltime.core.data"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    testImplementation(libs.junit4)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.test.espresso.core)
    implementation (libs.gson)

    implementation(projects.core.model)
    implementation(projects.core.database)
    //Coroutines
    implementation (libs.kotlinx.coroutines.android )
}