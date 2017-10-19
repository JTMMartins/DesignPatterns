package CompositePattern.CompositeDemoTwo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee {

    private String name;
    private String dept;
    private List<Employee> subordinates;

    public Manager(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public Employee search(Employee manager, String name) {
        if (manager.getName().equals(name)) return manager;
        EmployeeIteratorStack ManagerStack = new EmployeeIteratorStack();
        if (!manager.getSubordinates().isEmpty()) {
            Iterator<Employee> employeeIterator = manager.getSubordinates().iterator();
            while (employeeIterator.hasNext()) {
                Employee employee = employeeIterator.next();
                ManagerStack.push(employee);
            }
        }
        Employee resto = null;
        while (ManagerStack.isEmpty() == false) {
            resto = ManagerStack.pop();
            return search(resto, name);
        }
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDept() {
        return dept;
    }

    @Override
    public Employee add(Employee employee) {
        if (subordinates == null) {
            subordinates = new ArrayList<>();
        }
        subordinates.add(employee);
        return employee;
    }

    @Override
    public Employee remove(Employee employee) {
        if (subordinates != null) {
            subordinates.remove(employee);
        }
        return employee;
    }

    @Override
    public List<Employee> getSubordinates() {
        return subordinates;
    }
}
