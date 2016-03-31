<html>
    <head></head>
    <body>
	Hello World!! <br>

	<div>
	    <h2>Declarations</h2>
	    <%! int i = 10; %>
	    <%! int k = 20; %>
	    i = <%= i %></br>
	    k = <%= k %></br>
	</div>

	<div>
	    <h2>Expressions</h2>
	    <%= (new java.util.Date()).toLocaleString() %>
	</div>

	<div>
	    <h2>Directives</h2>
	    <%= (new java.util.Date()).toLocaleString() %>
	    <!-- <%@ directive attribute="value" %> -->
	</div>	

	<div>
	    <h2>Actions</h2>
	    Action elements are predefined functions following the jsp functions. 
	    <jsp:action_name attribute="value" />
	</div>	

	<Div>
	    <h2>Others</h2>
	    <%-- This is some JSP comments. --%>
	    <%
	    out.println("Your IP address is: " + request.getRemoteAddr());
	    for(int j = 0; j <= i; j++) {
		out.println(j);
		out.println("</br>");
	    }
	    %>
	</div>
    </body>
</html>
