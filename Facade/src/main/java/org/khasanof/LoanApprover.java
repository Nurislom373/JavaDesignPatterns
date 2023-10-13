package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 10/12/2023 12:26 PM
 */
public class LoanApprover {

    private final Asset asset;
    private final LoanStatus loanStatus;

    public LoanApprover(Asset asset, LoanStatus loanStatus) {
        this.asset = asset;
        this.loanStatus = loanStatus;
    }

    public String checkLoanEligibility(Person person, double claimAmount) {
        String status = " Approved";
        String reason = "";

        System.out.println("\nChecking the loan approval status of " + person.getName());
        System.out.println("[The current asset value: " +
                person.getName() + ",\n claim amount: " + claimAmount
                + ",\n existing loan?: " + person.isPreviousLoanExist() + "]\n");

        if (!asset.hasSufficientAssetValue(person, claimAmount)) {
            status = " Not approved.";
            reason += "\nInsufficient balance.";
        }

        if (loanStatus.hasPreviousLoans(person)) {
            status = " Not approved.";
            reason += "\nAn old loan exists.";
        }

        // Collecting the remarks (if any).
        String remarks = String.format("%nRemarks if any:%s", reason);
        // Combining the final result with remarks using
        // the format() method.
        String result = String.format("%s %s", status, remarks);
        // Same as:
        // String result=status+"\nRemarks if any:"+reason;
        return result;

    }
}
