import {LoggerType} from "./LoggerType";
import {ILogger} from "./ILogger";
import {ConsoleLogger} from "./ConsoleLogger";
import {FileLogger} from "./FileLogger";

export class LoggerFactory {

    static createLogger(type: LoggerType, options?: any): ILogger {
        switch (type) {
            case LoggerType.Console:
                return new ConsoleLogger();
            case LoggerType.File:
                if (options && options.filePath) {
                    return new FileLogger(options.filePath);
                } else {
                    throw new Error("File path is missing for FileLogger.");
                }
            default:
                throw new Error("Invalid logger type.");
        }
    }

}