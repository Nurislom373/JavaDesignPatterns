package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 10/30/2023 10:09 PM
 */
public class SalesDepartment implements Department {

    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }

}
