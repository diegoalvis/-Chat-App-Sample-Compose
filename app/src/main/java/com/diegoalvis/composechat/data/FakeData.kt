package com.diegoalvis.composechat.data

import com.diegoalvis.composechat.data.model.Conversation
import com.diegoalvis.composechat.data.model.Message
import com.diegoalvis.composechat.data.model.Participant
import com.diegoalvis.composechat.data.model.ParticipantStatus


val mockMessagesMessage = listOf(
    Message(
        id = "PmM1wI",
        date = "2024/03/17 08:00 PM",
        isUserMe = true,
        content = "Message content 1"
    ),
    Message(
        id = "TgnneT",
        date = "2024/03/17 08:02 PM",
        isUserMe = false,
        content = "Message content 3"
    ),
    Message(
        id = "ORd1w2",
        date = "2024/03/17 08:03 PM",
        isUserMe = true,
        content = "Message content 4"
    ),
    Message(
        id = "Di1TXJ",
        date = "2024/03/17 08:04 PM",
        isUserMe = true,
        content = "Message content 5"
    ),
    Message(
        id = "ihffpa",
        date = "2024/03/17 08:05 PM",
        isUserMe = false,
        content = "Message content 6"
    ),
    Message(
        id = "55br9h",
        date = "2024/03/17 08:06 PM",
        isUserMe = false,
        content = "Message content 7"
    ),
    Message(
        id = "r9I7CE",
        date = "2024/03/17 08:07 PM",
        isUserMe = false,
        content = "Message content 8"
    ),
    Message(
        id = "dlGnxJ",
        date = "2024/03/17 08:08 PM",
        isUserMe = false,
        content = "Message content 9"
    ),
    Message(
        id = "0zYxyI",
        date = "2024/03/17 08:09 PM",
        isUserMe = true,
        content = "Message content 10"
    ),
    Message(
        id = "zijmlv",
        date = "2024/03/17 08:10 PM",
        isUserMe = true,
        content = "Message content 11"
    ),
    Message(
        id = "Q6iiSK",
        date = "2024/03/17 08:11 PM",
        isUserMe = false,
        content = "Message content 12"
    ),
    Message(
        id = "gogEG7",
        date = "2024/03/17 08:12 PM",
        isUserMe = true,
        content = "Message content 13"
    ),
    Message(
        id = "GkNbmw",
        date = "2024/03/17 08:13 PM",
        isUserMe = false,
        content = "Message content 14"
    ),
    Message(
        id = "xh03gE",
        date = "2024/03/17 08:14 PM",
        isUserMe = true,
        content = "Message content 15"
    ),
    Message(
        id = "NrUte4",
        date = "2024/03/17 08:15 PM",
        isUserMe = false,
        content = "Message content 16"
    ),
    Message(
        id = "jOe7a1",
        date = "2024/03/17 08:16 PM",
        isUserMe = true,
        content = "Message content 17"
    ),
    Message(
        id = "PUqKzo",
        date = "2024/03/17 08:01 PM",
        isUserMe = false,
        content = "Compose newbie: I’ve scourged the internet for tutorials about async data " +
                "loading but haven’t found any good ones" +
                "What’s the recommended way to load async data and emit composable widgets?",
    )
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