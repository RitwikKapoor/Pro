import java.util.Scanner;

public class URLConnectionExample2 {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.example.com/");
        URLConnection connection = url.openConnection();
        InputStream response = connection.getInputStream();

        // Get the date header field
        long date = connection.getDate();
        if (date != 0) {
            Date dateObj = new Date(date);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            System.out.println("Date: " + dateFormat.format(dateObj));
        } else {
            System.out.println("Date not available.");
        }

        // Get other header fields
        //System.out.println("Content-Type: " + connection.getHeaderField("Content-Type"));
        //System.out.println("Content-Length: " + connection.getHeaderField("Content-Length"));
        System.out.println("Content-Type: " + connection.getContentType());
        System.out.println("Content-Length: " + connection.getContentLength());
        System.out.println("Server: " + connection.getHeaderField("Server"));
        System.out.println("Last-Modified: " + connection.getHeaderField("Last-Modified"));

        // Read the response body
        Scanner scanner = new Scanner(response);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
