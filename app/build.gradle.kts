plugins {
    `android-application`
    kotlin("android")
    kotlin("kapt")
    ksp
    shot
}

androidAppConfig {
    defaultConfig {
        applicationId = "nick.screenshot_testing_fun"
        versionCode = 1
        versionName = "1.0"

        buildFeatures {
            compose = true
        }

        composeOptions {
            kotlinCompilerExtensionVersion = Versions.compose
        }

        testInstrumentationRunner = "com.karumi.shot.ShotTestRunner"
    }

    shot {
        applicationId = "nick.screenshot_testing_fun"
    }
}

withKtlint()

dependencies {
    implementation(Dependencies.multidex)
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.appCompat)
    implementation(Dependencies.Activity.runtime)
    implementation(Dependencies.Activity.compose)
    implementation(Dependencies.vectorDrawable)
    implementation(Dependencies.constraintLayout)
    implementation(Dependencies.material)
    implementation(Dependencies.photoView)
    implementation(Dependencies.Retrofit.runtime)
    implementation(Dependencies.Retrofit.moshi)
    implementation(Dependencies.Moshi.runtime)
    implementation(Dependencies.Moshi.adapters)
    implementation(Dependencies.Room.runtime)
    implementation(Dependencies.Room.roomKtx)
    implementation(Dependencies.OkHttp.loggingInterceptor)
    implementation(Dependencies.coil)
    implementation(Dependencies.Lifecycle.runtime)
    implementation(Dependencies.Lifecycle.compose)
    implementation(Dependencies.Compose.compiler)
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.uiTooling)
    implementation(Dependencies.Compose.animation)
    implementation(Dependencies.Compose.runtime)
    implementation(Dependencies.Compose.foundation)
    implementation(Dependencies.Compose.material)
    implementation(Dependencies.Compose.materialIconsExtended)
    implementation(Dependencies.Compose.material3)


//    debugImplementation(Dependencies.leakCanary)

    testImplementation(Dependencies.junit)
    defaultAndroidTestDependencies()

    ksp(Dependencies.Moshi.kotlinCodegen)
    ksp(Dependencies.Room.compiler)
}
