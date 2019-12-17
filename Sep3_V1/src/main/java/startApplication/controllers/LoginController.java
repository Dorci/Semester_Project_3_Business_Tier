//package startApplication.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import startApplication.socket.Login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
//
//@RestController
//@RequestMapping("startApplication/api")
//public class LoginController extends ControllerNeeds {
//
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public ResponseEntity<String> login(@RequestBody Login login) {
//        try {
//            Socket socket = new Socket("localhost", 4567);
//            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
//            String json = objectMapper.writeValueAsString(login);
//            output.println(json);
//
//            //It will contain "Email not found" or "Password mismatched" or "Login successful"
//            String responseFromTier3 = input.readLine();
//            if (responseFromTier3.equals("Email not found") || responseFromTier3.equals("Password mismatched")) {
//                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Try again!");
//
//            } else {
//                return ResponseEntity.status(HttpStatus.OK).body("Login successful");
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Try again!");
//
//        }
//
//
//    }


//}
