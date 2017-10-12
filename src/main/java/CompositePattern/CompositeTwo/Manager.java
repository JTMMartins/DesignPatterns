package CompositePattern.CompositeTwo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

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
    public Employee getEmployee() {
        return this;
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
    @Deprecated
    public Employee findByNameOLDVERSION(String name) {
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
    public Employee findByName(String name) {

        if (this.getName().equals(name)) return this;//if this is it...finish

        Employee employee = null;
        for (Employee subordinate : subordinates) {

            if (subordinate.getName().equals(name)) {
                employee = subordinate;
                break;
            }

            employee = subordinate.getSubordinates().stream()
                    .filter((emp -> emp.getName().equalsIgnoreCase(name)))
                    .findFirst()
                    .orElse(null);

            if (employee != null) break;
        }
        return employee;
    }


}

