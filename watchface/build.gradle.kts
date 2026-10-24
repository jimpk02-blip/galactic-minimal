plugins {
    id("com.android.application")
}
android {
    namespace = "com.galacticminimal.watchface"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.galacticminimal.watchface"
        minSdk = 33
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}
