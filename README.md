This is an example project for using [Geb](http://geb.codehaus.org/ "Geb - Groovy Browser Automation") (0.6 or later) with the [Cuke4Duke](http://wiki.github.com/cucumber/cuke4duke/ "Home - cuke4duke - GitHub") testing framework.

This example is a [Maven](http://maven.apache.org/ "Maven - Welcome to Apache Maven") project and uses the [Maven Cuke4Duke plugin](http://wiki.github.com/cucumber/cuke4duke/maven "Maven - cuke4duke - GitHub").

The first time you run this you need to run:

    mvn -Dcucumber.installGems=true integration-test

After that you can just run:

    mvn integration-test

Please see the `src/test/resources/GebConfig.groovy` file for how to run the tests with different browsers.