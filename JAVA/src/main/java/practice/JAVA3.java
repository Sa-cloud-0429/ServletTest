package practice;
/*--6章--*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class JAVA3 {
	public static void main(String[]args) {
		/*---コレクション問１----*/
		ArrayList<Integer>numbers=new ArrayList<>();
		//ArrayListで新しい生巣のリストを作る宣言//
		//newArrayListは新しい空リストをつくる//
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		Collections.reverse(numbers);
		//中身をreverse(反対にする）ということ/
		System.out.println("逆順のリスト"+numbers);
		
		/*---2問----*/
		ArrayList<String>List=new ArrayList<>();
		//新しくListという名のリストを作る//
		List.add("Apple");
		List.add("Banana");
		List.add("Cherry");
		List.add("Apple");
		List.add("Orange");
		
		HashSet<String>set=new HashSet<>(List);
		//リストをhashsetに変換。hashsetは重複を削除してくれる//
		//()にListを入れるのはlistの中身を全部setにコピーする//
		
		System.out.println("リスト:"+set);
		
		/*---3問----*/
		ArrayList<String>fruits=new ArrayList<>();
		fruits.add("りんご");
		fruits.add("ばなな");
		fruits.add("さくらんぼ");
		
		System.out.println("初期のデータ:"+fruits);
		
		fruits.remove("ばなな");//リストからばななの削除//
		fruits.add("オレンジ");//リストにオレンジを加える//
		
		System.out.println("変更後のリスト:"+fruits);
		
		
		/*---リスト１問----*/
		LinkedList<String>list1=new LinkedList<>();
		//Linkedlistは順番を持つリストで、間の削除や挿入に使うといい//
		list1.add("first");
		list1.add("secound");
		list1.add("third");
		
		System.out.println("最初の要素:"+list1.getFirst());
		System.out.println("最後の要素:"+list1.getLast());
		
		/*---2問----*/
		ArrayList<Integer>list2=new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		
		int search = 20;//２０という数字が入っているか探す//
		boolean contains = list2.contains(search);//list2にsearchしている数字が入っているか//
		System.out.println("リストに"+search+"が含まれているか："+contains);
		
		/*---3問----*/
		ArrayList<String>list3=new ArrayList<>();
		list3.add("Banana");
		list3.add("Apple");
		list3.add("Cherry");
		
		Collections.sort(list3);//sortは大きい順とかの意味//
		
		System.out.println("sort順"+list3);
		
		
		/*---ハッシュ１問----*/
		HashMap<String,Integer>map=new HashMap<>();//HashMapは２つの値を入れることができる//
		map.put("Apple",100 );
		map.put("Banana",200 );
		map.put("Cherry",300 );
		
		int value=map.get("Banana");//bananaの値を取りだして！//
		System.out.println("bananaの値:"+value);
		
		/*---2問----*/
		HashSet<String>list4=new HashSet<>();//Hashsetは同じ値をとらない//
		list4.add("Banana");
		list4.add("Apple");
		list4.add("Cherry");
		
		System.out.println("要素"+list4);
		
		/*---３問----*/
		HashMap<String,Integer>maps=new HashMap<>();
		maps.put("Apple",100);
		maps.put("Banana",200);
		maps.put("Cherry",300);
		
		for (String key : map.keySet()) {
			System.out.println("キー:"+key+",値:"+map.get(key));
			//拡張forで（要素の型　変数名：集合）になっている
		}
		
		
		
		
		/*---配列とリスト1問----*/
		int[] array = {1,2,3,4,5};//一つの数字の集合って感じ//
		ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		System.out.println("リスト要素："+list);
		
		/*---２問----*/
		ArrayList<String>list5= new ArrayList<>();
		list5.add("Banana");
		list5.add("Apple");
		list5.add("Cherry");
		System.out.println("リスト要素："+list5);
		
		/*---3問----*/
		String[]Name = {"Alice","Bob","Ren"};
		int [] grade = {80,90,75};
		
		int total =0;
		for(int g:grade) {
			total += g;
			
		}
		double average = (double) total/grade.length;
		System.out.println("成績の平均："+average);
		
		
	
		
	
		
		
		
		
		
		
		
		
		
	}

}
