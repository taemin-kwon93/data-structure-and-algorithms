package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleTest {
    private CourseSchedule courseSchedule;

    @BeforeEach
    void setUp() {
        courseSchedule = new CourseSchedule();
    }

    @Test
    void itShouldReturnTrueWhenCourseIsNotCycliGraph() {
        courseSchedule = new CourseSchedule();
        int numCourses = 3;
        int[][] prerequisites = {{1, 0}, {2, 1}};

        boolean result = courseSchedule.canFinish(numCourses, prerequisites);
        assertTrue(result);
    }

    @Test
    void itShouldReturnTrueWhenCourseIsNotCycliGraph2() {
        courseSchedule = new CourseSchedule();
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};

        boolean result = courseSchedule.canFinish(numCourses, prerequisites);
        assertTrue(result);
    }

    // 이 예시로 공부하기 좋음
    @Test
    void itShouldReturnTrueWhenCourseIsNotCycliGraph3() {
        courseSchedule = new CourseSchedule();
        int numCourses = 6;
        int[][] prerequisites = {{1, 0}, {2, 1}, {3, 1}, {4, 2}, {4, 3}, {5, 4}};

        boolean result = courseSchedule.canFinish(numCourses, prerequisites);
        assertTrue(result);
    }

    @Test
    void itShouldReturnFalseWhenCourseIsCyclicGraph() {
        courseSchedule = new CourseSchedule();
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}, {0, 1}};

        boolean result = courseSchedule.canFinish(numCourses, prerequisites);
        assertFalse(result);
    }
}