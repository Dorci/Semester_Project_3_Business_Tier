package startApplication.controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import startApplication.DbModel.AddressDb;
import startApplication.DbModel.CityDb;
import startApplication.DbModel.EventDb;
import startApplication.ViewModel.EventVm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/startApplication/api")
public class EventController extends ControllerNeeds {

    private List<EventDb> events = new ArrayList<>();
    private List<EventVm> eventsView = new ArrayList<>();




    @RequestMapping(value = "/eventsId", method = RequestMethod.GET)
    public Object getEventbyId(@RequestParam(value = "eventId") Integer eventId) {

//        HttpEntity<String > eventHttpEntity = new HttpEntity<>(city);
        if (eventId != 0) {


//            return restTemplate.postForEntity
//        ("https://localhost:5001/api/diningEvents/eventsId", e, EventDb.class);
            String events = restTemplate.getForObject("https://localhost:5001/api/diningEvents/eventsId?eventId=" + eventId, String.class);

            try {
                List<EventDb> eventsFromDatabase = objectMapper.readValue(events, new TypeReference<List<EventDb>>() {
                });

                List<EventVm> eventsForUser = new ArrayList<>();

                for (EventDb databaseEvent : eventsFromDatabase) {
                    System.out.println(databaseEvent);
//                    CityVm cityForView = new CityVm(databaseEvent.getAddress().getCity().getCityName(),databaseEvent.getAddress().getCity().getPostalCode());
//                    AddressVm addressForView = new AddressVm(databaseEvent.getAddress().getStreetName(),databaseEvent.getAddress().getBuildingNo(),databaseEvent.getAddress().getCity().getCityName(),databaseEvent.getAddress().getCity().getPostalCode(),databaseEvent.getAddress().getBlock(),databaseEvent.getAddress().getFloor(),databaseEvent.getAddress().getFlat());
                    EventVm eventForView = new EventVm(databaseEvent.getEventId(), databaseEvent.getAddress().getStreetName(), databaseEvent.getAddress().getCity().getCityName(), databaseEvent.getAddress().getCity().getPostalCode(), databaseEvent.getAddress().getBlock(), databaseEvent.getAddress().getFloor(), databaseEvent.getAddress().getFlat(), databaseEvent.getAddress().getBuildingNo(), databaseEvent.getDateOfEvent(), databaseEvent.getStartTime(), databaseEvent.getEndTime(), databaseEvent.getMaxNoOfGuests(), databaseEvent.getAgeLimit(), databaseEvent.getPets(), databaseEvent.getDescription(), databaseEvent.getEntertainment(), databaseEvent.getEntryFee(), databaseEvent.getAlcoholicDrink(), databaseEvent.getStarter(), databaseEvent.getMainCourse(), databaseEvent.getDessert());
                    eventsForUser.add(eventForView);
                }

                return ResponseEntity.status(HttpStatus.OK).body(eventsForUser);


            } catch (IOException e) {
                e.printStackTrace();

            }
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Try again!");
    }


    @RequestMapping(value = "/newEvent", method = RequestMethod.POST)
    public ResponseEntity<?> createEvent(@RequestBody EventVm event) {
//        EventDb eventDb = new EventDb(event.getDate(), event.getStartTime(), event.getEndTime(), event.getDescription(), event.getLanguage(), event.getAddressVm(), event.getMaxNoOfGuests(), event.getAgeLimit(), event.isPets(), event.isEntertainment(), event.getDrinksVm(), event.getFoodMenuVm(), event.getEntryFee());
//
//        events.add(eventDb);
//        EventDb eventDb = new EventDb(event.getDate(),event.getStartTime(),event.getEndTime(),event.getDescription(),event.getLanguage(),event.getAddressVm(),event.getMaxNoOfGuests(),event.getAgeLimit(),event.isPets(),event.isEntertainment(),event.g,event.getFoodMenuVm(),event.getEntryFee());
////        HttpEntity<EventDb> eventDbHttpEntity = new HttpEntity<>(eventDb);
//        System.out.println(events.toString());
//        events.add(eventDb);
        CityDb cityDb = new CityDb(event.getCity(), event.getPostalCode());
        AddressDb addressdb = new AddressDb(event.getStreetName(), event.getBuildingNumber(), cityDb, event.getFlatNumber(), event.getBlockNo(), event.getFloorNo());

        EventDb eventDb = new EventDb(event.getUserID(), addressdb, event.getDate(), event.getStartTime(), event.getEndTime(), event.getMaxNoOfGuests(), event.getAgeLimit(), event.isPets(), event.getDescription(), event.isEntertainment(), event.getEntryFee(), event.isDrinksVm(), event.getStarter(), event.getMainCourse(), event.getDessert());

        System.out.println(event);
        System.out.println(eventDb);
        HttpEntity<EventDb> eventHttpEntity = new HttpEntity<>(eventDb);

//        restTemplate.postForLocation("https://localhost:44303/api/diningEvents/newEvent", eventHttpEntity);
        var response = restTemplate.postForEntity("https://localhost:44303/api/diningEvents/newEvent", eventDb, EventDb.class);

//        events.add(eventDb);
//        System.out.println(events);
//        System.out.println(event);
        //System.out.println(eventsView);
        System.out.println("Sent!");
        return response;
//        return ResponseEntity.status(HttpStatus.CREATED).body(null);


    }


//
//    @RequestMapping(value = "/CancelEvent", method = RequestMethod.DELETE)
//    public String CancelEvent(@RequestBody Event event) {event
//        eventService.deleteEvent(event);
//        System.out.println(event.toString());
//        return "event cancelled";}


    @RequestMapping(value = "/events", method = RequestMethod.GET)
    public ResponseEntity<?> allEvents() {
//        AddressVm addressVm = new AddressVm("silver street", 7, "Horsens", 8700, 7, 8);
//        DrinksVm drinksVm = new DrinksVm(true);
//        MenuVm menuVm = new MenuVm("chips", "fish", "rainbows");
//        eventsView.add(new EventVm("09-09-2019", "2:00", "16:00", "Part!", "English", addressVm, 90, 87, true, true, drinksVm, menuVm, 90,));


//        return restTemplate.getForObject("https://localhost:5001/api/diningEvents", String.class);
        return ResponseEntity.status(HttpStatus.OK).body(events);
    }

//
//    @RequestMapping(value = "/search", method = RequestMethod.GET)
//    public ResponseEntity<?> searchEvents(@RequestParam String city) {
//        if (city != null) {
//            for (int j = 0; j < events.size(); j++) {
//                if (city == events.get(j).getCity()) ;
//                return ResponseEntity.status(HttpStatus.OK).body(events.get(j));
//
//
//            }
//        }
//
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Search again!");
//
//
//    }

    @RequestMapping(value = "/details", method = RequestMethod.GET)
    public ResponseEntity<?> eventDetails(@RequestBody String eventId) {
//        for (int i =0; i<events.size();i++)
//        {
//            if(events.get(i).getEventId() == eventId)
//            {
//                return ResponseEntity.status(HttpStatus.OK).body(events.get(i));
//            }
//        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Event does not exist!");

    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public Object searchEventByCity(@RequestParam(value = "city") String city) {


//        HttpEntity<String > eventHttpEntity = new HttpEntity<>(city);
        if (city != null) {


//            return restTemplate.postForEntity
//        ("https://localhost:5001/api/diningEvents/search", city, EventDb.class);
            String events = restTemplate.getForObject("https://localhost:5001/api/diningEvents/search?city=" + city, String.class);

            try {
                List<EventDb> eventsFromDatabase = objectMapper.readValue(events, new TypeReference<List<EventDb>>() {
                });

                List<EventVm> eventsForUser = new ArrayList<>();

                for (EventDb databaseEvent : eventsFromDatabase) {
//                    CityVm cityForView = new CityVm(databaseEvent.getAddress().getCity().getCityName(),databaseEvent.getAddress().getCity().getPostalCode());
//                    AddressVm addressForView = new AddressVm(databaseEvent.getAddress().getStreetName(),databaseEvent.getAddress().getBuildingNo(),databaseEvent.getAddress().getCity().getCityName(),databaseEvent.getAddress().getCity().getPostalCode(),databaseEvent.getAddress().getBlock(),databaseEvent.getAddress().getFloor(),databaseEvent.getAddress().getFlat());
                    EventVm eventForView = new EventVm(databaseEvent.getEventId(), databaseEvent.getAddress().getStreetName(), databaseEvent.getAddress().getCity().getCityName(), databaseEvent.getAddress().getCity().getPostalCode(), databaseEvent.getAddress().getBlock(), databaseEvent.getAddress().getFloor(), databaseEvent.getAddress().getFlat(), databaseEvent.getAddress().getBuildingNo(), databaseEvent.getDateOfEvent(), databaseEvent.getStartTime(), databaseEvent.getEndTime(), databaseEvent.getMaxNoOfGuests(), databaseEvent.getAgeLimit(), databaseEvent.getPets(), databaseEvent.getDescription(), databaseEvent.getEntertainment(), databaseEvent.getEntryFee(), databaseEvent.getAlcoholicDrink(), databaseEvent.getStarter(), databaseEvent.getMainCourse(), databaseEvent.getDessert());
                    eventsForUser.add(eventForView);
                }

                return ResponseEntity.status(HttpStatus.OK).body(eventsForUser);


            } catch (IOException e) {
                e.printStackTrace();

            }
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Search again!");
    }


    //Send back events to view after sending object reference to db
    //Event has to have a host in order to map email address
//    @RequestMapping(value = "history", method = RequestMethod.GET)
//    public ResponseEntity<?> historyOfEvents(@RequestBody UserVm userVm)
//    {
//        for (int i =0; i<events.size();i++
//             ) {
//
//
//            if ( userVm.setEmailAddress() == events.get(i).)
//        }
//
//    }


//        if (city != null) {
//            //passing raw JSON from tier1 to the data model of the 3rd tier
//            events = restTemplate.getForObject(dataTierURL, String.class);
//        } else {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//        List<EventDb> eventsDb = new ArrayList<>();
//        try {
//            eventsDb = objectMapper.readValue(events, new TypeReference<List<EventDb>>(){});
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        List<EventVm> eventsVm = new ArrayList<>();
//
//        return ResponseEntity.status(HttpStatus.OK).body(eventsDb);

//    @RequestMapping(value = "/updateEvent", method = RequestMethod.POST)
//    public ResponseEntity<?> updateEvent(@RequestBody EventVm event) {
////        EventDb eventDb = new EventDb(event.getDate(), event.getStartTime(), event.getEndTime(), event.getDescription(), event.getLanguage(), event.getAddressVm(), event.getMaxNoOfGuests(), event.getAgeLimit(), event.isPets(), event.isEntertainment(), event.getDrinksVm(), event.getFoodMenuVm(), event.getEntryFee());
////
////        events.add(eventDb);
////        EventDb eventDb = new EventDb(event.getDate(),event.getStartTime(),event.getEndTime(),event.getDescription(),event.getLanguage(),event.getAddressVm(),event.getMaxNoOfGuests(),event.getAgeLimit(),event.isPets(),event.isEntertainment(),event.g,event.getFoodMenuVm(),event.getEntryFee());
//////        HttpEntity<EventDb> eventDbHttpEntity = new HttpEntity<>(eventDb);
////        System.out.println(events.toString());
////        events.add(eventDb);
//
//        EventDb eventDb = new EventDb(event.getEventId(),event.getUserId(),event.getStreetName(),event.getCity(),event.getPostalCode(),event.getBlockNo(),event.getFloorNo(),event.getFlatNumber(),event.getBuildingNumber(),event.getDate(),event.getStartTime(),event.getEndTime(),event.getMaxNoOfGuests(),event.getAgeLimit(),event.isPets(),event.getDescription(),event.isEntertainment(),event.getEntryFee(),event.isEntertainment(),event.getStarter(),event.getMainCourse(),event.getDessert());
//        events.add(eventDb);
//        System.out.println(events);
//        System.out.println(eventsView);
//        return ResponseEntity.status(HttpStatus.ACCEPTED).body(events);
//
//
//    }

    @RequestMapping(value = "/cancelEvent", method = RequestMethod.POST)
    public ResponseEntity<?> cancelEvent(@RequestBody EventVm event) {
//        EventDb eventDb = new EventDb(event.getDate(), event.getStartTime(), event.getEndTime(), event.getDescription(), event.getLanguage(), event.getAddressVm(), event.getMaxNoOfGuests(), event.getAgeLimit(), event.isPets(), event.isEntertainment(), event.getDrinksVm(), event.getFoodMenuVm(), event.getEntryFee());
//
//        events.add(eventDb);
//        EventDb eventDb = new EventDb(event.getDate(),event.getStartTime(),event.getEndTime(),event.getDescription(),event.getLanguage(),event.getAddressVm(),event.getMaxNoOfGuests(),event.getAgeLimit(),event.isPets(),event.isEntertainment(),event.g,event.getFoodMenuVm(),event.getEntryFee());
////        HttpEntity<EventDb> eventDbHttpEntity = new HttpEntity<>(eventDb);
//        System.out.println(events.toString());
////        events.add(eventDb);
//        EventDb eventDb = new EventDb(event.getEventId(),event.getUserId(),event.getStreetName(),event.getCity(),event.getPostalCode(),event.getBlockNo(),event.getFloorNo(),event.getFlatNumber(),event.getBuildingNumber(),event.getDate(),event.getStartTime(),event.getEndTime(),event.getMaxNoOfGuests(),event.getAgeLimit(),event.isPets(),event.getDescription(),event.isEntertainment(),event.getEntryFee(),event.isEntertainment(),event.getStarter(),event.getMainCourse(),event.getDessert());
//        for(int i =0; i< events.size();i++)
//        {
//            if(event.getEventId() == events.get(i).getEventId())
//                events.remove(events.get(i));
//        }

        System.out.println(events);
        System.out.println("Event removed");
//        System.out.println(eventsView);
        return ResponseEntity.status(HttpStatus.CREATED).body(events);


    }
}



