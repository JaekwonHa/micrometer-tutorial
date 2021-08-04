package com.example.micrometerdemo

import io.micrometer.core.annotation.Timed
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class MicrometerTutorialApplication {

    @Timed(value = "get-hello")
    @GetMapping("/hello")
    fun getHello(): String {
        return "hello !"
    }
}

fun main(args: Array<String>) {
    runApplication<MicrometerTutorialApplication>(*args)
}
