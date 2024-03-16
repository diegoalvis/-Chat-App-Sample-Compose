package com.diegoalvis.composechat.data.respository

import com.diegoalvis.composechat.data.model.Conversation
import com.diegoalvis.composechat.data.model.Message
import kotlinx.coroutines.flow.Flow

interface ChatRepository {

    suspend fun getConversationList(): List<Conversation>

    suspend fun getConversation(id: String): Conversation

    fun getMessages(conversationId: String): Flow<Message>

}