package CompositePattern.CompositeDemoTwo;

import java.util.List;

public interface Employee {

    String getName();

    String getDept();

    Employee add(Employee employee);

    Employee remove(Employee employee);

    List<Employee> getSubordinates();
}
