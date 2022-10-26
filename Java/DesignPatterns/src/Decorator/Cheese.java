package Decorator;

public class Cheese extends Decorator{
    Pizza pizza;
    Cheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    String getName() {
        return pizza.getName()+"+Cheese";
    }

    @Override
    int getprice() {
        return pizza.getprice()+20;
    }
}
