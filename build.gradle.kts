plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.liquibase:liquibase-core:4.29.1")
    implementation("com.mysql:mysql-connector-j:8.4.0")
    implementation("org.projectlombok:lombok:1.18.34")
    implementation("javax.xml.bind:jaxb-api:2.3.1") // Required for Liquibase
    implementation("org.yaml:snakeyaml:2.2") // If using YAML changelogs

    annotationProcessor("org.projectlombok:lombok:1.18.34")
}

tasks.test {
    useJUnitPlatform()
}