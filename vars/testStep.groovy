def call(args) {
      return sh(script: 'echo "Running the JB test shared library with argument ${args}"', returnStdout: true)
}
