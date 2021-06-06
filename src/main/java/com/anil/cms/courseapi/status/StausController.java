package com.anil.cms.courseapi.status;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StausController {
    
     @Autowired
    private StatusService statusService;

    @RequestMapping("/")
    public List<Status> getStatus() {
        return statusService.getStatusInfo();
    }
    
}
