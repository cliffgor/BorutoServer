package com.cliffgor.plugins

import com.cliffgor.routes.getAllHeroes
import com.cliffgor.routes.root
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        root()
        getAllHeroes()
    }
}
