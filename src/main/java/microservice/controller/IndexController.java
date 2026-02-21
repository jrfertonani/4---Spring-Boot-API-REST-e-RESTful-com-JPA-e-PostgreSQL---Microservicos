package microservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class IndexController {

    @GetMapping(value = "/")
    public ResponseEntity init(){
        return new ResponseEntity("Begin !", HttpStatus.OK);
    }



}
