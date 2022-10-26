package Adapter;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Sparrow();
        BirdToy toy = new ToySparrow();
        bird.makesound();
        toy.playSound();
        Bird adapter = new Adapter(toy);
        adapter.makesound();
    }
}
