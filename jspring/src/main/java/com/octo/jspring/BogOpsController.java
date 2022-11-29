package com.octo.jspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/bogops")
public class BogOpsController {

    @GetMapping(value = "hello")
    public String hello() {
      return "tki";
    }

}
