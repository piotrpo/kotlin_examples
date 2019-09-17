package pl.com.digita.kotlinexamples.wrapping;

import java.math.BigDecimal;

public class PersonWithAccountBallance extends ForwardingPerson
{

    public PersonWithAccountBallance(Person person)
    {
        super(person);
    }

    private BigDecimal accountBalance = BigDecimal.ZERO;

    public BigDecimal getAccountBalance()
    {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance)
    {
        this.accountBalance = accountBalance;
    }
}
