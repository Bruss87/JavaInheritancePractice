import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Jimmy Falon", "TR3956593", 100000, "Operations", 2500000);
    }

    @Test
    public void hasName(){
        assertEquals("Jimmy Falon", director.getName());
    }

    @Test
    public void hastNiNo(){
        assertEquals("TR3956593", director.getNiNo());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000, director.getSalary(), 0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Operations", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(2500000, director.getBudget(), 0);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(125000, director.raiseSalary(25000), 0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(2000, director.payBonus(), 0);
    }
}
