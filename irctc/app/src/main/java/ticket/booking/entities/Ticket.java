package ticket.booking.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticket {
    private String ticketId;
    private String from;
    private String to;
    private String pnr;
    private String trainId;
    private Date dateOfJourney;

    // Default constructor
    public Ticket() {
    }

    // Parameterized constructor with JsonCreator annotation
    @JsonCreator
    public Ticket(@JsonProperty("ticketId") String ticketId,
                  @JsonProperty("from") String from,
                  @JsonProperty("to") String to,
                  @JsonProperty("pnr") String pnr,
                  @JsonProperty("trainId") String trainId,
                  @JsonProperty("dateOfJourney") Date dateOfJourney) {
        this.ticketId = ticketId;
        this.from = from;
        this.to = to;
        this.pnr = pnr;
        this.trainId = trainId;
        this.dateOfJourney = dateOfJourney;
    }

    // Getters and setters
    public Date getDateOfJourney() {
        return dateOfJourney;
    }

    public void setDateOfJourney(Date dateOfJourney) {
        this.dateOfJourney = dateOfJourney;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
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
}
