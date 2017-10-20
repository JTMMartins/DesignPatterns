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

    /*
     * Pesquisa recursiva pela árvore
     */
    public Employee search(Employee root, String name) {
        if (root.getName().equals(name)) return root;

        EmployeeIteratorStack ManagerStack = new EmployeeIteratorStack();

        if (!root.getSubordinates().isEmpty()) {
            Iterator<Employee> employeeIterator = root.getSubordinates().iterator();
            while (employeeIterator.hasNext()) {

                Employee employee = employeeIterator.next();
                ManagerStack.push(employee);//uma vez que o elemento tem subordinados armazenamos na stack
            }
        }

        Employee treeElement = null;

        while (ManagerStack.isEmpty() == false) {

            treeElement = ManagerStack.pop();
            return search(treeElement, name);//chamada recursiva, usando um elemento retirado da stack
        }
        return null;//devolve null se não encontrado
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
