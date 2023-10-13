package org.khasanof;

public class Main {

    public static void main(String[] args) {
        System.out.println("***Simplifying the usage of a complex system using a facade.***");
        // Using a facade
        LoanApprover loanApprover = new LoanApprover(new Asset(), new LoanStatus());
        // Person-1
        Person person = new Person("Bob", 5000, true);
        checkEligibility(person, 20000, loanApprover);
        System.out.println("--------");
        // Person-2
        person = new Person("Jack", 70000, false);
        checkEligibility(person, 30000, loanApprover);
        System.out.println("--------");
        // Person-3
        person = new Person("Tony", 125000, true);
        checkEligibility(person, 125000, loanApprover);
        System.out.println("--------");
    }

    private static void checkEligibility(Person person, double claimAmount, LoanApprover approver) {
        String approvalStatus = approver.checkLoanEligibility(person, claimAmount);
        System.out.println(person.getName() + "'s application status:" + approvalStatus);
    }

}
