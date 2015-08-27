1. The Coding Challenge!
* Implement a Java web application that meets the API specification below using this maven project
* Implement the DocumentServlet.java source file in the com.citrix.interview package
* Java EE 7 Servlet Tutorial: http://docs.oracle.com/javaee/7/tutorial/doc/servlets.htm#BNAFD
* Java EE 7 Javadocs: http://docs.oracle.com/javaee/7/api/

2. Project Organization
* JDK 1.7 is required!
* Project is organized using the standard maven (http://maven.apache.org/) webapp structure
* The only dependency is the Java EE 7 API jar
* The jetty plugin (http://www.eclipse.org/jetty/documentation/) is included for quick/easy deployment of the webapp
* To deploy/run the document storage webapp, simply run the command: mvn clean jetty:run
* The jetty container runs on port 8080
* The application is accessible via http://localhost:8080/documents...

3. End-To-End Testing
* Test the deployed web application using an HTTP client
* curl unix command (examples inline below)
* RESTClient Firefox plugin: https://addons.mozilla.org/en-US/firefox/addon/restclient/

4. Code Submission
* To generate a zip file for submission, simply run the command: mvn clean assembly:single

5. API Specification
* The Document Storage Service is a simple RESTful web service
* Clients can create, update, query, and delete documents
* A document can be anything - text, image, pdf, etc

5.1 Create Document
* A document can be created by sending a POST request with document contents to /documents
* The document content is simply the HTTP request payload
* All content/media types are supported
* The content of the POST response is a unique alphanumeric document ID with a length of 20 characters
* The HTTP response has a 201 Created status code
* curl http://localhost:8080/documents -d 'hello world'

5.1.1 Sample Create Request
------------------------------------------------
|POST /documents                               |
|Content-Length: 11                            |
|                                              |
|hello world                                   |
------------------------------------------------

5.1.2 Sample Create Response
------------------------------------------------
|201 Created                                   |
|Content-Length: 20                            |
|                                              |
|ONWZ4UUVV8S31JCB662P                          |
------------------------------------------------

5.2 Query Document
* A document can be queried by sending a GET request to /documents/{docId}, where {docId} is the document ID issued during creation
* The content of the GET response is the document exactly as it was created
* On success, a 200 OK response is sent
* A 404 Not Found HTTP response is returned if the document ID is invalid
* curl http://localhost:8080/documents/ONWZ4UUVV8S31JCB662P

5.2.1 Sample Query Request
------------------------------------------------
|GET /documents/ONWZ4UUVV8S31JCB662P           |
------------------------------------------------

5.2.2 Sample Query Response
------------------------------------------------
|200 OK                                        |
|Content-Length: 11                            |
|                                              |
|hello world                                   |
------------------------------------------------

5.3 Delete Document
* A document can be deleted by sending a DELETE request with no content to /documents/{docId}, where {docId} is the document ID issued during creation
* On success, a 204 No Content HTTP response is sent
* A 404 Not Found HTTP response is returned if the document ID is invalid
* curl -X DELETE http://localhost:8080/documents/ONWZ4UUVV8S31JCB662P

5.3.1 Sample Delete Request
------------------------------------------------
|DELETE /documents/ONWZ4UUVV8S31JCB662P        |
------------------------------------------------

5.3.2 Sample Delete Response
------------------------------------------------
|204 No Content                                |
------------------------------------------------