package com.mumumusuc.loader

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class NativeLoaderTest {
    @Test
    fun test() {
        assertDoesNotThrow {
            NativeLoader.load("test", NativeLoader.javaClass)
        }
        assertDoesNotThrow {
            NativeLoader.load("test")
        }
        assertDoesNotThrow {
            sayHello()
        }
    }

    private external fun sayHello()
}