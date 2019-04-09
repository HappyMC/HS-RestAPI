package me.devnatan.hsapi.kotlin

import kotlinx.coroutines.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

@InternalCoroutinesApi
class HappyShopTest {

    companion object {

        @BeforeAll @JvmStatic
        fun initialize() {
            HappyShop.PATH = "http://localhost:8081"
        }

    }

    @Nested
    inner class GetShop {
        @Test
        fun `get all shops`() {
            runBlocking {
                val (_, response, result) = withContext(Dispatchers.IO) {
                    HappyShop.getShops()
                }

                assertEquals(200, result.code)
                assertEquals("OK", response.responseMessage)
            }
        }


        @Test
        fun `get all shops asynchronously`() {
            GlobalScope.launch(Dispatchers.IO) {
                val (_, response, result) = async {
                    HappyShop.getShops()
                }.await()

                assertEquals(200, result.code)
                assertEquals("OK", response.responseMessage)
            }
        }
    }

}