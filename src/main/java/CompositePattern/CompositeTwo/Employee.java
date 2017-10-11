package CompositePattern.CompositeTwo;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public interface Employee {

    void add(Employee employee);

    List<Employee> getSubordinates();

    String getName();

    String getDept();

    Employee findByName(String name);

    Employee findByName2(String name);


}
