object Build {
    private const val gradleBuildTools = "7.2.0"
    const val buildTools = "com.android.tools.build:gradle:${gradleBuildTools}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
    const val kaptGradlePlugin = "org.jetbrains.kotlin.kapt:${Kotlin.version}"
}
