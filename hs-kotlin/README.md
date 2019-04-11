# hs-kotlin
Quick example:
```kotlin
fun printShopsAsynchronously() {
  launch {
    /*
     * Multi-declaration
     * https://kotlinlang.org/docs/reference/multi-declarations.html
     */
    val (request, response, result) = HappyShop.getShops()

    // Await result and...
    println("OK! Process completed.")
    println(result.message)
  }

  println("Hey, I was called before finishing!")
}
```
