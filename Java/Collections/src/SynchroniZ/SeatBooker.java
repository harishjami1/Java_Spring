package SynchroniZ;

public class SeatBooker {
    static int max_seats =10;

     synchronized static public void Booking(int seats){

       if(seats<=max_seats){
            System.out.println("Possible and booked successfully");
            max_seats-=seats;
            System.out.println("Reaminign seats"+max_seats);
        }
        else{
            System.out.println("Not possible.Only "+max_seats+"Seats Left");

        }
    }
}
