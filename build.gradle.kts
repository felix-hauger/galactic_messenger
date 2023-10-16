plugins {
    id("java")
}

group = "org.galacticmessenger"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.hibernate:hibernate-core:5.5.6.Final")
    implementation("org.mariadb.jdbc:mariadb-java-client:2.7.4")
}

tasks.test {
    useJUnitPlatform()
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "org.galacticmessenger.Main"
    }
}