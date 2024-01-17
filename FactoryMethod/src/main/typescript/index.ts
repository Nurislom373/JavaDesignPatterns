import {LoggerFactory} from "./LoggerFactory";
import {LoggerType} from "./LoggerType";

const consoleLogger = LoggerFactory.createLogger(LoggerType.Console);
consoleLogger.log(`This is a console log.`)

const fileLogger = LoggerFactory.createLogger(LoggerType.File, { filePath: "logs.txt" })
fileLogger.log(`This is a file log.`)