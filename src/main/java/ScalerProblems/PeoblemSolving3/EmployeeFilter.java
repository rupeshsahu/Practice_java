package ScalerProblems.PeoblemSolving3;

import java.sql.*;


    public class EmployeeFilter {
        public static void main(String[] args) {

        }
        public static void filterEmployees() throws SQLException {
            Connection conn = DriverManager.getConnection("jdbc:default:connection");
            PreparedStatement pstmt = conn.prepareStatement("SELECT emp_id, emp_name FROM employees WHERE emp_id > ?");
            pstmt.setInt(1, 1001);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int empId = rs.getInt("emp_id");
                String empName = rs.getString("emp_name");
                PreparedStatement insertStmt = conn.prepareStatement("INSERT INTO employees_filtered (emp_id, emp_name) VALUES (?, ?)");
                insertStmt.setInt(1, empId);
                insertStmt.setString(2, empName);
                insertStmt.executeUpdate();
            }
        }
    }

