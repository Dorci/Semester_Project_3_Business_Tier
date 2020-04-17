package startApplication;

import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.http.ResponseEntity;
import startApplication.DbModel.User;
import startApplication.ViewModel.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/startApplication/api")
public class EventController extends ControllerNeeds
{




//    @RequestMapping(value = "/CreateEvent", method = RequestMethod.POST)
//mapped to the greeting() method. @RequestMapping maps all HTTP operations by default. Use @RequestMapping(method=GET) to narrow this mapping.
//    @ResponseStatus(HttpStatus.CREATED)
//    public String createEvent() {

//        eventService.createEvent(event);
//        System.out.println(event.toString());
//        return "Event created" + event.getDescription();
//    }
//
//    @RequestMapping(value = "/CancelEvent", method = RequestMethod.DELETE)
//    public String CancelEvent(@RequestBody Event event) {event
//        eventService.deleteEvent(event);
//        System.out.println(event.toString());
//        return "event cancelled";}


    @RequestMapping(value = "/Events", method = RequestMethod.GET)
    public ResponseEntity<List<Event>> searchEvents(@RequestParam String city)
    {
        String events;
        if (city != null) {
            events = restTemplate.getForObject(dataTierURL, String.class);
        }
        else
            {
                return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
             }
        try {
            List<startApplication.DbModel.Event> eventsDb = objectMapper.readValue(events, Event.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Event> eventsVm = new ArrayList<>();




    }

}

