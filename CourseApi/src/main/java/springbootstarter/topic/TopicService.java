package springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	@Autowired
	private TopicRepositoty topicRepository;

	
	public List<Topic> getAllTopics()
	{
		List<Topic> topics = new ArrayList();
		
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id)
	{
		return topicRepository.findOne(id);
	}

	public void addtopic(Topic topic) {
		topicRepository.save(topic);
		
	}

	public void updatetopic(Topic topic) {
		// TODO Auto-generated method stub
		
		topicRepository.save(topic);
		
	}

	public void deletetopic(String topicid) {
		// TODO Auto-generated method stub
		
		topicRepository.delete(topicid);
		
	}
}
 
