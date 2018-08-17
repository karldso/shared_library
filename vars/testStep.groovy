def call(args) {
      echo "Running the JB test shared library with argument ${args}"
      return sh(script: "echo "Running the JB test shared library with argument ${args}", returnStdout: true)
}
