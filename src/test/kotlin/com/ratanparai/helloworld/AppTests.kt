package com.ratanparai.helloworld

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class AppTests {

    @Test
    fun `greeting should return hello world`(){
        Assertions.assertEquals("Hello World!", App.greeting())
    }
}