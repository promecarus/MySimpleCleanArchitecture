package com.bangkit.mysimplecleanarchitecture.data

import com.bangkit.mysimplecleanarchitecture.domain.IMessageRepository

class MessageRepository(
    private val messageDataSource: IMessageDataSource,
) : IMessageRepository {
    override fun getWelcomeMessage(
        name: String,
    ) = messageDataSource.getMessageFromSource(
        name,
    )
}
