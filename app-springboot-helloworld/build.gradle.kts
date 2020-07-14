
plugins {
    id("org.springframework.boot")
    id("application")
}

apply {
    plugin("io.spring.dependency-management")
}

application {
    this.mainClassName = "com.jimtough.gsk.app.springboot.HelloWorldSpringBootApp"
}

// Force the BootJar task to generate a JAR with the name: "springboot-helloworld.jar"
// I don't want the project name or version used, as it would have by default.
tasks.getByName<org.springframework.boot.gradle.tasks.bundling.BootJar>("bootJar") {
    archiveBaseName.set("springboot-helloworld")
    archiveVersion.set("")
}

dependencies {
    // Delcare the 'hello factory' and 'world factory' sibling (library) projects as dependencies
    implementation(project(":library-hello-factory"))
    implementation(project(":library-world-factory"))

    // Declare other regular dependencies that come from Maven Central (or whatever repo you declared in root project)
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
