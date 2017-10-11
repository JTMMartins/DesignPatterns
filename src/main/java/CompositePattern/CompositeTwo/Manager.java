package CompositePattern.CompositeTwo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee {
    private final String name;
    private final String dept;
    private List<Employee> subordinates = new ArrayList<>();

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

    @Override
    public Employee findByName(String name) {
        Employee response = null;
        Iterator<Employee> iterator = subordinates.iterator();
        while (iterator.hasNext()) {
            response = iterator.next();
            if (response.getName().equals(name)) {
                return response;
            }
        }
        return response.findByName(name);
    }
}
