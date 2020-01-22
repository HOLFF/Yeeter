import java.sql.*;

public class main {
    public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yeeter","root","root");
        Statement stmt = con.createStatement();
        ResultSet res = stmt.executeQuery("select * from person");
    }

}
