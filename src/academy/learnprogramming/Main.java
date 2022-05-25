package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	Theatre theatre = new Theatre("Olympian",3,3);
    theatre.getSeats();
    if (theatre.reserveSeat("A02")){
        System.out.println("Please pay");
    } else {
        System.out.println("Sorry, Seat is already reserved");
    }

    }
}
