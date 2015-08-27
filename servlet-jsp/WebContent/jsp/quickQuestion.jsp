<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<%@ page import="practice.servletjsp.beans.QuickQuestionBean" %>
<%@ page import="javax.servlet.RequestDispatcher" %>

 <head>
	<title>RequestOne</title>
 </head>

<body>
  
<form id="quickQuestionForm" name="quickQuestionForm" action="requestOne" method="POST" onSubmit="">

	<%@ include file="../includes/header.jsp" %>
		<%-- Setting the request attribute for pageTitle --%>
	<%request.setAttribute("pageTitle", "Resume Review Q&A Form"); 
	   QuickQuestionBean bean = new QuickQuestionBean();
	
	%>
	
	<jsp:useBean id="quickQuestionBean" scope="request" 
				beanName="practice.servletjsp.beans.QuickQuestionBean"
				type="practice.servletjsp.beans.QuickQuestionBean"/>
				
	<jsp:setProperty name="quickQuestionBean" property="*"/>
   <table height="85" border="0" align="center">
   <tr><td>

    <table width="800" border="0" align="center">
     <tr><td>
	<h4>Please complete the following form for Resume Q&A. 
		Questions are limited to 100 words, and will be responded to within 24 hours.
	</h4>
	</td></tr>
	</table>		
   </td></tr>

   <tr><td> &nbsp;</td></tr>

   <tr><td>
  <table width="611" ALIGN=CENTER>

  <tr><td><b><font size="3">*</font> Denotes required field.</b></td></tr>
 <tr><td> &nbsp;</td></tr>

	<tr><td width=500><b>First Name <font size="3">*</font></b></td>
	<td width=400 ALIGN=LEFT><input type="text" maxlength="50" size="30" name="stud_fname" value="${stud_fname}" /> </td></tr>

    <tr><td><b>Last Name <font size="3">*</font></b></td>
	<td><input type="text" maxlength="50" size="30" name="stud_lname" value="${stud_lname}" /> </td></tr>

	<tr><td><b>Day Phone Number</b></td>
	<td><input maxlength="30" size="20" name="day_phone" value="${day_phone}" />&nbsp;(e.g. 7778889999 no hyphens) </td></tr>

    <tr><td><b>Evening Phone Number</b></td>
	<td><input maxlength="30" size="20" name="evening_phone" value="${evening_phone}" />&nbsp;(e.g. 7778889999 no hyphens) </td></tr>

	<tr><td><b>E-mail Address <font size="3">*</font></b> (Student <br>franklin email is required)</td>
	<td><input maxlength="20" size="15" name="stud_email" value="${stud_email}" />@email.franklin.edu </td></tr>

    <tr><td><b>Please write your question in the box <font size="3">*</font></b><br>
              (max. 1500 chars)</td>
	<td><TEXTAREA name="question" rows=6 cols=45 />${question}</TEXTAREA> </td></tr>
	
	
   <tr><td> &nbsp;</td></tr>
   <tr><td>&nbsp;</td></tr>

	<tr>
		<td colspan="2"><b>You will receive a confirmation email upon receipt. </b> </td>
	</tr>
	<tr><td>&nbsp;</td></tr>
	<tr><td colspan="2">
	</td></tr>
	<tr><td>&nbsp;</td></tr>
	<tr><td>&nbsp;</td></tr>
	<tr><td colspan="2" align="center"><input type="submit" value="Submit" /> <input type="reset" /></td></tr>


	</table>

   </td></tr>
	
   </table>
  </form>


  </body>

</html>