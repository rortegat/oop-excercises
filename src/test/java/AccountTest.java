import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AccountTest {
    private final double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);
        assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }

    @Test
    public void depositAndWithdrawWillNotAcceptNegativeNumbers(){
        Account account = new Account(100);
        assertFalse(account.deposit(-30));
        assertFalse(account.withdraw(-40));
    }

    @Test
    public void accountCannotOverstepItsOverdraftLimit(){
        Account account = new Account(100);
        assertFalse(account.withdraw(100.01));
    }

    @Test
    public void depositAndWithdrawWillDepositOrWithdrawCorrectAmount(){
        Account account = new Account(150);
        account.deposit(100);
        assertEquals(100, account.getBalance(), epsilon);
        account.withdraw(50);
        assertEquals(50, account.getBalance(), epsilon);
    }

    @Test
    public void depositAndWithdrawReturnsCorrectResults(){
        Account account = new Account(100);
        assertTrue(account.deposit(10));
        assertFalse(account.deposit(-10));
        assertTrue(account.withdraw(10));
        assertFalse(account.withdraw(-10));
    }
}