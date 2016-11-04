/**
 * Created by Varun on 10/25/2016.
 * Presentation for Role Object Design Pattern
 * This is a concrete class which will extend the Role and provides value to the composite core object
 */
public class Tester extends EmployeeRole {
    Tester(EmployeeCore emp)
    {
        this.empCore=emp;
    }

    public void doTesting()
    {
        System.out.println(empCore.getName() + " I am testing");

    }
}
