package DAO;

import model.Account;
import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IAccountDAO {
    public void insertAccount(Account account) throws SQLException;

    public User selectAccount(String username);

    public List<Account> selectAllAccounts();

//    public boolean deleteUser(int id) throws SQLException;

    public boolean updateAccount(Account account) throws SQLException;
}
