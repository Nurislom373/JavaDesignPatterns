import { Button } from "../Button";
import { Panel } from "../Panel";
import { DarkButton } from "../button/DarkButton";
import {UIAbstractFactory} from "../UIAbstractFactory";
import {DarkPanel} from "../panel/DarkPanel";

export class DarkModeFactory implements UIAbstractFactory {

    createButton(): Button {
        return new DarkButton();
    }
    createPanel(): Panel {
        return new DarkPanel();
    }

}