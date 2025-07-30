package com.example.demo.controller;

import com.example.demo.model.StatusDetails;
import com.example.demo.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class EmployeeController {

    @Autowired
    private StatusService statusService;


@GetMapping("/getStatus")
public ResponseEntity<StatusDetails> getStatus(){
    return ResponseEntity.ok(statusService.getStatus());
}

}
