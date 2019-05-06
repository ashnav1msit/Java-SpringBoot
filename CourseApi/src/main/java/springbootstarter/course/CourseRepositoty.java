package springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepositoty extends CrudRepository <Course, String> {
	
	public List<Course> findByName(String Name);
	public List<Course> findByDescription(String Description);	
	public List<Course> findByTopicId(String topicId);
}
