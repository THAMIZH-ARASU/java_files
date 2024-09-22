public class nptel{
	
	public static void main(String[] args){
		String question="which course have you opted?";
		System.out.println(Answer.submit(question));
		
	}
}
class Answer{
	static String answer="Progg with java";
	static String submit(String question){
		return ("answwer to question, "+question+"is"+answer);
	}
}