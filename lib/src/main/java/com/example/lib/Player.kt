package com.example.lib

class Player {
    internal enum class State {
        IDLE, PLAYING, PAUSED
    }

    private val state = State.IDLE
    fun pause() {
        when (state) {
            State.IDLE,
            State.PAUSED,

            State.PLAYING -> {
            }
        }
    }
}