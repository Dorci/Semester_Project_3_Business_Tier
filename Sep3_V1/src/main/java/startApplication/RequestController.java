package startApplication;

import startApplication.model.Request;
import org.springframework.web.bind.annotation.*;

@RestController
public class RequestController
{
    @RequestMapping(value = "/sendRequest",method = RequestMethod.POST)

    public Request sendRequest(@RequestBody Request request)
    {
        System.out.println(request.toString());
        return request;
    }

    @RequestMapping(value = "/cancelRequest",method = RequestMethod.DELETE)
    public Request CancelRequest(@RequestBody Request request)
    {
        System.out.println(request.toString());
        return request;
    }

    @RequestMapping(value = "/decline",method = RequestMethod.PATCH)
    public Request DeclineRequest(@RequestBody Request request)
    {
        System.out.println(request.toString());
        return request;
    }

    @RequestMapping(value = "/accept",method = RequestMethod.PATCH)
    public Request AcceptRequest(@RequestBody Request request)
    {
        System.out.println(request.toString());
        return request;
    }
}
