package SynchroniZ;

public class BookingService extends Thread{
    int seats;
     static SeatBooker b = new SeatBooker();
    public void run(){
        System.out.println(Thread.currentThread().getName());

        b.Booking(seats);
    }

    public static void main(String[] args) {
        BookingService b1 = new BookingService();
        b1.seats = 7;
        BookingService b2 = new BookingService();
        b2.seats = 5;
        b1.start();
        b2.start();
    }

}
