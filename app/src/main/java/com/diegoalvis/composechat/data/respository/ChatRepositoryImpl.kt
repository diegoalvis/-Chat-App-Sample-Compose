package com.diegoalvis.composechat.data.respository

import com.diegoalvis.composechat.data.model.Conversation
import com.diegoalvis.composechat.data.model.Message
import kotlinx.coroutines.flow.Flow

class ChatRepositoryImpl: ChatRepository {

    override suspend fun getConversationList(): List<Conversation> {
        TODO("Not yet implemented")
    }

    override suspend fun getConversation(id: String): Conversation {
        TODO("Not yet implemented")
    }

    override fun getMessages(conversationId: String): Flow<Message> {
        TODO("Not yet implemented")
    }

}