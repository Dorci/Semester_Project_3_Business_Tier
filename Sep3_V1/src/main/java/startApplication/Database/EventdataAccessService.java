package startApplication.Database;

import org.springframework.stereotype.Repository;
import startApplication.model.Event;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class EventdataAccessService implements EventDb
{

    private static List<Event> events = new ArrayList<>();


    @Override
    public int createEvent(UUID id, Event event)
    {
        URL url = null;
        try {
            url = new URL("https://localhost:5001/api/values" );
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try {
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
        } catch (IOException e) {
            e.printStackTrace();
        }
        events.add(event);
        return 1;
    }

    @Override
    public int deleteEvent(UUID id, Event event) {
        events.remove(event);
        return 1;
    }
}
