package com.bytesizedapi.plugins

import com.bytesizedapi.UserInfo
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    routing {

        //Requests
        get("/") {

            println("URI: ${call.request.uri}") // '/'
            println("Headers: ${call.request.headers.names()}")
            println("User-Agent: ${call.request.headers["User-Agent"]}")
            println("Accept: ${call.request.headers["Accept"]}")
            println("Accept-Encoding: ${call.request.headers["Accept-Encoding"]}")
            println("Query Params: ${call.request.queryParameters.names()}")
            println("Name: ${call.request.queryParameters["name"]}")
            println("Email: ${call.request.queryParameters["email"]}")


            call.respondText("Hello World!")
        }
        //URL parameters
        get("/iphones/{page}") {
            val pageNumber = call.parameters["page"]

            call.respondText("You are on a page number: $pageNumber")
        }

        post("/login") {
            val userInfo = call.receive<UserInfo>()
            println(userInfo)
            call.respondText("Everything working")
        }

    }
}