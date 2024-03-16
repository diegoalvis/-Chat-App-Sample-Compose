package com.diegoalvis.composechat.features.conversation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.InputChip
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.diegoalvis.composechat.data.mockMessagesMessage
import com.diegoalvis.composechat.data.model.Conversation
import com.diegoalvis.composechat.data.model.Message
import com.diegoalvis.composechat.theme.AppTheme


@Composable
fun ConversationScreen(
    modifier: Modifier = Modifier,
    uiViewState: ConversationViewState,
    navigateToParticipant: (String) -> Unit,
    onNavIconPressed: () -> Unit,
) {

    val scrollState = rememberLazyListState()

    Scaffold(
        topBar = {
            // Add Top Bar
        }
    ) { paddingValues ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            MessageList(
                messages = uiViewState.messages,
                modifier = Modifier.weight(1f),
                scrollState = scrollState,
            )
        }
    }

}


@Composable
fun MessageList(
    modifier: Modifier = Modifier,
    scrollState: LazyListState,
    messages: List<Message>,
) {
    LazyColumn(
        reverseLayout = true,
        state = scrollState,
        modifier = Modifier
            .fillMaxSize()
    ) {
        for (index in messages.indices) {
//            val prevAuthor = messages.getOrNull(index - 1)?.author
//            val nextAuthor = messages.getOrNull(index + 1)?.author
            val message = messages[index]
//            val isFirstMessageByAuthor = prevAuthor != content.author
//            val isLastMessageByAuthor = nextAuthor != content.author

            item {
                MessageContent(
                    onAuthorClick = {},
                    message = message,
                    isFirstMessageByAuthor = true,
                    isLastMessageByAuthor = false,
                )
            }
        }
    }

}


@Composable
fun MessageContent(
    onAuthorClick: (String) -> Unit,
    message: Message,
    isFirstMessageByAuthor: Boolean,
    isLastMessageByAuthor: Boolean
) {
    val borderColor = if (message.isUserMe) {
        MaterialTheme.colorScheme.primary
    } else {
        MaterialTheme.colorScheme.tertiary
    }

    val spaceBetweenAuthors = if (isLastMessageByAuthor) Modifier.padding(top = 8.dp) else Modifier
    Row(modifier = spaceBetweenAuthors) {
        if (isLastMessageByAuthor) {
            // Avatar
            // Image(...)
        } else {
            Spacer(modifier = Modifier.width(74.dp))
        }
        val styledMessage = AnnotatedString(
            text = message.content,
        )

        val ChatBubbleShape = RoundedCornerShape(4.dp, 20.dp, 20.dp, 20.dp)

        Surface(
            color = borderColor,
            shape = ChatBubbleShape
        ) {
            ClickableText(
                text = styledMessage,
                style = MaterialTheme.typography.bodyLarge.copy(color = LocalContentColor.current),
                modifier = Modifier.padding(16.dp),
                onClick = {
                }
            )
        }
    }
}


@Composable
fun UserInput(
    modifier: Modifier = Modifier,
    selected: Boolean,
) {
    InputChip(
        selected = selected,
        onClick = { /*TODO*/ },
        label = {
            Text(text = "some text")
        },
    )
}


@Preview(showBackground = true)
@Composable
fun MessageContentPreview() {
    val msg = mockMessagesMessage.last()
    val isUserMe = false
    AppTheme {
        MessageContent(
            message = msg,
            onAuthorClick = {},
            isFirstMessageByAuthor = true,
            isLastMessageByAuthor = true,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ConversationScreenPreview() {
    val viewState = ConversationViewState(
        isLoading = true,
        conversation = null,
        messages = mockMessagesMessage,
    )

    AppTheme {
        ConversationScreen(
            uiViewState = viewState,
            navigateToParticipant = {
            },
            onNavIconPressed = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
fun UserIanputPreview() {
    Text(text = "asdasd")
}