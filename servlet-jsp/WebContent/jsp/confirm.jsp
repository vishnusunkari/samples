<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

  <head>
  <% 	
	String pageTitle = null;
	String errorMsg = null;  	
	if (request.getAttribute("pageTitle") != null){
		pageTitle = request.getAttribute("pageTitle").toString();
	}
	if (request.getAttribute("errorMsg") != null){
		errorMsg = request.getAttribute("errorMsg").toString();
	}
%>
	<title>${pageTitle}</title>

	<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
	<link href="${pageContext.request.contextPath}/styles/slcWriting.css" rel="stylesheet" type="text/css">

   </head>

<body>
  
  <%@ include file="../includes/header.jsp" %>
  
  <table height="85" width="80%" border="0" align="center">
    <tr><td> &nbsp;	</td></tr>
    <tr><td align="center"> 
    <%if(errorMsg !=null && errorMsg.contains("error")){ %>
    	<h3><font color="red">
         	SERVER ERROR ! </font></h3>
			Your request was NOT successfully submitted.<br/>  
    		Please notify to <a href="mailto:helpdesk@franklin.edu">helpdesk@franklin.edu</a> 
    		that you have received this error. 
    <%} else if(pageTitle !=null && pageTitle.contains("Q&A")){%>		
		<h3> Your question has been submitted successfully. </h3>
		<br><h3>Thank you.</h3>
	<%} else { %>
		<h3> Your request form has been submitted successfully. </h3>
		<br><div align="left">Thank you for submitting your resume for a comprehensive critique by a member 
				of Franklin University's Expert Resume Review Team.  Please expect your personalized 
				critique to be returned to you within 5-7 business days.  We thank you for the 
				opportunity to provide assistance to you and look forward to helping you create the 
				interview-winning resume you deserve.</div>
	<%} %>	
		
    </td></tr>
		
    <tr><td> &nbsp;	</td></tr>
		
  </table>

</body>

</html>