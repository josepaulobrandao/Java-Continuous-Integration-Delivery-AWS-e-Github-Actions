package io.github.josepaulo.mockito.business;

import java.util.ArrayList;
import java.util.List;

import io.github.josepaulo.mockito.service.CourseService;

// CourseBusiness = SUT - System (Method) Under Test
public class CourseBusiness {

    // CourseService is a Dependency
    private CourseService service;

    public CourseBusiness(CourseService service) {
        this.service = service;
    }
    
    public List<String> retriveCoursesRelatedToSpring(String student) {
        String fooBar = "Foo Bar";
        var filteredCourses = new ArrayList<String>();
        if(fooBar.equalsIgnoreCase(student))
        	return filteredCourses;
        
        var allCourses = service.retrieveCourses(student);
        
        for (String course : allCourses) {
            if (course.contains("Spring")) {
                filteredCourses.add(course);
            }
        }
        
        return filteredCourses;
    }
    public void deleteCoursesNotRelatedToSpring(String student) {
        
        var allCourses = service.retrieveCourses(student);
        
        for (String course : allCourses) {
            if (!course.contains("Spring")) {
            	service.deleteCourse(student);
            }
        }
        
    }
}
