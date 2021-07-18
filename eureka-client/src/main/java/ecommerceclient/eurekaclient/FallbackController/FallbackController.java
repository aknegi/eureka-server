package ecommerceclient.eurekaclient.FallbackController;

import ecommerceclient.eurekaclient.dto.MessageDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class FallbackController {
    @RequestMapping(value = "/e-commerce-application")
    public ResponseEntity<MessageDTO> ecommerceApplication(){
        DateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        MessageDTO messageDTO=new MessageDTO(dateFormat.format(new Date()));
        messageDTO.setMessage("Service is taking too long to respond or is down. Please try again later.");
        return new ResponseEntity<MessageDTO>(messageDTO, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
