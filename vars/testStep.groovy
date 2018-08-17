def call(args) {
      return sh (script: "Running the JB test shared library ${args}", returnStdout: true)
}
