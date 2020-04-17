package startApplication.controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import startApplication.DbModel.UserDb;
import startApplication.ApplicationModel.UserVm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/startApplication/api")
public class UserController extends ControllerNeeds {

    @RequestMapping(value = "/newUser", method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody UserVm userVm) {
        UserDb userDb = new UserDb(userVm.getFirstName(), userVm.getLastName(), userVm.getEmailAddress(), userVm.getDob(), userVm.getPassword());
        var response = restTemplate.postForObject(dataTierURL + "/users/newUser", userDb, UserDb.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public ResponseEntity<?> updateUser(@RequestBody UserVm userVm) {
        UserDb userDb = new UserDb(userVm.getUserId(), userVm.getFirstName(), userVm.getLastName(), userVm.getEmailAddress(), userVm.getDob(), userVm.getPassword());
        var response = restTemplate.postForObject(dataTierURL + "/users/newUser", userDb, UserDb.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


    @RequestMapping(value = "/userEmail", method = RequestMethod.GET)
    public ResponseEntity<?> getUserByEmail(@RequestParam(value = "email") String email) {
        List<UserVm> usersForApplicationTier = new ArrayList<>();
        if (email != null) {
            String users = restTemplate.getForObject(dataTierURL + "/users/userEmail?email=" + email, String.class);
            usersForApplicationTier = translateUserObjectsFromDataTierToApplicationTier(users);
        }
        return ResponseEntity.status(HttpStatus.OK).body(usersForApplicationTier);
    }


    private List<UserVm> translateUserObjectsFromDataTierToApplicationTier(String users) {
        try {
            List<UserDb> usersFromDatabase = objectMapper.readValue(users, new TypeReference<List<UserDb>>() {
            });
            List<UserVm> usersForView = new ArrayList<>();
            for (UserDb userDb : usersFromDatabase) {
                UserVm userVm = new UserVm(userDb.getUserId(), userDb.getFirstName(), userDb.getLastName(), userDb.getEmailAddress(), userDb.getDob());
                usersForView.add(userVm);
            }

            return usersForView;

        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }


    @RequestMapping(value = "/allUsers", method = RequestMethod.GET)
    public ResponseEntity<?> getAllUsers() {
        String users = restTemplate.getForObject(dataTierURL + "/users/allUsers", String.class);
        List<UserVm> usersForApplicationTier = translateUserObjectsFromDataTierToApplicationTier(users);
        return ResponseEntity.status(HttpStatus.OK).body(usersForApplicationTier);
    }
}
