package Decorator;

public class Barbeque extends Pizza{
    Barbeque(){
        name = "Barbeque";
    }

    @Override
    int getprice() {
        return 85;
    }
}
