<% @page contentType="text/html pageEncoding="UTF-8"%> 
<% 
	int n=num; 
	int re; 
	int no=0; 
	while(n!=0)
	{ 
		re=n%10; 
		no+=re*re*re; 
		n/=10; 
	} 
	if(no==num){
		out.println("Armstrong Number"); 
	} 
	else{ 
		out.println("Not Armstrong Number"); 
	}
%>
