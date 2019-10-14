import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
       developer = new Developer("Keanu Reeves", "HU3846102", 40000);
    }

    @Test
    public void hasName(){
        assertEquals("Keanu Reeves", developer.getName());
    }

    @Test
    public void hastNiNo(){
        assertEquals("HU3846102", developer.getNiNo());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000, developer.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(50000, developer.raiseSalary(10000), 0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400, developer.payBonus(), 0);
    }
}
