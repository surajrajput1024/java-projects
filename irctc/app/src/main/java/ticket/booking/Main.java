package  ticket.booking;

import ticket.booking.services.UserBookingService;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ticket booking system is up and running!");

        Scanner s = new Scanner(System.in);
        int option = 0;
        try {
            UserBookingService userBookingService = new UserBookingService();

            while(option != 7) {
                System.out.println("1. Login");
                System.out.println("2. Signup");
                System.out.println("3. Book Ticket");
                System.out.println("4. Cancel Ticket");
                System.out.println("5. Fetch Tickets");
                System.out.println("6. Exit");
                System.out.println("Enter your choice: ");
                option = s.nextInt();
                s.nextLine();

                switch (option) {
                    case 1:
                        System.out.println("Enter email: ");
                        String email = s.nextLine();
                        System.out.println("Enter password: ");
                        String password = s.nextLine();
                        userBookingService.loginUser(email, password);
                        System.out.println("Login successful!");
                        break;
                    case 2:
                        System.out.println("Enter name: ");
                        String name = s.nextLine();
                        System.out.println("Enter email: ");
                        email = s.nextLine();
                        System.out.println("Enter password: ");
                        password = s.nextLine();
                        userBookingService.signupUser(name, email, password);
                        System.out.println("Signup successful!");
                        break;
                    case 3:
                        System.out.println("Enter from: ");
                        String from = s.nextLine();
                        System.out.println("Enter to: ");
                        String to = s.nextLine();
                        System.out.println("Enter train number: ");
                        String trainNumber = s.nextLine();
                        System.out.println("Enter date: ");
                        String date = s.next();
                        Date dateOfJourney = new Date(date);
                        userBookingService.bookTicket(from, to, trainNumber, dateOfJourney);
                        break;
                    case 4:
                        System.out.println("Enter PNR: ");
                        String pnr = s.nextLine();
                        userBookingService.cancelTicket(pnr);
                        break;
                    case 5:
                        userBookingService.fetchTickets();
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid option!");
                }
            }


        } catch (IOException exception) {
            System.out.println("Something went wrong!" + exception);
            return;
        }
    }
}