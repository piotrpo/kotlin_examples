package pl.com.sandbox.kotlinexamples.wrapping;

import java.math.BigDecimal;

public class PersonWithAccountBallance extends ForwardingPerson {

    private BigDecimal accountBalance = BigDecimal.ZERO;

    public PersonWithAccountBallance(Person person) {
        super(person);
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }
}
