package com.bangkit.mysimplecleanarchitecture.data

import com.bangkit.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(
        name: String,
    ): MessageEntity = MessageEntity(
        welcomeMessage = "Hello $name! Welcome to Clean Architecture",
    )
}
