<%@page import="com.tpddl.bts.users.dto.UserDTO,com.tpddl.bts.users.dto.RightDTO,java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
   <%--  <%@page isELIgnored="false" %> --%>
      <%@ page import="com.tpddl.bts.utils.MessageBundle" %> 
<%@ page import="com.tpddl.bts.utils.CommonConstants" %> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="tpddl" tagdir="/WEB-INF/tags" %>
<!doctype html>
<html lang="en">
<!-- this is html comment -->
<%@include file="partials/head.jsp" %>
<%-- <jsp:include page="partials/head.jsp"></jsp:include> --%>

    <body>
    <%! private  int counter = 1; %>
    <%-- <%! 
    
    public void jspInit() {
    	System.out.println("Hello JSP INit ");
    }
    %> --%>
  <%
  if(session.getAttribute("userinfo")==null){
	  response.sendRedirect("login.jsp");
  }
  %>
    
    <jsp:include page="partials/header.jsp">
    <jsp:param value="SignOut" name="name"/>
    
    </jsp:include>

<div class="container-fluid">

 <%
 
        UserDTO userDTO = (UserDTO)session.getAttribute("userinfo");
        
        
        %> 
  <div class="row">
    <nav class="col-md-2 d-none d-md-block bg-light sidebar">
      <div class="sidebar-sticky">
        <ul class="nav flex-column">
        <c:forEach var="right" items="${sessionScope.userinfo.role.rights}">
         <li class="nav-item">
           						 <a class='nav-link' href="${right.link}">
             						 <span data-feather="file"></span>
             						${right.name}
           						 </a>
         				 </li>
        </c:forEach>
       		<%-- <%
       			ArrayList<RightDTO> rights = userDTO.getRole().getRights();
       			if(rights!=null){
       				int counter = 1;
       				for(RightDTO right: rights){
       					%>
       					 <li class="nav-item">
           						 <a class='nav-link <%=counter==1?"active":"" %>' href="<%=right.getLink()%>">
             						 <span data-feather="file"></span>
             						 <%=right.getName()%>
           						 </a>
         				 </li>
       				<% 	
       				counter++;
       				}
       			}
       		%> --%>
                  </ul>

                </ul>
      </div>
    </nav>

    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
         <%-- EL Session Scope is ::::: ${sessionScope.userinfo.role.rights} --%>
       <h1 class="h2">Welcome ${sessionScope.userinfo.name} , Role is ${sessionScope.userinfo.role.name} </h1>
       <tpddl:date lang="hi" country="IN"/>
        <%-- <h1 class="h2">Welcome <%=userDTO.getName() %> , Role is <%=userDTO.getRole().getName() %></h1> --%>
        <div class="btn-toolbar mb-2 mb-md-0">
          <div class="btn-group mr-2">
            <button type="button" class="btn btn-sm btn-outline-secondary">Share</button>
            <button type="button" class="btn btn-sm btn-outline-secondary">Export</button>
          </div>
          <button type="button" class="btn btn-sm btn-outline-secondary dropdown-toggle">
            <span data-feather="calendar"></span>
            This week
          </button>
        </div>
      </div>
		<p>Salary is <tpddl:currency val="9000"/></p>
      <canvas class="my-4 w-100" id="myChart" width="900" height="380"></canvas>

      <h2>Section title</h2>
      <div class="table-responsive">
        <table class="table table-striped table-sm">
          <thead>
            <tr>
              <th>#</th>
              <th>Header</th>
              <th>Header</th>
              <th>Header</th>
              <th>Header</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>1,001</td>
              <td>Lorem</td>
              <td>ipsum</td>
              <td>dolor</td>
              <td>sit</td>
            </tr>
            <tr>
              <td>1,002</td>
              <td>amet</td>
              <td>consectetur</td>
              <td>adipiscing</td>
              <td>elit</td>
            </tr>
            <tr>
              <td>1,003</td>
              <td>Integer</td>
              <td>nec</td>
              <td>odio</td>
              <td>Praesent</td>
            </tr>
            <tr>
              <td>1,003</td>
              <td>libero</td>
              <td>Sed</td>
              <td>cursus</td>
              <td>ante</td>
            </tr>
            <tr>
              <td>1,004</td>
              <td>dapibus</td>
              <td>diam</td>
              <td>Sed</td>
              <td>nisi</td>
            </tr>
            <tr>
              <td>1,005</td>
              <td>Nulla</td>
              <td>quis</td>
              <td>sem</td>
              <td>at</td>
            </tr>
            <tr>
              <td>1,006</td>
              <td>nibh</td>
              <td>elementum</td>
              <td>imperdiet</td>
              <td>Duis</td>
            </tr>
            <tr>
              <td>1,007</td>
              <td>sagittis</td>
              <td>ipsum</td>
              <td>Praesent</td>
              <td>mauris</td>
            </tr>
            <tr>
              <td>1,008</td>
              <td>Fusce</td>
              <td>nec</td>
              <td>tellus</td>
              <td>sed</td>
            </tr>
            <tr>
              <td>1,009</td>
              <td>augue</td>
              <td>semper</td>
              <td>porta</td>
              <td>Mauris</td>
            </tr>
            <tr>
              <td>1,010</td>
              <td>massa</td>
              <td>Vestibulum</td>
              <td>lacinia</td>
              <td>arcu</td>
            </tr>
            <tr>
              <td>1,011</td>
              <td>eget</td>
              <td>nulla</td>
              <td>Class</td>
              <td>aptent</td>
            </tr>
            <tr>
              <td>1,012</td>
              <td>taciti</td>
              <td>sociosqu</td>
              <td>ad</td>
              <td>litora</td>
            </tr>
            <tr>
              <td>1,013</td>
              <td>torquent</td>
              <td>per</td>
              <td>conubia</td>
              <td>nostra</td>
            </tr>
            <tr>
              <td>1,014</td>
              <td>per</td>
              <td>inceptos</td>
              <td>himenaeos</td>
              <td>Curabitur</td>
            </tr>
            <tr>
              <td>1,015</td>
              <td>sodales</td>
              <td>ligula</td>
              <td>in</td>
              <td>libero</td>
            </tr>
          </tbody>
        </table>
      </div>
    </main>
  </div>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
      <script>window.jQuery || document.write('<script src="/docs/4.3/assets/js/vendor/jquery-slim.min.js"><\/script>')</script><script src="/docs/4.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-xrRywqdh3PHs8keKZN+8zzc5TX0GRTLCcmivcbNJWm2rs5C8PRhcEn3czEjhAO9o" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/feather-icons/4.9.0/feather.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.min.js"></script>
        <script src="dashboard.js"></script></body>
</html>
    