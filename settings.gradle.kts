pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AppRickAndMortyTest"
include(":app")
include(":core:common")
include(":core:network")
include(":core:firebase")
include(":core:model")
include(":feature:login")
include(":feature:home")
include(":navigation")

include(":data:auth")
include(":domain:auth")
