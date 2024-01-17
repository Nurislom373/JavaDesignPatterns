import {ILogger} from "./ILogger";

export class ConsoleLogger implements ILogger {

    log(message: string): void {
        console.log(`[Console] ${message}`)
    }

}