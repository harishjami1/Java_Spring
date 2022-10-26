package Decorator;

public class Margerita extends Pizza{
    Margerita(){
        name = "Margarita";
    }

    @Override
    int getprice() {
        return 70;
    }
}
