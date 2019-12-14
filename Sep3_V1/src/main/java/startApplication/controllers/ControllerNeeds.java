package startApplication.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

public class ControllerNeeds
{
    protected String dataTierURL = "http://localhost:44355";
    protected  final RestTemplate restTemplate = new RestTemplate();
    protected final ObjectMapper objectMapper = new ObjectMapper();

}
