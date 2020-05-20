package com.provectus_it.bookme

import org.threeten.bp.Duration

object Constants {
    const val DB_VERSION = 1
    const val DB_TABLE_NAME = "bookme"

    var ROOM_NAME = "Chicago"
    var ROOM_ID = if (BuildConfig.DEBUG) "70428341430" else "ID SHOULD BE HERE"
    var BASE_URL = if (BuildConfig.DEBUG) "http://bookme-qa.provectus-it.com" else "ENDPOINT SHOULD BE HERE"
    var WEBSOCKET_URL = if (BuildConfig.DEBUG) "wss://bookme-qa.provectus-it.com/notify" else "ENDPOINT SHOULD BE HERE"
    var SESSION_ID = if (BuildConfig.DEBUG) {
        "bookme.pub_18845qdbvm6qqis5jsu6cvfhv9a6k6gb6so38cho6cq32d1j60@resource.calendar.google.com"
    } else {
        "ID SHOULD BE HERE"
    }

    const val AMPLITUDE_API_KEY = "1a08a21146675e30f3ff4bd58132eb8d"

    const val MINUTES_IN_HOUR = 60
    val DURATIONS = arrayOf(
            Duration.ofMinutes(90),
            Duration.ofMinutes(60),
            Duration.ofMinutes(45),
            Duration.ofMinutes(30),
            Duration.ofMinutes(25),
            Duration.ofMinutes(20),
            Duration.ofMinutes(15),
            Duration.ofMinutes(10),
            Duration.ofMinutes(5)
    )
}