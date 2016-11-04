import java.util.ArrayList;

/**
 * Created by Varun on 10/25/2016.
 */
public class Client {

    private static ArrayList<EmployeeCore> employeeList()
    {
        ArrayList<EmployeeCore> employeeList = new ArrayList<>();
        employeeList.add(new EmployeeCore("Ed","1"));
        employeeList.add(new EmployeeCore("Edd","2"));      // Employee information
        employeeList.add(new EmployeeCore("Eddy","3"));

        Developer d = new Developer(employeeList.get(0));   // Assigning Role
        employeeList.get(0).addRole("dev",d);

        Tester t = new Tester(employeeList.get(1));
        employeeList.get(1).addRole("tester",t);

        Tester t2 = new Tester(employeeList.get(2));
        employeeList.get(2).addRole("tester",t2);

        Developer d2 = new Developer(employeeList.get(2));
        employeeList.get(2).addRole("dev",d2);

        return employeeList;
    }

    public static void main(String[] args)
    {
        ArrayList<EmployeeCore> arr = employeeList();
        for(Employee emp : arr)
        {
            if(emp.hasRole("dev"))
            {
                Developer d = (Developer)emp.getRole("dev");
                d.doCoding();
            }
            if(emp.hasRole("tester"))
            {
                Tester t = (Tester) emp.getRole("tester");
                t.doTesting();
            }
        }
    }

}
