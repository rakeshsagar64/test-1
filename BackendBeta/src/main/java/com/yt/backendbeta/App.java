package com.yt.backendbeta;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;

import com.yt.backendbeta.Entity.Course;
import com.yt.backendbeta.Entity.Student;
import com.yt.backendbeta.Service.CourseInterface;
import com.yt.backendbeta.ServiceImpl.CourseImpl;
import com.yt.backendbeta.Utility.ConnectorClass;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CourseInterface courseImpl = new CourseImpl();
       List<Course> allCourse = courseImpl.getAllCourse();
       System.out.println(allCourse);
    }	
}
