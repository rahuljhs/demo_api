package com.powerup.demo.controller;

import com.powerup.demo.service.IOSUpdate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IOSUpdateController {

    private static final String template = "Hello, %s!";

    @GetMapping("/v1")
    public IOSUpdate v1(@RequestParam(value = "model", defaultValue = "13ProMax") String model, @RequestParam(value = "version", defaultValue = "15.1") String version) {
        return new IOSUpdate(model, Double.parseDouble(version), false, Double.parseDouble(version));
    }

    @GetMapping("/v2")
    public IOSUpdate v2(@RequestParam(value = "model", defaultValue = "13ProMax") String model, @RequestParam(value = "version", defaultValue = "15.1") String version) {
        return new IOSUpdate(model, Double.parseDouble(version), true, Double.parseDouble(version)+1);
    }
}
