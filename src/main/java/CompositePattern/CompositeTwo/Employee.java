package CompositePattern.CompositeTwo;

import java.util.List;

public interface Employee {

    void add(Employee employee);

    List<Employee> getSubordinates();

    String getName();

    String getDept();

    Employee findByName(String name);
}
