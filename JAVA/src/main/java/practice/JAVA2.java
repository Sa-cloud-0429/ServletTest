package practice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//------3・４・５・章-------//
public class JAVA2 {
	public static void main(String[] args)throws Exception {
		//------問1-------//
		int num = 10;
		System.out.println("変数は" + num + "です");

		//------問2-------//
		int a = 8;
		int b = 5;
		int sum = a + b;
		System.out.println(a + "+" + b + "=" + sum);

		//------問3------//
		int width = 7;
		int height = 4;
		int area = width * height;
		System.out.println("長方形の面積は" + area + "です");

		//------問4-------//
		String name = "Java";
		double version = 17.0;
		boolean isFun = true;
		System.out.println("プログラミング言語:" + name);
		System.out.println("バージョン:" + version);
		System.out.println("楽しい？:" + isFun);

		//------問5-------//
		Scanner scanner = new Scanner(System.in);

		System.out.println("名前を入力してください");
		String name1 = scanner.nextLine();
		System.out.println("こんにちは" + name1 + "さん");

		//------問6-------//
		String name2 = "sakura";
		int age = 23;
		LocalDate birthDate = LocalDate.of(2002, 4, 29);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		//DateTimeFormatterは日付や時間を出すときに使う大事！！//

		String formattedInfo = String.format("名前: %s, 年齢: %d歳, 誕生日: %s", name2, age, birthDate.format(formatter));
		System.out.println(formattedInfo);

		//------問7-------//
		String productname = "Laptop";
		int price = 1200;
		int kosuu = 3;

		int total = price * kosuu;
		System.out.println("商品：" + productname + "は、価格：" + price + "円なので、" + kosuu + "個買うと" + total + "円です");

		//------問8-------//
		int a1 = 5;
		int b1 = 10;
		int c1 = 15;
		int result = (a1 + b1) * c1 / (a1 - b1);
		System.out.println(result);

		//------問9-------//
		double x = 4.0;
		double y = 2.0;
		double z = Math.pow(x, y) - Math.sqrt(y);//powは２乗で16、sqrtは平方根で1.414//
		//Mata.pow(x,y)はxのy乗という意味　例）ｙが3だったら4の3乗で６４になる/
		System.out.println((int) z);

		//------問１０-------//
		String str1 = "Java";
		String str2 = "Programing";
		String str3 = str1.substring(1, 3) + str2.substring(2, 5);
		//substringとは文字列の指定した位置から別の位置まで取り出すメソッド
		//文字は０，１，２，３と0から始まる、だからstr1は１，２の当てはまる部分を抜く
		//str2は２，３，４，のogrを抜くということになる。
		System.out.println(str3);

		//------問11-------//
		Date today = new Date(result);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//フォーマットの指定をしてる/
		String birthDateString = "2020-12-25";//数字だけど文字列として定義している//

		Date birthday = sdf.parse(birthDateString);//sdfはsimpledateformatの略、parseはデータ型に変換するというもの/
		long diffInMillies = Math.abs(birthday.getTime() - today.getTime());//Math.absは絶対値をとる//
		long daysUntilBirthday = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

		System.out.println("Days until birthday:" + daysUntilBirthday);

		//------問13-------//
		int k = 5;
		k++;//kに1増やす、６になる/
		k--;//kから1減らす、上から1減るから5になる/
		System.out.println(k);
		
		//------問15-------//
		double d=9.7;
		int i =(int)d;//上は小数点、intは整数の表示なので切り捨てをして９が表示される//
		System.out.println(i);
		
	
		//------問19-------//
		LocalDate today1 = LocalDate.now();
		System.out.println(today1);
		
		//------問20-------//
		LocalDate today2 = LocalDate.of(2024, 4, 14);
		LocalDate nextWeek = today2.plusDays(7);//プラス7日間の日付をプラス//
		System.out.println(nextWeek);
		
		
		
		
		
		
	}

}
