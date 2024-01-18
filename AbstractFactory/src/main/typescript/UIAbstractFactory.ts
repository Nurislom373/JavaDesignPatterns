import {Button} from "./Button";
import {Panel} from "./Panel";

export interface UIAbstractFactory {

    /**
     *
     */
    createButton(): Button;

    /**
     *
     */
    createPanel(): Panel;

}