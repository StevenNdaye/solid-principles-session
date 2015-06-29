package srp.example2;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.math.BigDecimal;

public class Customer {

    private static final BigDecimal MINIMUM_REQUIRED_BALANCE = new BigDecimal(10);

    private String name;
    private BigDecimal balance;

    public Customer(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
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

    //QUESTION: What happens if the requirements change and now you can have a joint account that is held by two people?

    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
