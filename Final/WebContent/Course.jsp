<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Course</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<!-- <link rel="stylesheet" href="coursestyle.css">-->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/coursestyle.css" /> 
</head>

<body>
    <div class="container fluid p-10 col-lg-12 col-md-12 col-xs-12 col-sm-12">
        <div class="row" id="header">
            <h1>Course</h1>
        </div>
    </div>
    <div class="container fluid p-10 col-lg-12 col-md-12 col-xs-12 col-sm-12">
       <div class="row">
        <div class="col-lg-4 col-md-4 col-xs-12 col-sm-12">
           <div class="jumbotron" id="course-table">
               <h1>Add Course</h1><hr>          
                    <form action="addorupdatecourse" method="post">
                        <div class="custom-input">
                            <input type="text" name="courseName" placeholder="" required="">
                            <label for="">Course Name:</label>
                        </div>
                        <div class="custom-input">
                            <textarea required name="courseSyllabus"></textarea>
                            <label for="">Course Syllabus:</label> 
                         </div>
                         <div style="display: inline-block">    
                               <input type="submit" name="button" value="Create"></input>                                
                               <button onclick="location.href = 'Homepage.jsp';" class="button-wrapper">Home</button>                           
                         </div>
                    </form>                  
               </div>
          </div>
       
       
        <div class="col-lg-8 col-md-8 col-xs-12 col-sm-12">
            <div class="jumbotron" id="course-table">
                <h1>Course Table</h1><hr>  

                <div class="table-div">
                   
                     <div class="table-body">
                        <table class="content-table">
                        
                        <tbody>
                          <%for(Course cr:list) {%>
                              <tr>       
                              <td><%=cr.getId() %></td>
                              <td><%=cr.getCourseName() %></td>
                              <td><%=cr.getCourseSyllabus() %></td>                              
                          </tr>
                        <%}%>                       
                        </tbody>
                      </table>
                      </div>
                    </div>            
            </div>            
        </div>
           
                
       </div>
    </div> 
</body>
</html>