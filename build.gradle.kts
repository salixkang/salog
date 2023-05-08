plugins {
	java
	id("org.springframework.boot") version "3.0.4"
	id("io.spring.dependency-management") version "1.1.0"
}

group = "com.myblog"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.projectlombok:lombok:1.18.22")
	implementation("org.projectlombok:lombok:1.18.22")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	annotationProcessor("org.projectlombok:lombok")
	runtimeOnly("com.h2database:h2")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("nz.net.ultraq.thymeleaf:thymeleaf-layout-dialect")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
