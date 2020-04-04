package com.yt.backendbeta.Service;


import java.util.List;

import com.yt.backendbeta.Entity.Course;

public interface CourseInterface {
    public void addCourse(Course course);
    public int getCourseId(String course);
    public Course getCourseObject(String course);
    public List<Course> getAllCourse();
    public boolean updateCourse(Course course) throws Exception;
}
