package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 10/12/2023 12:25 PM
 */
public class LoanStatus {

    public boolean hasPreviousLoans(Person person) {
        System.out.println("Verifying " + person.getName() + "'s previous loan(s) status.");
        return person.isPreviousLoanExist();
    }

}
