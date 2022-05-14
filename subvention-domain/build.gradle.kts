plugins {
    id(Plugins.javaLibrary)
    id(KotlinPlugins.kotlin)
    id(KotlinPlugins.maven)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    implementation(ayan.Core.ayanCore)
}

publishing {
    publications {
        // Creates a Maven publication called "release".
        register("release", MavenPublication::class) {
            // Applies the component for the release build variant.
            // NOTE : Delete this line code if you publish Native Java / Kotlin Library
//            from(components["release"])
            from(components.getByName("java"))

            // Library Package Name (Example : "com.frogobox.androidfirstlib")
            // NOTE : Different GroupId For Each Library / Module, So That Each Library Is Not Overwritten
            groupId = "com.github.alitafreshi"

            // Library Name / Module Name (Example : "androidfirstlib")
            // NOTE : Different ArtifactId For Each Library / Module, So That Each Library Is Not Overwritten
            artifactId = "ayan-subvention-domain"

            // Version Library Name (Example : "1.0.0")
            version = "0.0.1"
        }
    }
}
