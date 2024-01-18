import {Button} from "../Button";

export class LightButton implements Button {

    click(): void {
        console.log("Clicked a light button!");
    }

}