pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "PillTime"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include(":app")
include(":core")
include(":core:data")
include(":core:domain")
include(":core:model")
include(":core:designsystem")
include(":core:common")
include(":core:database")
include(":core:ai")
include(":core:ui")
include(":feature")
include(":feature:alarm")
include(":feature:maker")
include(":feature:record")
include(":feature:analyze")
include(":feature:setting")
include(":feature:active")
