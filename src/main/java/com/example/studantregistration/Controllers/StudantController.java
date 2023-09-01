package com.example.studantregistration.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studant")
public class StudantController {

    @Autowired
    private StudantController studantController;


}
