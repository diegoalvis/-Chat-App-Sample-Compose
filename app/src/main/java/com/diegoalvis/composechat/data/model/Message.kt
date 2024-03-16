package com.diegoalvis.composechat.data.model

data class Message(
    val id: String,
    val date: String,
    val isUserMe: Boolean,
    val content: String
)