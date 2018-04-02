package com.ratanparai.helloworld

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


class AppTests {

    @Test
    fun `greeting should return hello world`(){
        assertEquals("Hello World!", App.greeting())
    }

    @Test
    fun `greeting should return something`(){
        assertNotNull(App.greeting())
    }

    @Test
    fun `the app should run without any exception`(){
        App.main(emptyArray())
    }
}