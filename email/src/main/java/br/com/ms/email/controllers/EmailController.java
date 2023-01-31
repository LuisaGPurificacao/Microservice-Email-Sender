package br.com.ms.email.controllers;

import br.com.ms.email.dtos.EmailDto;
import br.com.ms.email.models.EmailModel;
import br.com.ms.email.services.EmailService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EmailController {

    @Autowired
    EmailService service;

    @PostMapping("/sending-email")
    public ResponseEntity<EmailModel> sendingEmail(@RequestBody @Valid EmailDto emailDto) {
        EmailModel email = new EmailModel();
        BeanUtils.copyProperties(emailDto, email);
        service.sendEmail(email);
        return ResponseEntity.status(HttpStatus.CREATED).body(email);
    }

}
