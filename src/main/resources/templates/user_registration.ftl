
<!DOCTYPE html>
<html>
<head>
    <title>New User Registration Form</title>

</head>
<body>
<div class="container">
    <div class="main">
        <form class="form" method="POST" action="/post_registration">
            <h2>New User Registration Form</h2>
            <table>
                <tr>
                    <td>
                        <label>Name :</label></td>
                    <td><input type="text" name="dname" id="name"></td></tr>
                <tr><td>
                    <label>Email :</label></td>
                    <td>
                        <input type="text" name="demail" id="email"></td></tr>
                <tr><td>
                    <label>Password :</label></td>
                    <td>
                        <input type="password" name="password" id="password"></td></tr>
                <tr><td><label>Confirm Password :</label></td>
                    <td><input type="password" name="cpassword" id="cpassword"></td><tr height="30"></tr>


                <tr><td colspan="2" align="center">
                    <input type="submit" name="register" id="register" value="Register"></td> </tr></table>

        </form>

    </div>
</body>
</html>