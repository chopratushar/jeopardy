import java.io.*;
import javax.servlet.*;

import javax.servlet.http.*;
import ca.sheridancollege.Beans.PlayerBean;

public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         
        
        String name = (String)request.getParameter("userName");
       String Score = "0";
       // int Score = 0;
        
        PlayerBean pb = new PlayerBean(name,Score);
        HttpSession session = request.getSession();  // creating new Session
        session.setAttribute("abc", pb);
         
         
          
//        int[] a = new int[25];
//        a[0] =  0;
//        a[1] = 0;
//       
        
         
          RequestDispatcher view = request.getRequestDispatcher("game.jsp");
        view.forward(request, response);
        }
    }

    


