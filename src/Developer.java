/**
 * Created by Varun on 10/25/2016.
 * Presentation for Role Object Design Pattern
 * This is a concrete class which will extend the Role and provides value to the composite core object
 */
public class Developer extends EmployeeRole {
    Developer(EmployeeCore emp)
    {
        this.empCore=emp;
    }

    public void doCoding()
    {
        System.out.println(empCore.getName() + " I am coding");

    }
}
