package Decorator;

public class Toppings extends Decorator{
    Pizza pizza;
    Toppings(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    String getName() {
        return pizza.getName()+"+Toppings";
    }

    @Override
    int getprice() {
        return pizza.getprice()+25;
    }
}
