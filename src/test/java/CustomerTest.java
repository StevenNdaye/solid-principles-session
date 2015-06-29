import org.junit.Test;
import srp.example2.Customer;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void itShouldGetAvailableFunds() throws Exception {
        Customer customer = new Customer("Person", new BigDecimal(100));
        assertEquals(new BigDecimal(90), customer.getAvailableFunds());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void itShouldThrowUnsupportedExceptionWhenAmountToDeductIsBiggerThanBalance() throws Exception {
        Customer customer = new Customer("Person", new BigDecimal(250));
        customer.deductFromBalanceBy(new BigDecimal(500));
    }

    @Test
    public void itShouldDeductFromActualBalance() throws Exception {
        Customer customer = new Customer("Person", new BigDecimal(100));
        customer.deductFromBalanceBy(new BigDecimal(30));
        assertEquals(new Customer("Person", new BigDecimal(70)), customer);
    }
}