import management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    private Employee bob;

    @Before
    public void before() {
        bob = new Manager("Bob", "DU572947", 45_000.00, "Technology");
    }

    @Test
    public void canRaiseSalary() {
        bob.raiseSalary(500.00);
        assertEquals(45_500.00, bob.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(450.00, bob.payBonus(), 0.01);
    }
}
