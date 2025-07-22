package com.SpringBooteTarea.Tarea;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DemoRestController {

    @GetMapping("/")
    public String getTarea(){
        return "Esta es la terea de Spring Boot "+ "de "+ this.nombre + this.apellido+ "!";

    }
@Value("${nombre}")
    private String nombre;

    @Value("${apellido}")
    private String apellido;
}
