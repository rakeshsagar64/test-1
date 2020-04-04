package com.src.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.yt.backendbeta.Entity.Course;
import com.yt.backendbeta.Service.CourseInterface;
import com.yt.backendbeta.ServiceImpl.CourseImpl;

/**
 * Servlet implementation class Course
 */

@WebServlet("/addorupdatecourse")
public class AddOrUpdateCourse extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddOrUpdateCourse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String courseSyllabus = request.getParameter("courseSyllabus");
		String courseName = request.getParameter("courseName");
		if(courseName != null) {
			CourseInterface courseImpl= new CourseImpl();
			Course course = courseImpl.getCourseObject(courseName.toUpperCase());	
			if (course != null) {
				try {
					courseImpl.updateCourse(course);
					request.setAttribute("message", "course updated successfully");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					request.setAttribute("message", "Something Went Wrong!!!");
					e.printStackTrace();
				}
			} else {
				request.setAttribute("message", "course added successfully");
				course = new Course();
				course.setCourseName(courseName);
				course.setCourseSyllabus(courseSyllabus);
				courseImpl.addCourse(course);
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher("getcourse"); 
        rd.forward(request, response);
	}

}
