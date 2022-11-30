
import java.util.*;

public class Á¤¸® {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50,60,70,40,30,20};
		HashSet<Integer> set=new HashSet<Integer>();
		for(int a:arr)
		{
			set.add(a);
		}
		System.out.println(set);
		List<Integer> list=new ArrayList<Integer>(set);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}

}
