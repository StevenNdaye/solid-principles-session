package srp.example2.fixed;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    private Account account;

    @Before
    public void setUp() throws Exception {
        account = new Account(new BigDecimal(500), null);
    }

    @Test
    public void itShouldGetAvailableFundsInAccount() throws Exception {
        assertEquals(new BigDecimal(490), account.getAvailableFunds());
    }

    @Test
    public void itShouldDeductFromBalanceByAmount() throws Exception {
        account.deductFromBalanceBy(new BigDecimal(400));
        assertEquals(new Account(new BigDecimal(100), null), account);
    }
}