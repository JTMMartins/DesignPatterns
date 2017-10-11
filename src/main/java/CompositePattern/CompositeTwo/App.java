package CompositePattern.CompositeTwo;

import java.util.Optional;

public class App {

    public static void main(String[] args) {

        Employee CEO = new Manager("Jose", "CEO");

        Employee headMarketing = new Manager("Alberto", "Marketing");

        Employee headSales = new Manager("Manuel", "Sales");

        Employee marketing1 = new Subordinate("Luis", "marketing");
        Employee marketing2 = new Subordinate("Rui", "marketing");
        Employee marketing3 = new Subordinate("Romão", "marketing");

        Employee sales1 = new Subordinate("Miguel", "Sales");
        Employee sales2 = new Subordinate("Pedro", "Sales");

        headMarketing.add(marketing1);
        headMarketing.add(marketing2);
        headMarketing.add(marketing3);

        headSales.add(sales1);
        headSales.add(sales2);

        CEO.add(headMarketing);
        CEO.add(headSales);

        //Employee lookingfor = CEO.findByName("Romão");//O funcionário que estamos à procura.
        //System.out.println("O funcionário " + lookingfor.getName() + " trabalha no dept " + lookingfor.getDept());

        Employee lookingfor2 = CEO.findByName2("Pedro");
        System.out.println("O funcionário " + lookingfor2.getName() + " trabalha no dept " + lookingfor2.getDept());
    }

}
