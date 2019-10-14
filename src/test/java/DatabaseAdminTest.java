import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("James Maynard Keenan", "UJ5294519", 55000);
    }

    @Test
    public void hasName(){
        assertEquals("James Maynard Keenan", databaseAdmin.getName());
    }

    @Test
    public void hastNiNo(){
        assertEquals("UJ5294519", databaseAdmin.getNiNo());
    }

    @Test
    public void hasSalary(){
        assertEquals(55000, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(67000, databaseAdmin.raiseSalary(12000), 0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(550, databaseAdmin.payBonus(), 0);
    }
}
