package CompositePattern.CompositeTwo;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface Employee {

    Employee getEmployee();

    void add(Employee employee);

    List<Employee> getSubordinates();

    String getName();

    String getDept();

    Employee findByNameOLDVERSION(String name);

    Employee findByName(String name);


}
