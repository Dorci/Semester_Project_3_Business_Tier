package startApplication.controllers;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import startApplication.DbModel.AddressDb;
import startApplication.DbModel.CityDb;
import startApplication.DbModel.EventDb;
import startApplication.ViewModel.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/startApplication/api")
public class EventController extends ControllerNeeds
{

    private List<EventDb> events = new ArrayList<>();
    private List<EventVm> eventsView = new ArrayList<>();


    @RequestMapping(value = "/newEvent", method = RequestMethod.POST)
    public ResponseEntity<?> createEvent(@RequestBody EventVm event) {
//        EventDb eventDb = new EventDb(event.getDate(), event.getStartTime(), event.getEndTime(), event.getDescription(), event.getLanguage(), event.getAddressVm(), event.getMaxNoOfGuests(), event.getAgeLimit(), event.isPets(), event.isEntertainment(), event.getDrinksVm(), event.getFoodMenuVm(), event.getEntryFee());
//
//        events.add(eventDb);
//        EventDb eventDb = new EventDb(event.getDate(),event.getStartTime(),event.getEndTime(),event.getDescription(),event.getLanguage(),event.getAddressVm(),event.getMaxNoOfGuests(),event.getAgeLimit(),event.isPets(),event.isEntertainment(),event.g,event.getFoodMenuVm(),event.getEntryFee());
////        HttpEntity<EventDb> eventDbHttpEntity = new HttpEntity<>(eventDb);
//        System.out.println(events.toString());
//        events.add(eventDb);
        CityDb cityDb = new CityDb(event.getCity(),event.getPostalCode());
        AddressDb addressdb = new AddressDb(event.getStreetName(),event.getBuildingNumber(),cityDb,event.getBlockNo() + "",event.getFloorNo());

        EventDb eventDb = new EventDb(Integer.parseInt(event.getUserID()),addressdb,event.getDate(),event.getStartTime(),event.getEndTime(),event.getMaxNoOfGuests(),event.getAgeLimit(),event.isPets(),event.getDescription(),event.isEntertainment(),event.getEntryFee(),event.isDrinksVm(),event.getStarter(),event.getMainCourse(),event.getDessert());

        System.out.println(event);
        System.out.println(eventDb);
        HttpEntity<EventDb> eventhttpEntity = new HttpEntity<>(eventDb);

        restTemplate.postForLocation("https://localhost:5001/api/diningEvents/newEvent", eventhttpEntity);
        var response = restTemplate.postForEntity("https://localhost:5001/api/diningEvents/newEvent", eventDb, EventDb.class);

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

    @RequestMapping(value = "/details",method = RequestMethod.GET)
    public ResponseEntity<?> eventDetails(@RequestBody String eventId)
    {
//        for (int i =0; i<events.size();i++)
//        {
//            if(events.get(i).getEventId() == eventId)
//            {
//                return ResponseEntity.status(HttpStatus.OK).body(events.get(i));
//            }
//        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Event does not exist!");

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



