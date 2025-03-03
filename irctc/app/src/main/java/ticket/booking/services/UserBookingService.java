package  ticket.booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.Ticket;
import ticket.booking.entities.User;
import ticket.booking.utils.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class UserBookingService {
    private User user;
    private final static String USER_DB_PATH = "app/src/main/java/ticket/booking/db/users.json";
    private List<User> userList;
    private final ObjectMapper objectMapper = new ObjectMapper();


    public UserBookingService(User user) throws IOException {
        this.user = user;
        loadUsers();

    }

    public UserBookingService() throws IOException {
     loadUsers();
    }

    private void loadUsers() throws  IOException{
        File users = new File(USER_DB_PATH);
        this.userList = objectMapper.readValue(users, new TypeReference<List<User>>() {

        });
    }

    public User loginUser(String email, String password) {
        return userList.stream()
                .filter(user -> user != null && email.equals(user.getEmail()) && password.equals(user.getPassword()))
                .findFirst()
                .orElse(null);
    }

    public void signupUser(String name, String email, String plainPass) throws IOException{
        try {
            User user = new User(UUID.randomUUID().toString(), name, email, UserServiceUtil.hashedPassword(plainPass));
            userList.add(user);
            saveUserListToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Book single ticket
    public void bookTicket(String from, String to, String trainNumber, Date date) {
        try {
            // Check if the user is logged in
            // Check if the seats available
            // Book the ticket
            Ticket ticket = new Ticket(UUID.randomUUID().toString(), from, to, UUID.randomUUID().toString(), trainNumber, date);
            saveTicketToFile(ticket);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private  void saveTicketToFile(Ticket ticket) throws IOException {
        File ticketFile = new File("app/src/main/java/ticket/booking/db/tickets.json");
        List<Ticket> tickets = objectMapper.readValue(ticketFile, new TypeReference<List<Ticket>>() {
        });
        tickets.add(ticket);
        objectMapper.writeValue(ticketFile, tickets);
    }

    public boolean cancelTicket(String pnr) {
        try {
            // Check if the user is logged in
            // Check if the ticket exists
            // Cancel the ticket
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void fetchTickets() {
        user.printTickets();
    }

    private void saveUserListToFile() throws  IOException {
      File userFile = new File(USER_DB_PATH);
      objectMapper.writeValue(userFile, userList);
    }
}