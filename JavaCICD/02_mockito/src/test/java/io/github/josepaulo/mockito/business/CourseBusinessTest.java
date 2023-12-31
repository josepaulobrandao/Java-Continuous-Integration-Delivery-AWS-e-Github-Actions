package io.github.josepaulo.mockito.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.github.josepaulo.mockito.service.CourseService;
import io.github.josepaulo.mockito.stub.CourseServiceStubTest;

class CourseBusinessTest {

    @Test
    void testCoursesRelatedToSpring_When_UsingAStub() {

        // Given / Arrange
        CourseService stubService = new CourseServiceStubTest();
        CourseBusiness business = new CourseBusiness(stubService);
        
        // When / Act
        var filteredCourses = business.retriveCoursesRelatedToSpring("Spring");
        
        // Then / Assert
        assertEquals(4, filteredCourses.size());
    }
    
    @Test
    void testCoursesRelatedToSpring_When_UsingAFooBarStudent() {
        
        // Given / Arrange
        CourseService stubService = new CourseServiceStubTest();
        CourseBusiness business = new CourseBusiness(stubService);
        
        // When / Act
        var filteredCourses = business.retriveCoursesRelatedToSpring("Foo Bar");
        
        // Then / Assert
        assertEquals(0, filteredCourses.size());
    }

}
