package startApplication.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

public class ControllerNeeds
{
    protected String dataTierURL = "https://localhost:5001/api";
    protected  final RestTemplate restTemplate = new RestTemplate();
    protected final ObjectMapper objectMapper = new ObjectMapper();

}
