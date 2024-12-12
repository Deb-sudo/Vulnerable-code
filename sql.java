// **Dummy Vulnerable Code for SonarQube Testing**

### SQL Injection Vulnerability

Here's an example of a vulnerable Java code snippet that uses MySQL:

```java
// Vulnerable Java code snippet
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VulnerableSQLInjection {
    public static void main(String[] args) {
        String userInput = "Robert'); DROP TABLE Students; --";
        String query = "SELECT * FROM Students WHERE name = '" + userInput + "'";
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "username", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
