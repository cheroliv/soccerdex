package com.cheroliv.soccerdex

import org.slf4j.Logger
import org.slf4j.LoggerFactory.getLogger

object Log {
    @JvmStatic
    val log: Logger by lazy { getLogger(Log.javaClass) }
}