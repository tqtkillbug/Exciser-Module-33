package DAO;

import model.Account;
import model.User;
import respository.MysqlConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO implements  IAccountDAO{

    private String jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "tientran123@";

    private static final String INSERT_USERS_SQL = "INSERT INTO account (id,username,password,role) VALUES (?, ?, ?,?);";
    private static final String SELECT_USER_BY_ID = "select id,username,password,role from account where username =?";
    private static final String SELECT_ALL_USERS = "select * from account";
//    private static final String DELETE_USERS_SQL = "delete from account where id = ?;";
    private static final String UPDATE_USERS_SQL = "update account set password = ?,role= ? where username = ?;";

    public AccountDAO() {
        MysqlConnection.init("tqtmusicdatabase");
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }


    @Override
    public void insertAccount(Account account) throws SQLException {

    }

    @Override
    public User selectAccount(String username) {

        return null;
    }

    @Override
    public List<Account> selectAllAccounts() {

        // using try-with-resources to avoid closing resources (boiler plate code)
        List<Account> accounts = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = MysqlConnection.getInstance().getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String role = rs.getString("role");
                accounts.add(new Account(id,username, password, role));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    @Override
    public boolean updateAccount(Account account) throws SQLException {
        return false;
    }
}
