package Adapter;

public class Adapter implements Bird{
    BirdToy bird;
    Adapter(BirdToy bird){
        this.bird = bird;
    }

    @Override
    public void makesound() {
        System.out.print("Bird is ");
        bird.playSound();
    }
}
