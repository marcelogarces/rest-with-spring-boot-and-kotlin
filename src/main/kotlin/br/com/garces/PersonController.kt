package br.com.garces

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class PersonController {

    val counter: AtomicLong = AtomicLong()

    @RequestMapping("/hello")
    fun hello(@RequestParam(value = "name") name: String?): Person{
        return Person(counter.incrementAndGet(),"Welcome $name!")
    }

}