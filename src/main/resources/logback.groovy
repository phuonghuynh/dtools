package com.vnw.data

import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.rolling.RollingFileAppender
import ch.qos.logback.core.util.FileSize

import static ch.qos.logback.classic.Level.DEBUG
import static ch.qos.logback.classic.Level.ERROR

scan()

def LOG_FOLDER = "./"

new File(LOG_FOLDER).mkdirs()

def fileLogger = { String appenderName, String fileName ->
  appender("${appenderName}", RollingFileAppender) {
    file = "${LOG_FOLDER}/${fileName}.log"
    rollingPolicy(SizeAndTimeBasedRollingPolicy) {
      fileNamePattern = "${LOG_FOLDER}/${fileName}.%d{yyyyMMdd}.%i.log"
      maxHistory = 10
      maxFileSize = "10mb"
      totalSizeCap = FileSize.valueOf("1gb")
    }
    encoder(PatternLayoutEncoder) {
      pattern = "%d{HH:mm:ss.SSS} %p [%t] %c{1}: %m%n"
    }
  }
}

fileLogger "FILE", "dtool"
fileLogger "DEBUG", "dtool-debug"
fileLogger "JOOQ", "dtool-jooq"

appender("CONSOLE", ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
    pattern = "%d{dd-MM-yyyy HH:mm:ss.SSS} %p [%t] %c{1}: %m%n"
  }
}

logger("com.vnw.data.service", DEBUG, ["CONSOLE", "DEBUG"])
logger("com.vnw.data.repo", DEBUG, ["CONSOLE", "DEBUG"])
logger("org.jooq", DEBUG, ["CONSOLE", "JOOQ"])

root(ERROR, ["CONSOLE", "FILE"])

