package no.eksempel

import io.ktor.http.ContentType
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.html.*
import io.ktor.server.http.content.staticResources
import io.ktor.server.request.receiveParameters
import kotlinx.html.*
import kotlinx.html.stream.createHTML
import no.eksempel.html.index
import no.eksempel.html.renderResourceFetchingButton
import no.eksempel.html.superContent

fun Application.configureRouting() {
    routing {
        staticResources("/static", "static")

        get("/") {
            val html = createHTML().html { index() }
            call.respondText(html, ContentType.Text.Html)
        }

        get("/content") {
            val html = createHTML().div { superContent() }
            call.respondText(html, ContentType.Text.Html)
        }

        get("/resource") {
            val html = createHTML().button {
                renderResourceFetchingButton("#replaceable")
            }
            call.respondText(html, ContentType.Text.Html)
        }

        get("/example") {
            val html = createHTML().div {
                p { +"Hello"}
            }
            call.respondText(html, ContentType.Text.Html)
        }

        put("/example") {
            val params = call.receiveParameters()
            val att1 = params["att1"] ?: ""
            val att2 = params["att2"] ?: ""
            val html = createHTML().div {
                p { +att1 }
                p { +att2 }
            }
            call.respondText(html, ContentType.Text.Html)
        }
    }
}