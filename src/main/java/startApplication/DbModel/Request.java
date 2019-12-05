package startApplication.DbModel;

import java.util.Date;

public class Request
{

    private Event event;
    private String message;
    private Date date;
    private String timeStamp;


    public Request(Event event, String message, Date date, String timeStamp) {
        this.event = event;
        this.message = message;
        this.date = date;
        this.timeStamp = timeStamp;
    }
    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }



    @Override
    public String toString() {
        return "Request Created{" +
                "event=" + event +
                ", message='" + message + '\'' +
                ", date=" + date +
                ", timeStamp='" + timeStamp + '\'' +
                '}';
    }
}
