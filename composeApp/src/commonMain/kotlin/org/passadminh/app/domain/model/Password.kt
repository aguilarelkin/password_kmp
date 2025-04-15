package org.passadminh.app.domain.model

data class Password(
    val id: String,
    val title: String,
    val username: String,
    val passwordEncrypted: String,
    val url: String? = null,
    val notes: String? = null,
    val userId: String
)
