// This plugin is needed for library projects that produce a single JAR as output
apply<JavaLibraryPlugin>()

dependencies {
	// This library uses Google Guava internally, but is it not exposed in any public API.
	// Example of 'implementation' dependency scope.
	implementation("com.google.guava:guava:27.1-jre")
}
