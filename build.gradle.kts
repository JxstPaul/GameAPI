plugins {
    id("java")
}

group = "de.Paul"
version = "1.0.10"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.17-R0.1-SNAPSHOT")
}

tasks {
    processResources {
        from(sourceSets.main.get().resources.srcDirs()) {
            filesMatching("plugin.yml") {
                expand(
                    "name" to rootProject.name,
                    "version" to version
                )
            }; duplicatesStrategy = DuplicatesStrategy.INCLUDE
        }
    }

    compileJava {
        options.encoding = "UTF-8"
    }
}
