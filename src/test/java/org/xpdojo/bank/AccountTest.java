package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
	    public void depositAnAmountToIncreaseTheBalance()
    {
     Account account = new Account();

        assertEquals(20000,account.getBalance(10000));
        //assertThat(account.deposit(10)).isEqualTo(20);
    }

    @Test
    public void withdrawAnAmount()
    {
        Account account = new Account();

        assertEquals(20000,account.withBalance(10000));
        //assertThat(account.deposit(10)).isEqualTo(20);
    }

    @Test
    public void viewAmount()
    {
        Account account = new Account();

        assertEquals(50000,account.viewBalance());
        //assertThat(account.deposit(10)).isEqualTo(20);
    }
}
