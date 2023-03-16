<%@page import="java.sql.*"%>
<%
    String userid = request.getParameter("userid");
    String message = "";
    if(userid != null && userid.trim().length() > 0) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3307/ajax_login";
            String username = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt = con.prepareStatement("select * from ajax_table where userid=?");
            pstmt.setString(1, userid);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                message = "Email already exists!";
            } else {
                message = "Email available!";
            }
            rs.close();
            pstmt.close();
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    out.println(message);
%>
