package org.example

import kotlinx.coroutines.*

@OptIn(DelicateCoroutinesApi::class)
fun canInitiatePayment(): Deferred<Boolean> = GlobalScope.async {
    // Simulate an asynchronous operation
    kotlinx.coroutines.delay(1000)

    // Simulate a condition
    val condition = /* Your condition here, e.g., check if intent is not null */ true

    // Return the result
    condition
}

fun main() = runBlocking {
    // Example usage
    val result = canInitiatePayment().await()
    println("Can initiate payment: $result")
}
