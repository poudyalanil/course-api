package com.anil.cms.courseapi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

    List<Topic> topics = new ArrayList<>(Arrays.asList(
              new Topic("big-data","Big Data","Study of big data technolgis and underlying techniques"), 
              new Topic("ai","Artificial Intelligence","Study of machine learning and artificial intelligence"), 
              new Topic("database-studies","Database Studies","Study of database magement systems"), 
              new Topic("comp-mathematics","Computational Mathematics","Study of big mathematics used during computations")
    ));
        
    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
       return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
