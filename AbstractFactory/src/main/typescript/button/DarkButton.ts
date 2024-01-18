import {Button} from "../Button";

export class DarkButton implements Button {

    click(): void {
        console.log("Clicked a dark button!");
    }

}