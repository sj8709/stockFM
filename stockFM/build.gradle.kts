plugins {
	java
	id("org.springframework.boot") version "3.2.2"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-jdbc")
	implementation("org.springframework.boot:spring-boot-starter-oauth2-authorization-server")
	implementation("org.springframework.boot:spring-boot-starter-oauth2-client")
	implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.thymeleaf.extras:thymeleaf-extras-springsecurity6")
	compileOnly("org.projectlombok:lombok")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	runtimeOnly("com.oracle.database.jdbc:ojdbc11")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.security:spring-security-test")
	
	// https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
	implementation("org.seleniumhq.selenium:selenium-java:4.17.0")
	// https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver
	implementation("org.seleniumhq.selenium:selenium-chrome-driver:4.17.0")
	// https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager
	implementation("io.github.bonigarcia:webdrivermanager:5.6.3")
	
	
	
	
}

tasks.withType<Test> {
	useJUnitPlatform()
}
