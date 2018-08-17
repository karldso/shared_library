def call(args) {
      return sh (script: "echo 'Running the JB test shared library'", returnStdout: true)
}
