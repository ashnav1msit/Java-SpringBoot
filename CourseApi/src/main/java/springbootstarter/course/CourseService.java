package springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	
	@Autowired
	private CourseRepositoty courseRepository;

	
	public List<Course> getAllCourses(String topicId)
	{
		List<Course> course = new ArrayList();
		
		courseRepository.findByTopicId(topicId)
		.forEach(course::add);
		return course;
	}
	
	public Course getCourse(String id)
	{
		return courseRepository.findOne(id);
	}

	public void addcourse(Course course) {
		courseRepository.save(course);
		
	}

	public void updatecourse(Course course) {
		// TODO Auto-generated method stub
		
		courseRepository.save(course);
		
	}

	public void deletecourse(String courseid) {
		// TODO Auto-generated method stub
		
		courseRepository.delete(courseid);
		
	}
}
 
