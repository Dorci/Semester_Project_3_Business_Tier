package startApplication.Database;

import startApplication.model.Event;

import java.util.UUID;

public interface EventDb
{
    int createEvent(UUID id, Event event);

    int deleteEvent(UUID id, Event event);

    default int createEvent(Event event) {
        UUID id = UUID.randomUUID();
        return createEvent(id, event);
    }
}
