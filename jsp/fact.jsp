<html>
	<body>
		<% @page contentType="text/html pageEncoding="UTF-8" %>
		
		<%
			int n=Integer.parseInt(request.getParameter("num"));
			int fact(int a){
				if(n==0){
					return(1);
					
				}else{
					return(n*fact(n-1));
				}
			}
			
			
		%>
		<b>
		<%
			out.println("The Factorial of "+n+" is "+fact(n));
		%>
		</b>
	</body>
</html>