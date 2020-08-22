
package ca.sheridancollege.Beans;


public class Question {
    
    
	// field variables
	private String Category;
	private int value;
	private String Question;
	private String Answer1;
	private String Answer2;
	private String Answer3;
	private String Answer4;
	private String CorrectAnswer;


	// zero argument constructor
	public Question(){

	}

	// constructor initializing all field variables
	public Question(String ctgry, int vl, String qstn, String ans1, String ans2, String ans3, String ans4, String crrtAns){

		Category = ctgry;
		value = vl;
		Question = qstn;
		Answer1 = ans1;
		Answer2= ans2;
		Answer3 = ans3;
		Answer4 = ans4;
		CorrectAnswer = crrtAns;

	}

	// setters
	public void setCategory(String ctgry){
		Category = ctgry;
	}


	public void setQuestion(String qstn){
		Question = qstn;
	}

	public void setAnswer1(String ans1){
		Answer1 = ans1;
	}


	public void setAnswer2(String ans2){
		Answer2 = ans2;
	}


	public void setAnswer3(String ans3){
		Answer3 = ans3;
	}


	public void setAnswer4(String ans4){
		Answer4 = ans4;
	}

	public void setCorrectAnswer(String crrtAns){
		CorrectAnswer = crrtAns;
	}

	public void setValue(int vl){
		value = vl;
	}


	//getters
	public String getCategory(){
		return Category;

	}

	public String getQuestion(){
		return Question;
	}

	public String getAnswer1(){
		return Answer1;
	}


	public String getAnswer2(){
		return Answer2;
	}


	public  String getAnswer3(){
		return Answer3;
	}


	public String getAnswer4(){
		return Answer4 ;
	}

	public String getCorrectAnswer(){
		return CorrectAnswer;
	}

	public int getValue(){
		return value;
	}
    
}
