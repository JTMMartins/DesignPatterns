package CompositePattern.CompositeTwo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Manager implements Employee {
    private final String name;
    private final String dept;
    private List<Employee> subordinates;

    public Manager(String name, String dept) {
        this.name = name;
        this.dept = dept;
        subordinates = new ArrayList<>();
    }

    @Override
    public void add(Employee employee) {
        subordinates.add(employee);
    }

    @Override
    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDept() {
        return this.dept;
    }


    //THIS WORKS BUT IS VERY BAD CODE
    //WE DONT WANT THIS.
    @Override
    public Employee findByName(String name) {
        if (this.getName().equals(name)) return this;
        Employee found = null;

        Iterator<Employee> employeeIterator = subordinates.iterator();

        while (employeeIterator.hasNext()) {
            Employee response = employeeIterator.next();
            if (response.getName().equals(name)) {
                found = response;
            } else {
                for (Employee employee : response.getSubordinates()) {
                    if (employee.getName().equals(name)) {
                        found = employee;
                        break;
                    }
                }
            }
        }

        return found;
    }

    @Override
    public Employee findByName2(String name) {
        for (Employee sub : subordinates) {
            System.out.println(sub.getName());
            while (!sub.getName().equals(name)) {
                return sub.findByName2(name);
            }
        }
        return null;
    }


}

