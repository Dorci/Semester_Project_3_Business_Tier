package startApplication.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import startApplication.ApplicationModel.RequestVm;

//TODO : Implement this
@RestController
public class RequestController {
    @RequestMapping(value = "/sendRequest", method = RequestMethod.POST)
    public RequestVm sendRequest(@RequestBody RequestVm requestVm) {
        System.out.println(requestVm.toString());
        return requestVm;
    }

    @RequestMapping(value = "/cancelRequest", method = RequestMethod.DELETE)
    public RequestVm CancelRequest(@RequestBody RequestVm requestVm) {
        System.out.println(requestVm.toString());
        return requestVm;
    }

    @RequestMapping(value = "/decline", method = RequestMethod.PATCH)
    public RequestVm DeclineRequest(@RequestBody RequestVm requestVm) {
        System.out.println(requestVm.toString());
        return requestVm;
    }

    @RequestMapping(value = "/accept", method = RequestMethod.PATCH)
    public RequestVm AcceptRequest(@RequestBody RequestVm requestVm) {
        System.out.println(requestVm.toString());
        return requestVm;
    }
}
