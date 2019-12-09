package me.devnatan.hsorg.sdk.kotlin.types.store

import java.time.Instant

interface HSStore {

    /**
     * Unique store identification field.
     */
    val id: String

    /**
     * Store name.
     */
    val name: String

    /**
     * Description of the store.
     */
    val description: String

    /**
     * Logo image hash.
     */
    val logo: String?

    /**
     * Returns the availability status of the store, whether it is `online` or `offline`.
     */
    val status: String

    /**
     * Date the store was created.
     */
    val createdAt: Instant

    /**
     * Last time there was any modification to the store structure.
     */
    val updatedAt: Instant

}