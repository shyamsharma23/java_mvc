<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
    
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>Student Information</h2>
      <form:form method = "POST" action = "addStudent" 
      modelAttribute="studentobj">
         <table>
            <tr>
               <td><form:label path = "studentid">Student code</form:label></td>
               <td><form:input path = "studentid" /></td>
            </tr>
            <tr>
               <td><form:label path = "studentname">Student Name</form:label></td>
               <td><form:input path = "studentname" /></td>
            </tr>
            <tr>
               <td><form:label path = "score">Score</form:label></td>
               <td><form:input path = "score" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
   
</html>