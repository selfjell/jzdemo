package no.eksempel.html

import kotlinx.html.*

fun DIV.superContent() {
    img {
        src = "static/assets/grug.png"
    }
    h2 {
        +"best weapon against complexity spirit demon is magic word: \"no\""
    }
}