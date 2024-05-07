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
    versionCatalogs {
        create("core") {
            from(files("version-catalog/core.toml"))
        }
        create("database") {
            from(files("version-catalog/database.toml"))
        }
        create("network") {
            from(files("version-catalog/network.toml"))
        }
        create("test") {
            from(files("version-catalog/test.toml"))
        }

    }
}

rootProject.name = "Eisenhower Matrix"
include(":app")
 