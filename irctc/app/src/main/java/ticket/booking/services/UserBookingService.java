package  ticket.booking.services;

class UserBookingService {
    private User user;

    private final static String USER_DB_PATH = "../db/users.json";


    UserBookingService(User user) {
        this.user = user;
    }
}