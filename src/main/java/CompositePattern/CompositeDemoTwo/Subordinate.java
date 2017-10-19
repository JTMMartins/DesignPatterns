package CompositePattern.CompositeDemoTwo;

import java.util.Collections;
import java.util.List;

public class Subordinate implements Employee {

    private String name;
    private String dept;

    public Subordinate(String name, String dept) {
        this.name = name;
        this.dept = dept;
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
        throw new java.lang.UnsupportedOperationException("Not supported.");
    }

    @Override
    public Employee remove(Employee employee) {
        throw new java.lang.UnsupportedOperationException("Not supported.");
    }

    @Override
    public List<Employee> getSubordinates() {
        return Collections.emptyList();
        // throw new java.lang.UnsupportedOperationException("Not supported.");
    }
}
