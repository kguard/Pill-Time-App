plugins {
    alias(libs.plugins.blueguard.android.library)
    alias(libs.plugins.blueguard.android.library.compose)
}

android {
    namespace = "com.blueguard.pilltime.core.designsystem"
}

dependencies {
    implementation (libs.androidx.appcompat)
    api(libs.androidx.compose.foundation)
    api(libs.androidx.compose.foundation.layout)
    api(libs.androidx.compose.material.iconsExtended)
    api(libs.androidx.compose.material3)
    api(libs.androidx.compose.runtime)
    api(libs.androidx.compose.ui.tooling.preview)
    api(libs.androidx.compose.ui.util)
    implementation(libs.androidx.core.ktx)
    implementation(libs.coil.kt.compose)
    debugApi(libs.androidx.compose.ui.tooling)

}