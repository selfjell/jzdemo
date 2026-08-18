# jzdemo - You don't need a frontend, you just need Kotlin

## Examples
### HTMX and Alpine
You will find code examples from the slides for HTMX and Alpine under `/resources/static/HTML-examples.html`.
The working equivalents for these are found under `/resources/static/html`

### Demo
The code for the main demo is found in the `kotlin` package. 
### How to run
To start the app use Intellij to run `main.kt` or by following 
the instructions from the generator below. 

The page will be available on `localhost:8080`

## KTor generator
This project was created using the [Ktor Project Generator](https://start.ktor.io).

Here are some useful links to get you started:
 * [Ktor Documentation](https://ktor.io/docs/home.html)
 * [Ktor GitHub page](https://github.com/ktorio/ktor)
 * [Ktor Slack chat](https://app.slack.com/client/T09229ZC6/C0A974TJ9). [Request an invite](https://surveys.jetbrains.com/s3/kotlin-slack-sign-up).


## Features
Here's a list of features included in this project:

| Name                                                              | Description                                                                                   |
|-------------------------------------------------------------------|-----------------------------------------------------------------------------------------------|
| [HTML DSL](https://start.ktor.io/p/org.jetbrains/server-html-dsl) | Generates HTML from Kotlin DSL                                                                |
| [HTMX](https://start.ktor.io/p/io.ktor/server-htmx)               | Introduces a set of extensions for templating HTMX from your server using the Kotlin HTML DSL |


## Building & Running
To build or run the project, use one of the following tasks:


| Task                                                       | Description       |
|------------------------------------------------------------|-------------------|
| `./mvnw test`                                              | Run the tests     |
| `./mvnw package`                                           | Build the project |
| `java -jar target/jzdemo`-0.0.1-jar-with-dependencies.jar` | Run the server    |

If the server starts successfully, you'll see the following output:
```
2024-12-04 14:32:45.584 [main] INFO  Application - Application started in 0.303 seconds.
2024-12-04 14:32:45.682 [main] INFO  Application - Responding at http://0.0.0.0:8080
```
