package Adapter;

public class ToySparrow implements BirdToy{
    @Override
    public void playSound() {
        System.out.println("Toy playing sound");
    }
}
