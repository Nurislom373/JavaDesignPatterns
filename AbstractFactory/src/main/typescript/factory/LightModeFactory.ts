import { Button } from "../Button";
import { Panel } from "../Panel";
import {UIAbstractFactory} from "../UIAbstractFactory";
import {LightButton} from "../button/LightButton";
import {LightPanel} from "../panel/LightPanel";

export class LightModeFactory implements UIAbstractFactory {

    createButton(): Button {
        return new LightButton();
    }
    createPanel(): Panel {
        return new LightPanel();
    }

}