package no.eksempel.html

import io.ktor.htmx.html.hx
import io.ktor.utils.io.ExperimentalKtorApi
import kotlinx.html.*

@OptIn(ExperimentalKtorApi::class)
fun HTML.index() {
    lang = "en"
    head {
        title { +"JZ26 Demo" }
        script {
            src = "https://cdn.jsdelivr.net/npm/htmx.org@2.0.10/dist/htmx.min.js"
            crossorigin = ScriptCrossorigin.anonymous
            integrity= "sha384-H5SrcfygHmAuTDZphMHqBJLc3FhssKjG7w/CeCpFReSfwBWDTKpkzPP8c+cLsK+V"

        }
        script {
            defer = true
            src ="https://cdn.jsdelivr.net/npm/alpinejs@3.15.12/dist/cdn.min.js"
        }
        link {
            rel = "stylesheet"
            href = "/static/css/styles.css"
        }
        link {
            rel = "icon"
            href = "/static/assets/favicon.ico"
        }
        meta {
            name = "viewport"
            content = "width=device-width, initial-scale=1.0"
        }
    }
    body {
        h1 {
            +"Hello JavaZone!"
        }
        div {
            id = "replaceable"
            attributes["x-data"] = "{ isLoading: false, errorMessage: '' }"
            div {
                attributes["x-show"] = "errorMessage !== ''"
                p {
                   attributes["x-text"] = "errorMessage"
                }
            }
            h2 {
                +"Would you like some more content?"
            }
            button {
                attributes.hx {
                    get = "/content"
                    target = "#replaceable"
                    trigger = "click throttle:1s"
                    swap = "innerHTML"
                }
                attributes["x-on:htmx:before-request"] = "isLoading = true;"
                attributes["x-on:htmx:after-request"] = "isLoading = false;"
                attributes["x-on:htmx:send-error"] = "errorMessage = 'Could not communicate with the server';"
                attributes["x-on:htmx:response-error"] = "errorMessage = \$event.detail.xhr.responseText;"
                +"Yes"
            }
            div {
                attributes["x-show"] = "isLoading"
                p {
                    +"Loading.."
                }
            }
        }
    }
}