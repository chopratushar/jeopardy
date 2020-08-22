
package ca.sheridancollege.Beans;


public class Test {
    
    Question[] question = new Question[25];
    

	public void LoadQuestions(){

		// CANADA
		question[0] = new Question("Canada", 100 ,"which is the third most important language of Canada?", "Punjabi", "Greek", "French", "Spanish", "Punjabi");
		question[1] = new Question("Canada", 300 , "who was the first Prime minister of Canada? ", "Pierre Trudeau" , "John Turner" , "John A. Macdonald", "Paul Martin", "John A. Macdonald");
		question[2] = new Question("Canada", 500 , "How much is the population of Canada? ", "24.13M", "36.29M", "40.85M", "33.62M", " 36.29M");
		question[3] = new Question("Canada", 700 , "which is the coldest city in Canada?", "Winnipeg, MB", "Saguenay, QC", "Regina,SK ", "Thunder Bay,ON", "Winnipeg, MB");
		question[4] = new Question("Canada", 900, "How many Tim Hortons are in Canada?", "4,304", "3,665", "3,468", "5,605","3,665");

		// CARTOONS
		question[5] = new Question("Cartoons", 100 , "In which year mickey mouse was created?", "1940", "1895","1928", "1993", "1928");
		question[6] = new Question("Cartoons", 300 ,"who's voice is behind Donald Duck today? ","Daniel Ross", "Donald Trump","Jack King","James Anderson","Daniel Ross");
		question[7] = new Question("Cartoons", 500 , "How many Barbie movies are there?", "15", " 34", "43","31", "34");
		question[8] = new Question("Cartoons", 700 , "who is Sylvester?", "cat", "dog", "Penguin","Bird","cat");
		question[9] = new Question("Cartoons", 900,"who discovers the world's first cartoon character?","Walt Disney","Mark Bryant","Jimmy Tapp","Andrew Jackson","Mark Bryant");

		// FOOD
		question[10] = new Question("Food",100,"To which country souvlaki belongs to?", "Turkey", "Italy","Greece","Indonesia","Greece");
		question[11] = new Question("Food",300,"What we should avoid, while we are on diet?","pasta", "butter","milk","coffee","pasta");
		question[12] = new Question("Food",500,"which vitamin we can get from strawberries?","vitamin A", "vitamin B","vitamin C","vitamin D","vitamin C");
		question[13] = new Question("Food",700,"Which of the following is high in Fiber?","Oatmeal", "Kidney beans","Apple","Navy Beans","Navy Beans");
		question[14] = new Question("Food",900,"which food is high in Calories?","Avocados","Sesame Butter","Walnuts","Almonds","Sesame Butter");

		// JAVA
		question[15] = new Question("Java",100,"Which of the following is not a Primitive Data Type?","String","byte","char","Boolean","String");
		question[16] = new Question("Java",300,"There are how many Primitive Data Types?","5","6","9","8","8");
		question[17] = new Question("Java",500,"what is the default value of an int ?","0","null","1","int","0");
		question[18] = new Question("Java",700,"Which is not a Java Operator?","==","<=","=!","!=","=!");
		question[19] = new Question("Java",900,"What is the result of 3%8 in Java?","0","3","5","8","3");

		// CHOCOLATE
		question[20] = new Question("Chocolate",100,"How many chocolate brands are in the world?","35","59","105","85","85");
		question[21] = new Question("Chocolate",300,"when was the first chocolate made?","1847","1868","1902","1910","1847");
		question[22] = new Question("Chocolate",500,"which country consume the most chocolate?","Switzerland","US","Germany","Ireland","Switzerland");
		question[23] = new Question("Chocolate",700,"What plant makes chocolate?","coffee tree","Cocao tree","charry tree","chocolate tree","Cocao tree");
		question[24] = new Question("Chocolate",900,"Where is the cacao tree found?","South America","North America","Australia","Germany","South America");

	}

        public Question getQuestion(int i){
            return question[i];
        }
}
