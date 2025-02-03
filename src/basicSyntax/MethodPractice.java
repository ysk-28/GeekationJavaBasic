package basicSyntax;

public class MethodPractice {
	
	public static void main(String[] args) {
		int a=8;
		int b=8;
		
		int answerA = methodA(a,b);
		int answerB = methodB(a,b);
		int answerC = methodC(a,b);
		int answerD = methodD(a,b);
		
		methodE(answerA,answerB,answerC,answerD);				
	}
	
	public static int methodA(int a ,int b) {
		return a + b;
	}

	public static int methodB(int a ,int b) {
		return a - b;
	}
	
	public static int methodC(int a ,int b) {
		return a * b;
	}
	
	public static int methodD(int a ,int b) {
		return a % b; 
	}
	
	public static void methodE(int answerA,int answerB,int answerC,int answerD) {
		
		System.out.println("計算結果は"+answerA+"です。");
		System.out.println("計算結果は"+answerB+"です。");
		System.out.println("計算結果は"+answerC+"です。");
		System.out.println("計算結果は"+answerD+"です。");
	}
}



