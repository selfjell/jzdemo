package no.eksempel

import io.ktor.http.ContentType
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.html.*
import kotlinx.html.*
import kotlinx.html.stream.createHTML

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello, World!")
        }
        get("/html-dsl") {
            call.respondHtml {
                body {
                    h1 { +"HTML" }
                    ul {
                        for (n in 1..10) {
                            li { +"$n" }
                        }
                    }
                }
            }
        }

        get("/resource") {
            val html = createHTML().button {
                renderResourceFetchingButton("#replaceable")
            }
            call.respondText(html, ContentType.Text.Html)
        }
    }
}