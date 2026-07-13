package no.eksempel

import io.ktor.htmx.html.hx
import io.ktor.utils.io.ExperimentalKtorApi
import kotlinx.html.*

@OptIn(ExperimentalKtorApi::class)
fun BUTTON.renderResourceFetchingButton() {
    attributes.hx {
        get = "/resource"
        target = "#resource-container"
        swap = "beforeend"
        trigger = "customer-loaded-event from:body"
    }
}

@OptIn(ExperimentalKtorApi::class)
fun BUTTON.renderResourceFetchingButton(containerToReplace: String) {
    attributes.hx {
        get = "/resource"
        target = containerToReplace
        swap = "beforeend"
        trigger = "customer-loaded-event from:body"
    }
    +"Click this!"
}
