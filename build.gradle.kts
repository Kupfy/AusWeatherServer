

plugins {
    java
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

version = "1.2.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.hibernate:hibernate-core:3.6.7.Final")
}

sourceSets {
    main {
        java {
            setSrcDirs(listOf("main"))
        }
    }

    test {
        java {
            setSrcDirs(listOf("test"))
        }
    }
}
