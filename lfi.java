// ** **Dummy Vulnerable Code for LFI and Command Injection in Java**

### Local File Inclusion (LFI) Vulnerability

Here's an example of a vulnerable Java servlet code snippet that includes a file based on user input:

```java
// Vulnerable Java servlet code snippet
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LFIExample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fileName = request.getParameter("file");
        File file = new File(fileName);
        FileReader reader = new FileReader(file);
        // Read and display the file contents
        // ...
    }
}
