
import ca.sheridancollege.Beans.PlayerBean;
import ca.sheridancollege.Beans.Question;
import java.io.*;
import javax.servlet.*;

import javax.servlet.http.*;


public class AnswerSelect extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        HttpSession session = request.getSession(); 
        
       PlayerBean pb = (PlayerBean)session.getAttribute("abc"); 
       Question Q = (Question)session.getAttribute("crrt");  
        
        String score = pb.getScore();
        String name = pb.getName();
        String crrtAns = Q.getCorrectAnswer();
        
        
        
        
        
        
        
        
        
       /* HttpSession session = request.getSession(); 
     
      Question Q = (Question)session.getAttribute("Answer"); // choosen answer
      String crrtAns = Q.getCorrectAnswer();
      String ans =  (String)request.getAttribute("ans"); // creating null pointer
      PlayerBean p = (PlayerBean)session.getAttribute("abc");
      
     if(ans.equals(crrtAns)){
         p.setScore(p.getScore()+ Q.getValue()); 
     }
     
     session.setAttribute("abc", p);
*/

      
          RequestDispatcher view = request.getRequestDispatcher("game.jsp");
        view.forward(request, response);
    }

}
