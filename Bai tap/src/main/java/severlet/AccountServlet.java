package severlet;

import DAO.AccountDAO;
import model.Account;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "LoginServlet", value = "/index")
public class AccountServlet extends HttpServlet {
   private AccountDAO accountDAO;

   public void init(){
       accountDAO = new AccountDAO();
   }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Account> accounts = accountDAO.selectAllAccounts();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(accounts);
        for (Account account: accounts) {
            if (account.getUsername().equals(username) && account.getPassword().equals(password)){
                System.out.println("Login thanh cong");
            } else{
                System.out.println("login khong thanh cong");
            }
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//       List<Account> accounts = accountDAO.selectAllAccounts();
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        System.out.println(accounts);
//        for (Account account: accounts) {
//            if (account.getUsername().equals(username) && account.getPassword().equals(password)){
//                System.out.println("login thanh cong");
//            } else{
//                System.out.println("login khong thanh cong");
//            }
//        }
//    }
}
}
