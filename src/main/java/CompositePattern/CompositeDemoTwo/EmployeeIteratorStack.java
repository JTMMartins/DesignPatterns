package CompositePattern.CompositeDemoTwo;

import java.util.Stack;

public class EmployeeIteratorStack {

    private static Stack<Employee> stack = new Stack<>();

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

}
