package com.anil.cms.courseapi.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        
        return Arrays.asList(
              new Topic("1","Big Data","Study of big data technolgis and underlying techniques"), 
              new Topic("2","Artificial Intelligence","Study of machine learning and artificial intelligence"), 
              new Topic("3","Database Studies","Study of database magement systems"), 
              new Topic("4","Computational Mathematics","Study of big mathematics used during computations")
                );
    }
    
}
