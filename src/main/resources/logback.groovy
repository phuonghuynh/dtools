package staging

import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.rolling.FixedWindowRollingPolicy
import ch.qos.logback.core.rolling.RollingFileAppender
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy
import ch.qos.logback.core.rolling.TimeBasedRollingPolicy

import java.text.SimpleDateFormat

import static ch.qos.logback.classic.Level.*

scan()

def LOG_FOLDER = "./"

new File(LOG_FOLDER).mkdirs()

appender("FILE", RollingFileAppender) {
  file = "${LOG_FOLDER}dtool.log"
  rollingPolicy(TimeBasedRollingPolicy) {
    fileNamePattern = "${LOG_FOLDER}dtool-%d{yyyyMMdd}.log"
    maxHistory = 30
  }
  encoder(PatternLayoutEncoder) {
    pattern = "%d{HH:mm:ss.SSS} %p [%t] %c{1}: %m%n"
  }
}

appender("DEBUG", RollingFileAppender) {
  file = "${LOG_FOLDER}dtool-debug.log"
  rollingPolicy(TimeBasedRollingPolicy) {
    fileNamePattern = "${LOG_FOLDER}dtool-debug-%d{yyyyMMdd}.log"
    maxHistory = 30
  }
  encoder(PatternLayoutEncoder) {
    pattern = "%d{HH:mm:ss.SSS} %p [%t] %c{1}: %m%n"
  }
}

appender("CONSOLE", ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
    pattern = "%d{dd-MM-yyyy HH:mm:ss.SSS} %p [%t] %c{1}: %m%n"
  }
}

logger("com.vnw.data.service", DEBUG, ["CONSOLE", "DEBUG"])

root(ERROR, ["CONSOLE", "FILE"])
