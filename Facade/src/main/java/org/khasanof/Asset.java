package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 10/12/2023 12:24 PM
 */
public class Asset {

    public boolean hasSufficientAssetValue(Person person,
                                           double claimAmount) {
        System.out.println("Verifying " + person.getName() + "'s asset value.");
        return person.getAssetValue() >= claimAmount;
    }

}
