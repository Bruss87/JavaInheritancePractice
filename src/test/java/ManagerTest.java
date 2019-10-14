import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Mark Antony", "CE6583274", 75000, "Cyber Security");
    }

    @Test
    public void hasName(){
       assertEquals("Mark Antony", manager.getName());
    }

    @Test
    public void hastNiNo(){
        assertEquals("CE6583274", manager.getNiNo());
    }

    @Test
    public void hasSalary(){
        assertEquals(75000, manager.getSalary(), 0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Cyber Security", manager.getDeptName());
    }

    @Test
    public void canChangeName(){
        manager.setName("Julius Caesar");
        assertEquals("Julius Caesar", manager.getName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(75000, manager.raiseSalary(-230), 0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(750, manager.payBonus(), 0);
    }



}
