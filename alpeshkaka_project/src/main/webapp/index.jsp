<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Page</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
  </head>
  <body>
    <div class="container">
      <div class="row col-md-6 col-md-offset-3">
        <div class="panel panel-primary">
          <div class="panel-heading text-center">
            <h1>Form</h1>
          </div>
          <div class="panel-body">
          <b style="color: red;">
                <%
                      if(request.getAttribute("msg")!=null){
                    	  out.print(request.getAttribute("msg"));
                      }
                %>
                </b>
          
            <form action="MarksController" method="post">
              <div class="form-group">
                <label for="firstName"> Enrollment Number 
                </label>
                <input
                  type="text"
                  class="form-control"
                  id="enr"
                  name="enr"
                />
              </div>
              
              <div class="form-group">
                <label for="firstName"> Subject </label>
                <input
                  type="text"
                  class="form-control"
                  id="sub"
                  name="sub"
                />
              </div>

              
              <div class="form-group">
                <label for="number">Theory Marks</label>
                <input
                  type="number"
                  class="form-control"
                  id="the"
                  name="the"
                />
              </div>
              
              <div class="form-group">
                <label for="number">Practicle Marks</label>
                <input
                  type="number"
                  class="form-control"
                  id="pra"
                  name="pra"
                />
              </div>
              <button class="btn btn-primary" type="submit" name ="action" value ="add" >Submit</button>
            </form>
          </div>
          <div class="panel-footer text-right">
            <small>&copy; bhargav thesiya</small>
          </div>
        </div>
      </div>
    </div>
    
  </body>
</html>