
import ca.sheridancollege.Beans.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class PickQuestion extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         
        String currentQuestion =  request.getParameter("question");
        int i = Integer.parseInt(currentQuestion);
        Test t = new Test();
        t.LoadQuestions();
        Question q = t.getQuestion(i);
       
        HttpSession session = request.getSession(); 
        session.setAttribute("question", q); 
        
        
        
          RequestDispatcher view = request.getRequestDispatcher("question.jsp");
        view.forward(request, response);
        }
    }
