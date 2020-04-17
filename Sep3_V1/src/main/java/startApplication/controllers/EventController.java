package startApplication.controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import startApplication.DbModel.AddressDb;
import startApplication.DbModel.CityDb;
import startApplication.DbModel.EventDb;
import startApplication.ApplicationModel.EventVm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/startApplication/api")
public class EventController extends ControllerNeeds {

    @RequestMapping(value = "/eventsId", method = RequestMethod.GET)
    public Object getEventById(@RequestParam(value = "eventId") Integer eventId) {

        List<EventVm> translatedEvents = new ArrayList<>();
        if (eventId != 0) {
            String events = restTemplate.getForObject(dataTierURL + "/diningEvents/eventsId?eventId=" + eventId, String.class);
            translatedEvents = translateObjectsFromDataTierToApplicationTier(events);
        }
        return ResponseEntity.status(HttpStatus.OK).body(translatedEvents);
    }


    @RequestMapping(value = "/newEvent", method = RequestMethod.POST)
    public ResponseEntity<?> createEvent(@RequestBody EventVm event) {
        CityDb cityDb = new CityDb(event.getCity(), event.getPostalCode());
        AddressDb addressdb = new AddressDb(event.getStreetName(), event.getBuildingNumber(), cityDb, event.getFlatNumber(), event.getBlockNo(), event.getFloorNo());

        EventDb eventDb = new EventDb(event.getUserID(), addressdb, event.getDate(), event.getStartTime(), event.getEndTime(), event.getMaxNoOfGuests(), event.getAgeLimit(), event.isPets(), event.getDescription(), event.isEntertainment(), event.getEntryFee(), event.isDrinksVm(), event.getStarter(), event.getMainCourse(), event.getDessert());
        var response = restTemplate.postForEntity(dataTierURL + "/diningEvents/newEvent", eventDb, EventDb.class);
        return response;
    }


    @RequestMapping(value = "/events", method = RequestMethod.GET)
    public ResponseEntity<?> getAllEvents() {
        String events = restTemplate.getForObject(dataTierURL + "/diningEvents/events", String.class);
        List<EventVm> translatedEvents = translateObjectsFromDataTierToApplicationTier(events);
        return ResponseEntity.status(HttpStatus.OK).body(translatedEvents);
    }


    @RequestMapping(value = "/details", method = RequestMethod.GET)
    public ResponseEntity<?> eventDetails(@RequestBody String eventId) {
        String events = restTemplate.getForObject(dataTierURL + "/diningEvents/events/" + eventId, String.class);
        List<EventVm> translatedEvents = translateObjectsFromDataTierToApplicationTier(events);
        return ResponseEntity.status(HttpStatus.OK).body(translatedEvents);
    }


    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public Object searchEventByCity(@RequestParam(value = "city") String city) {
        List<EventVm> translatedEvents = new ArrayList<>();
        if (city != null) {
            String events = restTemplate.getForObject(dataTierURL + "/diningEvents/search?city=" + city, String.class);
            translatedEvents = translateObjectsFromDataTierToApplicationTier(events);
        }
        return ResponseEntity.status(HttpStatus.OK).body(translatedEvents);
    }


    private List<EventVm> translateObjectsFromDataTierToApplicationTier(String events) {
        try {
            List<EventDb> eventsFromDatabase = objectMapper.readValue(events, new TypeReference<List<EventDb>>() {
            });

            List<EventVm> eventsForUser = new ArrayList<>();

            for (EventDb databaseEvent : eventsFromDatabase) {
                System.out.println(databaseEvent);
                EventVm eventForView = new EventVm(databaseEvent.getEventId(), databaseEvent.getAddress().getStreetName(), databaseEvent.getAddress().getCity().getCityName(), databaseEvent.getAddress().getCity().getPostalCode(), databaseEvent.getAddress().getBlock(), databaseEvent.getAddress().getFloor(), databaseEvent.getAddress().getFlat(), databaseEvent.getAddress().getBuildingNo(), databaseEvent.getDateOfEvent(), databaseEvent.getStartTime(), databaseEvent.getEndTime(), databaseEvent.getMaxNoOfGuests(), databaseEvent.getAgeLimit(), databaseEvent.getPets(), databaseEvent.getDescription(), databaseEvent.getEntertainment(), databaseEvent.getEntryFee(), databaseEvent.getAlcoholicDrink(), databaseEvent.getStarter(), databaseEvent.getMainCourse(), databaseEvent.getDessert());
                eventsForUser.add(eventForView);
            }

            return eventsForUser;


        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<EventVm>();
        }

    }

}
