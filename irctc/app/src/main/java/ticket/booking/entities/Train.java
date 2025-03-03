package irctc.app.src.main.java.ticket.booking.entities;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Train {
    private String trainId;
    private String name;
    private String trainNumber;
    private List<List<Integer>> seatsAvailable;
    private Map<String, Schedule> schedule;

    public Train(String trainId, String name, String trainNumber, List<List<Integer>> seatsAvailable, Map<String, Schedule> schedule) {
        this.trainId = trainId;
        this.name = name;
        this.trainNumber = trainNumber;
        this.seatsAvailable = seatsAvailable;
        this.schedule = schedule;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public List<List<Integer>> getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(List<List<Integer>> seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public Map<String, Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, Schedule> schedule) {
        this.schedule = schedule;
    }
}
