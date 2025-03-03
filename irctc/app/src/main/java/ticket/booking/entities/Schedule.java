package ticket.booking.entities;

import java.util.Date;

public class Schedule {
    private Date arrival;
    private Date departure;

    public Schedule(Date arrival, Date departure) {
        this.arrival = arrival;
        this.departure = departure;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }
}
