package srp.example2.fixed;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.math.BigDecimal;
import java.util.List;

public class Account {

    private static final BigDecimal MINIMUM_REQUIRED_BALANCE = new BigDecimal(10);

    private BigDecimal balance;
    private List<Customer> accountHolders;

    public Account(BigDecimal balance, List<Customer> accountHolders) {
        this.balance = balance;
        this.accountHolders = accountHolders;
    }

    public BigDecimal getAvailableFunds(){
        return subtractFromBalance(MINIMUM_REQUIRED_BALANCE);
    }

    public void deductFromBalanceBy(BigDecimal amountToDeduct){
        if(amountToDeduct.compareTo(balance) > 0) {
            throw new UnsupportedOperationException("Insufficient funds.");
        }
        balance = subtractFromBalance(amountToDeduct);
    }

    private BigDecimal subtractFromBalance(BigDecimal amount) {
        return balance.subtract(amount);
    }

    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
