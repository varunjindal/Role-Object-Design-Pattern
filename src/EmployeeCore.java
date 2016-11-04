import java.util.HashMap;

/**
 * Created by Varun on 10/25/2016.
 * Presentation for Role Object Design Pattern
 * Employee Core extends Employee interface and provides implementation
 * A map is maintained here for Employee and there respective role
 */

public class EmployeeCore extends Employee {

    private String name;
    private String id;

    public EmployeeCore(String name, String id)
    {
        this.name = name;
        this.id = id;
    }

    private HashMap<String, EmployeeRole> roles = new HashMap<String, EmployeeRole>();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public EmployeeRole getRole(String aSpec) {
        return roles.get(aSpec);
    }

    @Override
    public void addRole(String aSpec, EmployeeRole emp) {
        roles.put(aSpec,emp);
    }

    @Override
    public void removeRole(String aSpec) {
        roles.remove(aSpec);
    }

    @Override
    public boolean hasRole(String aSpec) {
        return roles.containsKey(aSpec);
    }
}
