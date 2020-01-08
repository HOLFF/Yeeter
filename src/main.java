import java.sql.*;

public class main {
    public static void main(String[] args){
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname","username","password");
      //in dbname datenbanknamen eintragen, in username de username des localhost und in das passwort das passwort.....
        //Statement stmt = con.createStatement();
        //ResultSet res = stmt.executeQuery("irgendein SQL Query");
    }

}
