tasks {
    register("run") {
        dependsOn(gradle.includedBuild("app").task(":run"))
        group = "Application"
        description = "Runs the :app project :run task"
    }
}