import java.util.Arrays;
/*
 *    System.arraycopy() : �迭�� ũ�Ⱑ �ٸ� ���(���ϴ� ��ġ�� ������ ��ġ)
 *    arr.clone() : �ִ� �״�� 
 */
public class �迭_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] arr={'A','B','C','D','E'};
        char[] copy=new char[arr.length*2];
        // ���� ���� ==> ��� arr/copy
        copy=arr.clone();
        System.out.println("arr="+Arrays.toString(arr));
        System.out.println("copy="+Arrays.toString(copy));
        copy[0]='K';
        System.out.println("arr="+Arrays.toString(arr));
        System.out.println("copy="+Arrays.toString(copy));
	}
}
