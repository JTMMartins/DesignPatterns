package CompositePattern.CompositeDemoTwo;

import java.util.Stack;

/*
* Implementa uma stack que irá auxiliar a pesquisa
* recursiva, mantendo uma pilha dos níveis da árvore visitados.
 */
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
