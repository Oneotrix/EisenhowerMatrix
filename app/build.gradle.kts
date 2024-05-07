plugins {
    alias(core.plugins.androidApplication)
    alias(core.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.oneotrix.eisenhowermatrix"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.oneotrix.eisenhowermatrix"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(core.androidx.core.ktx)
    implementation(core.androidx.lifecycle.runtime.ktx)
    implementation(core.androidx.activity.compose)
    implementation(platform(core.androidx.compose.bom))
    implementation(core.androidx.ui)
    implementation(core.androidx.ui.graphics)
    implementation(core.androidx.ui.tooling.preview)
    implementation(core.androidx.material3)
    testImplementation(test.junit)
    androidTestImplementation(test.androidx.junit)
    androidTestImplementation(test.androidx.espresso.core)
    androidTestImplementation(platform(core.androidx.compose.bom))
    androidTestImplementation(test.androidx.ui.test.junit4)
    debugImplementation(test.androidx.ui.test.manifest)
    debugImplementation(core.androidx.ui.tooling)
    androidTestCompileOnly(test.org.mockito.core)

    testImplementation(test.org.mockito.core)
    //testImplementation(test.org.mockito.kotlin)
}