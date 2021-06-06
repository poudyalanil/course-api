package com.anil.cms.courseapi.status;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StatusService {
   
     List<Status> status = Arrays.asList(
              new Status("0.01.00","https://github.com/poudyalanil/course-api","Good","200")
    );
        
    
    public List<Status> getStatusInfo() {
        return status;
    }
}
