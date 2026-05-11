import java.sql.*;

public class JDBCInsertDisplay {
    public static void main(String[] args) {

        try {
            // 1. Load Driver (optional in newer versions, but good for viva)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "root"
            );

            // 3. Create Statement
            Statement st = con.createStatement();

            // 4. Insert Data
            st.executeUpdate("INSERT INTO student VALUES (1, 'Tejas')");

            // 5. Retrieve Data
            ResultSet rs = st.executeQuery("SELECT * FROM student");

            // 6. Display Data
            System.out.println("ID\tName");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
            }

            // 7. Close Connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}