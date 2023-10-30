package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 10/30/2023 10:10 PM
 */
public class FinancialDepartment implements Department {

    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }

}
