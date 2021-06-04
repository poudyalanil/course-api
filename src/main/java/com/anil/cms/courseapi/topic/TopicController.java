package com.anil.cms.courseapi.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService; 

    @RequestMapping("/")
    public String home() {

        return "You can browse <br><strong>/topics <br> /topics/{id}</strong>";
    }

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {

        return topicService.getAllTopics();
    }

    
    @RequestMapping("/topics/{id}")
    public Topic getTopicic(@PathVariable String id) {
        return topicService.getTopic(id);
    }
    
}
