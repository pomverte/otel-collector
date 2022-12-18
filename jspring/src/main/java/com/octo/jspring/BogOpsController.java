package com.octo.jspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class BogOpsController {

  @Autowired
  private BogOpsRepository bogOpsRepository;

  @GetMapping(value = "bogops")
  public String hello() {
    return String.format("Il y a %s bogops !", bogOpsRepository.findAll().size());
  }

  @GetMapping(value = "salut")
  public String salut() {
    return "tki";
  }

}
