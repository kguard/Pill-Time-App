plugins {
    alias(libs.plugins.blueguard.android.library)
    alias(libs.plugins.blueguard.android.hilt)
    alias(libs.plugins.blueguard.android.room)
}

android {
    namespace = "com.blueguard.pilltime.core.database"
}

dependencies {
    implementation(projects.core.model)
    implementation(libs.kotlinx.coroutines.android)
}