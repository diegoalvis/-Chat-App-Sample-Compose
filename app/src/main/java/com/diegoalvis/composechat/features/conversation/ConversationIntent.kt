package com.diegoalvis.composechat.features.conversation

sealed class ConversationIntent {

    data object LoadConversationInfo: ConversationIntent()

    data object LoadMessages: ConversationIntent()

    data class SendMessage(val content: String): ConversationIntent()

    data class DeleteMessage(val id: String): ConversationIntent()
}