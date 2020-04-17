package startApplication.service;

import startApplication.Database.EventDb;
import startApplication.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService
{
    private final EventDb eventDb;

    @Autowired
    public EventService( EventDb eventDb)
    {
        this.eventDb = eventDb;
    }

    public int createEvent(Event event){
        return eventDb.createEvent(event);
    }

    public int deleteEvent(Event event)
    {
//        return eventDb.deleteEvent(event);
        return 0;
    }
}
