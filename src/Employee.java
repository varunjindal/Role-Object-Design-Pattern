/**
 * Created by Varun on 10/25/2016.
 * Presentation for Role Object Design Pattern
 * Employee interface is a contract for Employee Core and Employee Role
 */
public abstract class Employee {

    public abstract String getName();
    public abstract String getId();
    public abstract EmployeeRole getRole(String aSpec);
    public abstract void addRole(String aSpec, EmployeeRole emp);
    public abstract void removeRole(String aSpec);
    public abstract boolean hasRole(String aSpec);

}
