package movieBooking;

public class RunCinema {

    public static void main(String[] args) {

        Cinema cinema = new Cinema();
        cinema.isSeatBooked(0,0);
        cinema.bookSeat(1,0);
        cinema.isSeatBooked(1, 0);
        cinema.bookSeat(5,4);
        cinema. bookSeat(1, 6);
        cinema.show();
        System.out.println(cinema.totalBookings());
        System.out.println(cinema.totalIncome());

//        Cinema cinema1 = new Cinema();
//        cinema1.show();



    }
}
