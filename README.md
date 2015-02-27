dropwizard-swagger-sample-app
=============================

This sample DropWizard application demonstrates the use of the [dropwizard-swagger](https://github.com/federecio/dropwizard-swagger) project

How to run it (from your IDE)
----------------------------

Run the main method in the class SampleApplication.java using the following arguments: "server src/main/resources/sample-config.yaml"

How to run it (command line)
----------------------------

* `cd` into the project's directory
* `mvn clean package`
* `java -jar target/dropwizard-swagger-sample-app-1.0-SNAPSHOT.jar server src/main/resources/sample-config.yaml`
* Open your browser and hit http://localhost:9999/swagger


Sample URLs
-----------
* [http://localhost:9999/admin](http://localhost:9999/admin)

* [http://localhost:9999/api/sample](http://localhost:9999/api/sample)
* [http://localhost:9999/api/sample/hello-with-path-param/First Last](http://localhost:9999/api/sample/hello-with-path-param/First Last)
* [http://localhost:9999/api/sample/hello-with-query-param?name=First Last](http://localhost:9999/api/sample/hello-with-query-param?name=First Last)
* [http://localhost:9999/api/swagger](http://localhost:9999/api/swagger)


* [http://localhost:9999/](http://localhost:9999/)
* [http://localhost:9999/assets/sample-file.txt](http://localhost:9999/assets/sample-file.txt)