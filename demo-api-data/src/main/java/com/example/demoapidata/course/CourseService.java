package com.example.demoapidata.course;

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
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
//	private List<Topic> topics  = new ArrayList<Topic>(Arrays.asList(new Topic("Spring","Spring Framework","For Students"),
//			new Topic("Java","Core Java","Core Java Description"),
//			new Topic("Javascript","Javascript","Details of Javascript")));
	public List<Course> getAllCourses(String topicId) {
		// TODO Auto-generated method stub
		
		return courseRepository.findByTopicId(topicId);
	}
	public Optional<Course> getCourse(String id) {
	    return courseRepository.findById(id);
}
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		courseRepository.save(course);
		
	}
	public void updateCourse( Course course) {
		// TODO Auto-generated method stub
		courseRepository.save(course);

	}
	public void deleteCourse(String id) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(id);
	}

}