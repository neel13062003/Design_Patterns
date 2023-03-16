<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Signup JSP Page</title>
    </head>
    <body>


        <form action="submitAdmissionForm" method="POST">
            <table>

                <tr>
                    <td>Full Name: </td>
                    <td><input type="text" name="fname"></td>
                </tr>    
                <tr>
                    <td>Semester:</td>
                    <td><input type="text" name="sem"></td>
                </tr>
                <tr>
                    <td>Roll no:</td>
                    <td><input type="text" name="roll"></td>
                </tr>
                <tr>
                    <td>Contact:</td>
                    <td><input type="text" name="contact"></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><input type="text" name="email"></td>
                </tr>
                <tr>
                    <td><input type="submit"  value="signup"/></td>  
                </tr>
            </table>    
        </form>    
    </body>
</html>