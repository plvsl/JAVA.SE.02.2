package test;

import main.Employee;
import main.stationeries.Marker;
import main.stationeries.Pen;
import main.stationeries.Pencil;
import main.stationeries.Ruler;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class EmployeeTest {
    private Employee employee;


    @Before
    public void setUp() {
        employee = new Employee(143);
        employee.addNew(new Pen(54.2)).addNew(new Pencil(32.6)).addNew(new Marker(143.9)).addNew(new Ruler(23.4));
    }

    @Test
    public void checkEmployeeID() {
        assertEquals(143, employee.getEmployeeID());
    }

    @Test
    public void checkGetStationeriesSize() {
        assertEquals(4, employee.getStationeriesSize());
    }

    @Test
    public void checkGetStationery() {
        assertTrue(employee.getStationery(0) instanceof Pen);
        assertTrue(employee.getStationery(1) instanceof Pencil);
        assertTrue(employee.getStationery(2) instanceof Marker);
        assertTrue(employee.getStationery(3) instanceof Ruler);
        assertFalse(employee.getStationery(0) instanceof Pencil);
        assertFalse(employee.getStationery(0) instanceof Marker);
        assertFalse(employee.getStationery(0) instanceof Ruler);
        assertFalse(employee.getStationery(1) instanceof Pen);
        assertFalse(employee.getStationery(1) instanceof Marker);
        assertFalse(employee.getStationery(1) instanceof Ruler);
        assertFalse(employee.getStationery(2) instanceof Pen);
        assertFalse(employee.getStationery(2) instanceof Pencil);
        assertFalse(employee.getStationery(2) instanceof Ruler);
        assertFalse(employee.getStationery(3) instanceof Pen);
        assertFalse(employee.getStationery(3) instanceof Pencil);
        assertFalse(employee.getStationery(3) instanceof Marker);
    }

    @Test
    public void checkGetWholeAmount(){
        assertEquals(254.1, employee.getWholeAmount());
    }

}
