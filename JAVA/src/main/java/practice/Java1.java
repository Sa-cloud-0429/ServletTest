package practice;
/*--2章--*/

public class Java1 {
	public static void main(String[]args) {
		/*--問1-*/
		int num = 5;
		int doubled = num*2;
		System.out.println("5×2="+doubled);
		
		/*--問2-*/
		int num2=12;
		boolean isGreater = num2>10;   //booleanはtrue.falseの時使う//
		System.out.println(num2+"は10より大きいですか？"+isGreater); //ここのGreaterは上のクラス名じゃなくてもいい//
		
		/*--問3-*/
		int num3=7;
		if (num3 %2==0) {  //2で割って余りが0なら偶数//
			System.out.println(num3+"は偶数です");
		}else {
			System.out.println(num3+"は奇数です");
			
		/*--問4-*/
		double num4=4.5;
		double half=num4/2;
		System.out.println("4.5の半分は"+half+"です");
		
		/*--問５-*/
		double num5=7.8;
		int first=(int)num5;  //intは小数を捨てて整数のみにしている//
		double secound=num5-first; //小数を表示したいからdouble/7.8-7で小数部分を出している//
		System.out.println("整数部分"+first);
		System.out.println("小数部分"+secound);
		
		/*--問6-*/
		double num6=3.2;
		double result= num6*10; ///先頭double,intのジャッジはイコールになるものここでは3.2だからこの形//
		System.out.println("3.2の10倍は"+result);	
		
		/*--問7--*/
		int num7=0;
		boolean isZero =(num7==0); //==はnum7は0ですかという質問、それをジャッジしてisZeroに入れろ
		System.out.println("この値は０か？"+isZero);
		
		/*--問8--*/
		int num8 = -5;
		boolean isMinus=(num8<0);
		System.out.println("値はマイナスか"+isMinus);
		
		/*--問9--*/
		int num9=15;
		boolean isBaisu=(num9 %5==0);
		System.out.println("5の倍数か？:"+isBaisu);
		
		/*--問10--*/
		int num10 = 8;
		int num11 = 3;
		int sum = num10 + num11;
		System.out.println("合計"+sum);
		
		/*--問11--*/
		int num12 =10;
		int num13 = 4;
		int sub =num12-num13;
		System.out.println("引き算："+sub);
		
		/*--問12--*/
		int num14 = 6;
		int num15 = 7;
		int kake =num14*num15;
		System.out.println("掛け算"+kake);
		
		/*--問13--*/
		String name = "sakura";
		int age = 23;
		age=age+1;//-上の年齢にプラス1する/
		
		System.out.println(name+"は次の誕生日で"+age+"です");
		
		/*--問14--*/
		int num16=8;
		int num17=3;
		int tashi=num16+num17;
		int hiki = num16-num17;
		int kake1=num16*num17;
		int wari=num16/num17;
		int amari=num16%num17;
		System.out.println("足し算"+tashi);
		System.out.println("引き算"+hiki);
		System.out.println("掛け算"+kake1);
		System.out.println("割り算"+wari);
		System.out.println("あまり"+amari);
		
		/*--問15--*/
		int test1=75;
		int test2 = 88;
		int test3=92;
		int total=test1+test2+test3;
		int average=total/3;
		System.out.println("合計は"+total+"平均は"+average);
		
		/*--問16--*/
		double price=12000;/*商品価格、小数を扱うからdoubleになる*/
		double dis=30;
		
		double disa = price*(dis/100);//割引後をdisと置く、小数に変換//
		double discount=price-disa;//割引後、価格から上を引く/
		
		System.out.println("最初の値段"+price+"円");
		System.out.println("割引率"+dis+"%");
		System.out.println("割引後"+discount+"円");
		
		/*--問1７--*/
		boolean a = true;
		boolean b=false;
		boolean c=(a&&b)||(!a&&!b);
		//左側：aもbも両方trueのときtrue、このときはfalseになる//
		//右側：上と逆、aもbもfalseのときtrueに、！がつくと上の定義と逆になる、//
		//||これはorという意味、＆＆は両方ならという感じ//
		System.out.println(c);
		
		
		/*--問1８--*/
		boolean x=true;
		boolean y = false;
		boolean z =x||y&&!x;
		System.out.println(z);
		
		/*--問19--*/
		boolean p=false;
		boolean q=true;
		boolean r =!(p||q)&&(p&&!q);
		System.out.println(r);
		
		
		/*--問20--*/
		int age1 = 20;
		boolean hasId=false;
		
		if((age1<25&&hasId)//true&false=false//
		||age1==20) {
		//trueになる、falseとtrueでtrue、||はどちらかがtrueならOKだからtrueになる/
			System.out.println("割引料金です");
		}else {
			System.out.println("通常料金です");
		}
		
		
		
		
		
			
		}
	}
	

}
