import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    private Employee dbAdmin;

    @Before
    public void before() {
        dbAdmin = new DatabaseAdmin("Aneeqa", "CE574325", 45_000);
    }

    @Test
    public void canRaiseSalary() {
        dbAdmin.raiseSalary(500.00);
        assertEquals(45_500.00, dbAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(450.00, dbAdmin.payBonus(), 0.01);
    }

    @Test
    public void hasName() {
        assertEquals("Aneeqa", dbAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("CE574325", dbAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(45_000, dbAdmin.getSalary(), 0.0);
    }
}