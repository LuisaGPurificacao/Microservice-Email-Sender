package br.com.ms.email.controllers;

import br.com.ms.email.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmailController {

    @Autowired
    EmailService service;

}
