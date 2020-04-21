def call(Map config=[:], Closure body) {
    node {
        git url: "https://github.com/werne2j/sample-nodejs"

        stage("Install") {
            echo "npm install"
        }

        stage("Test") {
            echo "npm test"
        }

        stage("Deploy") {
            if (config.deploy) {
                echo "npm publish"
            }
        }

        body()
    }
}
