package microservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/usuario")
public class IndexController {

    @GetMapping(value = "/")
    public ResponseEntity init(@RequestParam(value = "nome", required= true, defaultValue = "Nome não informado!") String nome){
        System.out.println("Parametro sendo recebido!" + nome);
        return new ResponseEntity("Begin !" + nome, HttpStatus.OK);
    }



}
