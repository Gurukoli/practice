package com.example.demo.serviceImpl;

import com.example.demo.model.StatusDetails;
import com.example.demo.service.StatusService;
import org.springframework.stereotype.Component;

@Component
public class StatusServiceImpl implements StatusService {

    @Override
    public StatusDetails getStatus() {
        return new StatusDetails("pass");
    }
}
