package org.khasanof;

public class Main {
    public static void main(String[] args) {
        Department financialDepartment = new FinancialDepartment();
        Department salesDepartment = new SalesDepartment();
        HeadDepartment headDepartment = new HeadDepartment();

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printName();
    }
}
