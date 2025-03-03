package ticket.booking.entities;

import java.util.List;

public class User {
    private String userId;
    private String name;
    private String email;
    private String password;
    private List<Ticket> ticketBooked;

    public User(String userId, String name, String email, String password, List<Ticket> ticketBooked) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.ticketBooked = ticketBooked;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Ticket> getTicketBooked() {
        return ticketBooked;
    }

    public void setTicketBooked(List<Ticket> ticketBooked) {
        this.ticketBooked = ticketBooked;
    }
}
