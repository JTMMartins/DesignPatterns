package CompositePattern.CompositeTwo;

public class App {

    public static void main(String[] args) {

        Employee CEO = new Manager("Jose", "CEO");

        Employee headMarketing = new Manager("Alberto", "Marketing");

        Employee headSales = new Manager("Manuel", "Sales");

        Employee marketing1 = new Subordinate("Luis", "marketing");
        Employee marketing2 = new Subordinate("Rui", "marketing");

        Employee sales1 = new Subordinate("Miguel", "Sales");
        Employee sales2 = new Subordinate("Pedro", "Sales");

        headMarketing.add(marketing1);
        headMarketing.add(marketing2);

        headSales.add(sales1);
        headSales.add(sales2);

        CEO.add(headMarketing);
        CEO.add(headSales);

        Employee lookingfor = CEO.findByName("Pedro");//O funcionário que estamos à procura.
        System.out.println("O funcionário " + lookingfor.getName() + " trabalha no dept " + lookingfor.getDept());
    }

}
