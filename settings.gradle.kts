rootProject.name = "test-jacoco-compose"

dependencyResolutionManagement {
  versionCatalogs {
    create("libs") {
      val compose = version("compose", "1.5.12")
      val junit5 = version("junit5", "5.7.0")
      plugin("kotlin", "org.jetbrains.kotlin.jvm").version("1.9.22")
      plugin("compose", "org.jetbrains.compose").versionRef(compose)
      library("junit-api", "org.junit.jupiter", "junit-jupiter-api").versionRef(junit5)
      library("junit-engine", "org.junit.vintage", "junit-vintage-engine").versionRef(junit5)
    }
  }
}
