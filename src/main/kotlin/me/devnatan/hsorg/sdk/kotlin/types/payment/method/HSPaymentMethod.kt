package me.devnatan.hsorg.sdk.kotlin.types.payment.method

interface HSPaymentMethod {

    /**
     * Payment method unique short id.
     */
    val id: String

    /**
     * Payment method name.
     * Cannot be acronyms or any shortened forms, must be full method name.
     */
    val name: String

    /**
     * Current status of the payment method, in this case, its availability.
     */
    val status: String

    /**
     * Secure URL of the official payment method website.
     */
    val url: String

}