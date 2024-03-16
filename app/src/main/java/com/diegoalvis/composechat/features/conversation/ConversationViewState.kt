package com.diegoalvis.composechat.features.conversation

import com.diegoalvis.composechat.data.model.Conversation
import com.diegoalvis.composechat.data.model.Message

data class ConversationViewState (
    val isLoading: Boolean,
    val conversation: Conversation?,
    val messages: List<Message>,
    val error: String? = null,
)