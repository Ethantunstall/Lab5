import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    /**
     *
     */
    private int accountNumber;
    /**
     *
     */
    public BankAccountType accountType;
    /**
     *
     */
    private double accountBalance;
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    public double interestRate;
    /**
     *
     */
    private double interestEarned;

    /**
     *
     * @param name string
     * @param accountCategory amount in each category
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        Bank.increment();
    }

    /**
     *
     * @return
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @param accountNumber account number
     */
    public void setAccountNumber(final int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     *
     * @return account balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     *
     * @param accountBalance balance
     */
    public void setAccountBalance(final double accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     *
     * @return
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     *
     * @param ownerName name of owner
     */
    public void setOwnerName(final String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     *
     * @return interest earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     *
     * @param interestEarned double
     */
    public void setInterestEarned(final double interestEarned) {
        this.interestEarned = interestEarned;
    }
}
