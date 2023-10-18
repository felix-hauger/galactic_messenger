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
    implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")
    testImplementation("com.h2database:h2:2.2.224")
}

tasks.test {
    useJUnitPlatform()
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "org.galacticmessenger.Main"
    }
}