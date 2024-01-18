import {UIAbstractFactory} from "./UIAbstractFactory";
import {DarkModeFactory} from "./factory/DarkModeFactory";

const factory: UIAbstractFactory = new DarkModeFactory();

let panel = factory.createPanel();
panel.display()

let button = factory.createButton();
button.click()