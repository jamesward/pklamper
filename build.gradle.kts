plugins {
  id("org.pkl-lang") version "0.25.1"
}

pkl {
  project {
    packagers {
      register("makePackages") {
        environmentVariables.put("VERSION", System.getenv("VERSION"))
        projectDirectories.from(file("src/"))
      }
    }
  }
  // ./gradlew pkldoc
  // An unexpected error has occurred. Would you mind filing a bug report?
  /*
  pkldocGenerators {
    register("pkldoc") {
      sourceModules.addAll(files("src/doc-package-info.pkl", "src/project.pkl"))
    }
  }
   */
}
