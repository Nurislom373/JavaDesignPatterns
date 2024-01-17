import {ILogger} from "./ILogger";
import * as fs from "fs";

export class FileLogger implements ILogger {

    private readonly filePath: string;

    constructor(filePath: string) {
        this.filePath = filePath;
    }

    log(message: string): void {
        fs.appendFileSync(this.filePath, `[File] ${message}`)
    }

}