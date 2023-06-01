import java.util.*;
import java.sql.*;

class MainClass{
        public static void main(String[] args){
                String url = "jdbc:mysql://localhost:3306/studentbase";
                String user = "root";
                String pass = "new_password";
                //Entering the data
                Scanner k = new Scanner(System.in);
                System.out.println("enter name");
                String name = k.next();
                System.out.println("enter roll no");
                int roll = k.nextInt();
                System.out.println("enter marks");
                int marks  = k.nextInt();

                Connection con=null;
                try
                {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con = DriverManager.getConnection(url,user,pass);
                        Statement st = con.createStatement();
                        String createTableSql = "CREATE TABLE IF NOT EXISTS student1 (name VARCHAR(255), rollno INT, marks INT)";
                        st.executeUpdate(createTableSql);
                        System.out.println("Table created successfully...");
                        //Inserting data using SQL query
                        String sql = "insert into student1 values('"+name+"',"+roll+",'"+marks+"')";
                        int m = st.executeUpdate(sql);
                        if (m == 1)
                                System.out.println("inserted successfully : "+sql);
                        else
                                System.out.println("insertion failed");
                                con.close();
                }
                catch(Exception ex)
                {
                        System.err.println(ex);
                }
        }
}
