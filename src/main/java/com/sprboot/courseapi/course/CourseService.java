package com.sprboot.courseapi.course;

import com.sprboot.courseapi.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService
{
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getCoursesByTopic(String topicId)
    {
        return courseRepository.findByTopicId(topicId);
    }

    public Optional<Course> getCourse(String id)
    {
        return courseRepository.findById(id);
    }

    public void addCourse(Course course)
    {
        //course.setTopic(new Topic(topicId,"",""));
        courseRepository.save(course);
    }

    public void updateCourse(Course course)
    {
        courseRepository.save(course);
    }

    public void deleteCourse(String id)
    {
        courseRepository.deleteById(id);
    }
}
