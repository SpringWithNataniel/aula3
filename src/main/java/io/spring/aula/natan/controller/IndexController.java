package io.spring.aula.natan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com>
 */
@RestController
public class IndexController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "Endpoint inicial";
    }
    
}
