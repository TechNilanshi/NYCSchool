package com.example.a20240923_nilanshi_nycschool.utils

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow

object EventBus {
    private val _events = Channel<Any> {  }
    val event = _events.receiveAsFlow()

    suspend fun sendEvent(event: Any){
        _events.send(event)
    }
}

sealed class Event{
    data class Toast(val message : String): Event()
}