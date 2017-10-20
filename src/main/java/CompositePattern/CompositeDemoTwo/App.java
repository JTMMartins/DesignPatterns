package CompositePattern.CompositeDemoTwo;

public class App {

    public static void main(String[] args) {

        Manager CEO = new Manager("Big Boss", "CEO");
        Manager sales = new Manager("Sales Boss", "Sales");
        Manager marketing = new Manager("Marketing Boss", "Marketing");
        Manager internationalSales = new Manager("IntSales Boss", "Int Sales");

        Subordinate sales1 = new Subordinate("Sales Person 1", "Sales");
        Subordinate sales2 = new Subordinate("Sales Person 2", "Sales");
        Subordinate sales3 = new Subordinate("Sales Person 3", "Sales");

        sales.add(sales1);
        sales.add(sales2);
        sales.add(sales3);

        Subordinate marketing1 = new Subordinate("marketing Person 1", "Marketing");
        Subordinate marketing2 = new Subordinate("marketing Person 2", "Marketing");

        marketing.add(marketing1);
        marketing.add(marketing2);

        Subordinate intSales1 = new Subordinate("InternationalSales Person 1", "Int Sales");
        Subordinate intSales2 = new Subordinate("InternationalSales Person 2", "Int Sales");

        internationalSales.add(intSales1);
        internationalSales.add(intSales2);

        CEO.add(sales);
        CEO.add(marketing);
        sales.add(internationalSales);

        String nameToSearch = "InternationalSales Person 2";
        Employee Lookingfor = CEO.search(CEO, nameToSearch);
        if (Lookingfor != null) {
            System.out.println("O Funcionário " + Lookingfor.getName() + " Trabalha no departamento " + Lookingfor.getDept());
        } else {
            System.out.println("Funcionario não encontrado");
        }
    }
}
