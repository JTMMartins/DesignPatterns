package CompositePattern.CompositeTwo;

import java.util.List;
import java.util.stream.Stream;

public class Subordinate implements Employee {
    private final String name;
    private final String dept;

    public Subordinate(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    @Override
    public Employee getEmployee() {
        return this;
    }

    @Override
    public void add(Employee employee) {
        //sendo um nó terminal não se aplica nesta classe
    }

    @Override
    public List<Employee> getSubordinates() {
        //sendo um nó terminal não se aplica nesta classe
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Employee findByNameOLDVERSION(String name) {
        System.out.println("in subordinate : " + this.getName());
        return this;
    }

    @Override
    public Employee findByName(String name) {
        return this;
    }


    @Override
    public String getDept() {
        return this.dept;
    }

}
