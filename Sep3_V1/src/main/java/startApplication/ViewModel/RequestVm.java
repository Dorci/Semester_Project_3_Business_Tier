package startApplication.ViewModel;

import java.util.Date;

public class RequestVm
{
    private EventVm eventVm;
    private String message;
    private Date date;
    private String timeStamp;


    public RequestVm(EventVm eventVm, String message, Date date, String timeStamp) {
        this.eventVm = eventVm;
        this.message = message;
        this.date = date;
        this.timeStamp = timeStamp;
    }
    public EventVm getEventVm() {
        return eventVm;
    }

    public void setEventVm(EventVm eventVm) {
        this.eventVm = eventVm;
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
                "event=" + eventVm +
                ", message='" + message + '\'' +
                ", date=" + date +
                ", timeStamp='" + timeStamp + '\'' +
                '}';
    }
}
