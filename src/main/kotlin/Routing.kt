package no.eksempel

import io.ktor.http.ContentType
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.html.*
import io.ktor.server.http.content.staticResources
import kotlinx.html.*
import kotlinx.html.stream.createHTML
import no.eksempel.html.index
import no.eksempel.html.renderResourceFetchingButton

fun Application.configureRouting() {
    routing {
        staticResources("/static", "static")

        get("/") {
            val html = createHTML().html { index() }
            call.respondText(html, ContentType.Text.Html)
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