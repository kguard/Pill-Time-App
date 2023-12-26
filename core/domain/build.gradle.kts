plugins {
    // alias(libs.plugins.kguard.jvm.library)
    alias(libs.plugins.blueguard.android.library)
    alias(libs.plugins.blueguard.android.hilt)
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.blueguard.pilltime.core.domain"
}

dependencies {
    implementation(projects.core.data)
    implementation(projects.core.model)
    implementation (libs.kotlinx.coroutines.android )

}