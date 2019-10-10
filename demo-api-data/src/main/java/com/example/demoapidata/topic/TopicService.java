package com.example.demoapidata.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
//	private List<Topic> topics  = new ArrayList<Topic>(Arrays.asList(new Topic("Spring","Spring Framework","For Students"),
//			new Topic("Java","Core Java","Core Java Description"),
//			new Topic("Javascript","Javascript","Details of Javascript")));
	public List<Topic> getAllTopics() {
		// TODO Auto-generated method stub
		List <Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	public Optional<Topic> getTopic(String id) {
	    return topicRepository.findById(id);
}
	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topicRepository.save(topic);
		
	}
	public void updateTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		topicRepository.save(topic);

	}
	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topicRepository.deleteById(id);
	}

}
