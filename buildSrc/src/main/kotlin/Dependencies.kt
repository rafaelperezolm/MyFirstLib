
object Versions {
    const val compose = "1.0.5"
}

object Dependencies {
    object Libraries {
        object Compose {
            const val material = "androidx.compose.material:material:${Versions.compose}"
            const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
            const val constraintlayout = "androidx.constraintlayout:constraintlayout-compose:1.0.0"
            const val coil = "io.coil-kt:coil-compose:1.4.0"
            val all = listOf(uiTooling, material, constraintlayout, coil)
        }
    }
}