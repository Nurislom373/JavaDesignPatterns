package org.khasanof;

import java.util.Objects;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 10/12/2023 12:21 PM
 */
public class Person {

    private String name;
    private double assetValue;
    private boolean previousLoanExist;

    public Person(String name, double assetValue, boolean previousLoanExist) {
        this.name = name;
        this.assetValue = assetValue;
        this.previousLoanExist = previousLoanExist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(double assetValue) {
        this.assetValue = assetValue;
    }

    public boolean isPreviousLoanExist() {
        return previousLoanExist;
    }

    public void setPreviousLoanExist(boolean previousLoanExist) {
        this.previousLoanExist = previousLoanExist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (Double.compare(person.assetValue, assetValue) != 0) return false;
        if (previousLoanExist != person.previousLoanExist) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(assetValue);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (previousLoanExist ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", assetValue=" + assetValue +
                ", previousLoanExist=" + previousLoanExist +
                '}';
    }
}
