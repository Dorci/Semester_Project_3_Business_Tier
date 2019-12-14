package startApplication.DbModel;

import java.util.Date;

public class RequestDb
{

    private EventDb eventDb;
    private String message;
    private Date date;
    private String timeStamp;


    public RequestDb(EventDb eventDb, String message, Date date, String timeStamp) {
        this.eventDb = eventDb;
        this.message = message;
        this.date = date;
        this.timeStamp = timeStamp;
    }
    public EventDb getEventDb() {
        return eventDb;
    }

    public void setEventDb(EventDb eventDb) {
        this.eventDb = eventDb;
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
                "event=" + eventDb +
                ", message='" + message + '\'' +
                ", date=" + date +
                ", timeStamp='" + timeStamp + '\'' +
                '}';
    }
}
