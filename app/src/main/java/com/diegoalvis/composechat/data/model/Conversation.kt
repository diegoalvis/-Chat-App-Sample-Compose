package com.diegoalvis.composechat.data.model

data class Conversation(
    val id: String,
    val startedAt: Double,
    val participants: List<Participant>,
    val lastMessage: String,
)

data class Participant(
    val id: String,
    val name: String,
    val photo: String,
    val status: ParticipantStatus,
    val lastTimeActive: String,
)

enum class ParticipantStatus {
    ONLINE,
    OFFLINE,
    BLOCKED,
}