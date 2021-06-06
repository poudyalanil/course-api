package com.anil.cms.courseapi.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(method = RequestMethod.POST,value="/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopics(id, topic);
    }
}
