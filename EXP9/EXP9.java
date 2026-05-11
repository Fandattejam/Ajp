import java.sql.*;
import java.util.Scanner;

public class EXP9 {

    public static void main(String[] args) {

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect (root / root)
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/", "root", "root"
            );

            Statement st = con.createStatement();
            Scanner sc = new Scanner(System.in);

            // 3. Create DB + Table
            st.executeUpdate("CREATE DATABASE IF NOT EXISTS college");
            st.execute("USE college");

            st.executeUpdate("CREATE TABLE IF NOT EXISTS studentpract (" +
                    "id INT PRIMARY KEY, name VARCHAR(50))");

            int choice;

            do {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Insert");
                System.out.println("2. Update");
                System.out.println("3. Delete");
                System.out.println("4. Display");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1: // INSERT
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        st.executeUpdate("INSERT INTO student VALUES (" + id + ", '" + name + "')");
                        System.out.println("Record Inserted!");
                        display(st);
                        break;

                    case 2: // UPDATE
                        System.out.print("Enter ID to update: ");
                        int uid = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();

                        st.executeUpdate("UPDATE student SET name='" + newName + "' WHERE id=" + uid);
                        System.out.println("Record Updated!");
                        display(st);
                        break;

                    case 3: // DELETE
                        System.out.print("Enter ID to delete: ");
                        int did = sc.nextInt();

                        st.executeUpdate("DELETE FROM student WHERE id=" + did);
                        System.out.println("Record Deleted!");
                        display(st);
                        break;

                    case 4: // DISPLAY
                        display(st);
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } while (choice != 5);

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Display Method
    public static void display(Statement st) throws Exception {
        ResultSet rs = st.executeQuery("SELECT * FROM student");

        System.out.println("\n--- Student Records ---");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + "  " + rs.getString("name"));
        }
    }
}