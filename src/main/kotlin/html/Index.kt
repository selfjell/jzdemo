package no.eksempel.html

import kotlinx.html.*

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
    }
}