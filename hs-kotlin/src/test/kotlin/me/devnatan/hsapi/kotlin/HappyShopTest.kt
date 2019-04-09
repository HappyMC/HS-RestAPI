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
            HappyShop.PATH = "..."
        }

    }

    @Nested
    inner class GetShop {

        @Test
        fun `get all shops`() {
            val (_, response, result) = runBlocking {
                HappyShop.getShops()
            }

            assertEquals(200, result.code)
            assertEquals("OK", response.responseMessage)
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

            // ...do something
        }

        @Test
        fun `try to get unauthorized`() {
            HappyShop.API_TOKEN = "wtf!?"
            val (_, _, result) = runBlocking {
                HappyShop.getShops()
            }

            // 401 Unauthorized
            assertEquals(401, result.code)
        }

    }

}