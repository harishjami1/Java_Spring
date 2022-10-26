package Decorator;

public class PizzaHouse {
    public static void main(String[] args) {
        Pizza pizza = new Margerita();
        pizza = new Cheese(new Toppings(pizza));
        System.out.println(pizza.getName()+" "+pizza.getprice());
        Pizza pizza2 = new Barbeque();
        pizza2= new Toppings(new Cheese(pizza2));
        System.out.println(pizza2.getName()+" "+pizza2.getprice());
    }
}
