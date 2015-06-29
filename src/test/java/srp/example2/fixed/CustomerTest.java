package srp.example2.fixed;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private List<Customer> accountHolders;
    private Account account;
    private Customer customer;

    @Before
    public void setUp() throws Exception {
        accountHolders = new ArrayList<Customer>(){{
            add(new Customer("srp.example2.Customer name"));
        }};

        account = new Account(new BigDecimal(500), accountHolders);
        customer = new Customer("srp.example2.Customer name", account);
    }

    @Test
    public void itShouldGetCustomerAvailableFundsInAccount() throws Exception {
        assertEquals(new BigDecimal(490), customer.getAvailableFunds());
    }

    @Test
    public void itShouldDeductFromCustomerAccountBalance() throws Exception {
        customer.deductFromBalanceBy(new BigDecimal(200));

        Account expectedAccount = new Account(new BigDecimal(300), accountHolders);
        Customer expectedCustomer = new Customer("srp.example2.Customer name", expectedAccount);

        assertEquals(expectedCustomer, customer);
    }
}