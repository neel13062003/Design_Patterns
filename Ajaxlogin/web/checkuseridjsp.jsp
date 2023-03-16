<%@ page import="java.sql.*" %>
<%
    String email = request.getParameter("userid");
    if (email.contains("@") && email.contains(".")) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/ajax_login","root",""); 
            PreparedStatement ps = con.prepareStatement("select * from ajax_table where email =  ?");
            ps.setString(1,email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                out.print("Available!");
            } else {
                out.print("Unavailable!");
            }
        } catch (Exception e) {
            out.print(e);
        }
    } else {
        out.print("Invalid email!");
    }
%>
