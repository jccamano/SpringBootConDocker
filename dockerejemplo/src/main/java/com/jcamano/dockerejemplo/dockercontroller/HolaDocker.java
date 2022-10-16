package com.jcamano.dockerejemplo.dockercontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaDocker {

    @GetMapping("/hola")
    public ResponseEntity<String> getHolaDocker(){
        return ResponseEntity.ok("Hola Docker");
    }

}
