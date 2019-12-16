package startApplication.controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import startApplication.DbModel.EventDb;
import startApplication.DbModel.UserDb;
import startApplication.ViewModel.EventVm;
import startApplication.ViewModel.UserVm;
import startApplication.controllers.ControllerNeeds;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/startApplication/api")
public class UserController extends ControllerNeeds
{
    private List<UserDb> users = new ArrayList<>();
    private List<UserVm> usersView = new ArrayList<>();



    @RequestMapping(value = "/userEmail", method = RequestMethod.GET)
    public Object getUserbyEmail(@RequestParam(value = "email") String email) {

        if (email != null) {

            String users = restTemplate.getForObject("https://localhost:5001/api/users/userEmail?email=" + email, String.class);

            try {
                List<UserDb> usersFromDatabase = objectMapper.readValue(users, new TypeReference<List<UserDb>>() {
                });

                List<UserVm> usersForView = new ArrayList<>();

                for (UserDb userDb : usersFromDatabase) {
//
                    UserVm userVm = new UserVm(userDb.getUserId(),userDb.getFirstName(),userDb.getLastName(),userDb.getEmailAddress(),userDb.getDob());
                    usersForView.add(userVm);

                }

                return ResponseEntity.status(HttpStatus.OK).body(usersForView);


            } catch (IOException e) {
                e.printStackTrace();

            }
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Try again!");
    }

//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    @ResponseStatus(HttpStatus.CREATED)
//    public ResponseEntity<?> addNewUser(@RequestBody UserVm userVm)
//    {
//
////        List<UserDb> userDb = new ArrayList<>();
//
//
////
////        String resourceUrl
////                = "https://:5001/api/values";
////        RestTemplate restTemplate = new RestTemplate();
////
////        HttpEntity<UserVm> request = new HttpEntity<>();
////        UserDb users = restTemplate.postForObject(resourceUrl, request, UserDb.class);
////
////
////        ResponseEntity<UserDb> response = restTemplate
////                .exchange(resourceUrl, HttpMethod.POST, request, UserDb.class);
////
////
////        UserDb userDb1 = response.getBody();
//
//        UserDb userDb = new UserDb(userVm.getUserId(),userVm.getFirstName(),userVm.getLastName(),userVm.getEmailAddress(),userVm.getDob(),userVm.getPassword(),userVm.getConfirmPassword());
//        users.add(userDb);
//        System.out.println(users);
//        System.out.println(userDb);
//        //System.out.println(eventsView);
//        System.out.println("user added");
//        return ResponseEntity.status(HttpStatus.CREATED).body(users);
//
//    }

//    @RequestMapping(value = "/userDetails",method = RequestMethod.GET)
//    public ResponseEntity<?> eventDetails(@RequestBody String userId)
//    {
//        for (int i =0; i<users.size();i++)
//        {
//            if(users.get(i).getUserId() == userId)
//            {
//                return ResponseEntity.status(HttpStatus.OK).body(users.get(i));
//            }
//        }
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User does not exist!");
//
//    }


    @RequestMapping(value = "/allUsers", method = RequestMethod.GET)
//mapped to the greeting() method. @RequestMapping maps all HTTP operations by default. Use @RequestMapping(method=GET) to narrow this mapping.
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public ResponseEntity<?> getAllUsers() {

//        for (int i = 0; i < 50; i++){
//            userDbs.add(new UserDb("asd", "asdas", "asdasd", 5, "agsdf"));
//        }
//        String users;
//
//        RestTemplate restTemplate = new RestTemplate();
//        String resourceUrl
//                = "http://localhost:5000/api/values";
//        ResponseEntity<String> response
//                = restTemplate.getForEntity(resourceUrl, String.class);
//
////        return"Request sent to retrieve all users";
////        return new ResponseEntity<>("It's done!!", HttpStatus.OK);
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }

//    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
//    @ResponseStatus(HttpStatus.CREATED)
//    public ResponseEntity<?> updateUser(@RequestBody UserVm userVm)
//    {
//
////        List<UserDb> userDb = new ArrayList<>();
//
//
////
////        String resourceUrl
////                = "https://:5001/api/values";
////        RestTemplate restTemplate = new RestTemplate();
////
////        HttpEntity<UserVm> request = new HttpEntity<>();
////        UserDb users = restTemplate.postForObject(resourceUrl, request, UserDb.class);
////
////
////        ResponseEntity<UserDb> response = restTemplate
////                .exchange(resourceUrl, HttpMethod.POST, request, UserDb.class);
////
////
////        UserDb userDb1 = response.getBody();
//
//        UserDb userDb = new UserDb(userVm.getUserId(),userVm.getFirstName(),userVm.getLastName(),userVm.getEmailAddress(),userVm.getDob(),userVm.getPassword(),userVm.getConfirmPassword());
//        users.add(userDb);
//        System.out.println(users);
//        System.out.println(userDb);
//        //System.out.println(eventsView);
//        System.out.println("user updated");
//        return ResponseEntity.status(HttpStatus.ACCEPTED).body(users);
//
//    }


//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    public Object registerUser(@RequestBody UserVm userVm)
//    {
//
//        if (userVm!=null) {
//            UserDb newUser = new UserDb(userVm.getFirstName(),userVm.getLastName(),userVm.getEmailAddress(),userVm.getDob(),userVm.getPassword());
//            HttpEntity<UserDb> newUser = new HttpEntity<>();
//
//            try {
//                restTemplate.postForLocation("https://localhost:5001/api/users/newUser",newUser);
//                 return  new ResponseEntity<>(HttpStatus.CREATED);
//
//
//            } catch (RestClientException e) {
//                e.printStackTrace();
//                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//
//            }
//        }
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Try again!");
//    }
//
//
//
//
}
