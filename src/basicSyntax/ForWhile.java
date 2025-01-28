package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		for (int num= 1; num <= 100; num++ )
			System.out.println(
					(num%3==0 && num%5==0)?"FizzBuzz":(num%3==0)?"Fizz":(num%5==0)?"Buzz":num);
		
		
		String [] languages = {"Ruby","Golang","Java","Python","Typescript","HTML","Javascript"};
		
		for(String language : languages) {
			if(language==languages[2]) {
				System.out.println("現在学習中の言語はJavaです。");
				continue;
		}else if(language==languages[5]) {
			System.out.println("HTMLはプログラミング言語ではありません。");
			break;
		}
			System.out.println(language);
		}
	}
}






//下記の条件で繰り返し処理を行って、条件によって処理を分けてください。
//右記の配列を定義: "Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"
//繰り返しの中で下記の条件分岐を行なってください。
//Javaの場合
//"現在学習中の言語はJavaです。"と出力
//上記出力後に、このターンはスキップ
//HTMLの場合
//"HTMLはプログラミング言語ではありません。"と出力
//上記出力後に、繰り返し処理を終了
//その他のターンの場合は、対象のプログラミング言語を出力
