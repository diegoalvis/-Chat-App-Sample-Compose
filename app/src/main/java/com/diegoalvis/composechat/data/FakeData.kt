package com.diegoalvis.composechat.data

import com.diegoalvis.composechat.data.model.Conversation
import com.diegoalvis.composechat.data.model.Message
import com.diegoalvis.composechat.data.model.Participant
import com.diegoalvis.composechat.data.model.ParticipantStatus


val mockMessagesMessage = listOf(
    Message("PmM1wI", "2024/03/17 08:00 PM", "Message content 1"),
    Message(
        "PUqKzo", "2024/03/17 08:01 PM",
        "" +
                "Compose newbie: I’ve scourged the internet for tutorials about async data " +
                "loading but haven’t found any good ones" +
                "What’s the recommended way to load async data and emit composable widgets?",
    ),
    Message("TgnneT", "2024/03/17 08:02 PM", "Message content 3"),
    Message("ORd1w2", "2024/03/17 08:03 PM", "Message content 4"),
    Message("Di1TXJ", "2024/03/17 08:04 PM", "Message content 5"),
    Message("ihffpa", "2024/03/17 08:05 PM", "Message content 6"),
    Message("55br9h", "2024/03/17 08:06 PM", "Message content 7"),
    Message("r9I7CE", "2024/03/17 08:07 PM", "Message content 8"),
    Message("dlGnxJ", "2024/03/17 08:08 PM", "Message content 9"),
    Message("0zYxyI", "2024/03/17 08:09 PM", "Message content 10"),
    Message("zijmlv", "2024/03/17 08:10 PM", "Message content 11"),
    Message("Q6iiSK", "2024/03/17 08:11 PM", "Message content 12"),
    Message("gogEG7", "2024/03/17 08:12 PM", "Message content 13"),
    Message("GkNbmw", "2024/03/17 08:13 PM", "Message content 14"),
    Message("xh03gE", "2024/03/17 08:14 PM", "Message content 15"),
    Message("NrUte4", "2024/03/17 08:15 PM", "Message content 16"),
    Message("jOe7a1", "2024/03/17 08:16 PM", "Message content 17"),
    Message("jOnB5g", "2024/03/17 08:17 PM", "Message content 18"),
    Message("FQKCZf", "2024/03/17 08:18 PM", "Message content 19"),
    Message("8GgjdU", "2024/03/17 08:19 PM", "Message content 20")
)


val participantsMock = listOf(
    Participant(
        id = "p1",
        name = "Alice",
        photo = "http://example.com/photo1.jpg",
        status = ParticipantStatus.ONLINE,
        lastTimeActive = "2024-03-17 12:34 PM"
    ),
    Participant(
        id = "p2",
        name = "Bob",
        photo = "http://example.com/photo2.jpg",
        status = ParticipantStatus.OFFLINE,
        lastTimeActive = "2024-03-17 12:35 PM",
    ),
    Participant(
        id = "p3",
        name = "Charlie",
        photo = "http://example.com/photo3.jpg",
        status = ParticipantStatus.BLOCKED,
        lastTimeActive = "2024-03-17 12:36 PM",
    )
)


val conversationExample1 = listOf(
    Conversation(
        id = "c1",
        startedAt = 10499.699,
        participants = participantsMock.subList(0, 1),
        lastMessage = mockMessagesMessage.last().content,
    ),
    Conversation(
        id = "c2",
        startedAt = 75531.177,
        participants = participantsMock.subList(1, 2),
        lastMessage = mockMessagesMessage.last().content,
    )
)