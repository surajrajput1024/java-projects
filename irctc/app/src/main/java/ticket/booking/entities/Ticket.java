package ticket.booking.entities;


public class Ticket {
    private String ticketId;
    private String from;
    private String to;
    private String pnr;
    private Train train;

    public Ticket(String ticketId, String from, String to, String pnr, Train train) {
        this.ticketId = ticketId;
        this.from = from;
        this.to = to;
        this.pnr = pnr;
        this.train = train;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
}
