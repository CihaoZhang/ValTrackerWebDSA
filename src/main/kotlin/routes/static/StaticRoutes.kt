package routes.static

import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.registerStaticRoutes() {
    routing {
        static()
    }
}
