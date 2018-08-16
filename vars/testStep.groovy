import inflowz.delivery.commonHelpers

def call(body) {
    // evaluate the body block, and collect configuration into the object
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()


    def commonHelpers = new commonHelpers(this)

	echo "Running the JB test shared library"
}
