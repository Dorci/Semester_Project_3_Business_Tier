package startApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import startApplication.DbModel.User;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController extends ControllerNeeds
{



    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<List<startApplication.ViewModel.User>> addNewUser(User user)
    {





    String resourceUrl
            = "https://:5001/api/values";
    RestTemplate restTemplate = new RestTemplate();

    HttpEntity<startApplication.ViewModel.User> request = new HttpEntity<>();
    User users = restTemplate.postForObject(resourceUrl, request, User.class);


    ResponseEntity<startApplication.DbModel.User> response = restTemplate
            .exchange(resourceUrl, HttpMethod.POST, request, startApplication.DbModel.User.class);


    startApplication.DbModel.User user1 = response.getBody();
        return new ResponseEntity<>("It's done!",HttpStatus.OK);
}




    @RequestMapping(value = "/allUsers", method = RequestMethod.GET)
//mapped to the greeting() method. @RequestMapping maps all HTTP operations by default. Use @RequestMapping(method=GET) to narrow this mapping.
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public ResponseEntity<List<startApplication.ViewModel.User>> getAllUsers() {
        String users;

        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl
                = "http://localhost:5000/api/values";
        ResponseEntity<String> response
                = restTemplate.getForEntity(resourceUrl, String.class);

//        return"Request sent to retrieve all users";
        return new ResponseEntity<>("It's done!!", HttpStatus.OK);
    }








}
