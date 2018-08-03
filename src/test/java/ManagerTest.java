import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Bill", "RT23453", 30500.96, "Shoes");
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(500);
        assertEquals(31000.96, manager.getsalary(), 0);
    }

    @Test
    public void canPayBonus() {
        manager.payBonus();
        assertEquals(305, 305, 1);

    }

}