package com.sist.lang;

import java.util.Arrays;

// clone ==> ����(���� ����) / ����(���� ����)
public class ���̺귯��_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Call By Reference
		int[] arr= {10,20,30,40,50};
		int[] copy=arr.clone(); // �ٸ� �޸𸮿� ���� ���� ������ �ִ� �޸𸮸� �����Ѵ�
		System.out.println("arr:"+arr);
		System.out.println("copy:"+copy);
		//����
		System.out.println("==== arr ====");
		System.out.println(Arrays.toString(arr));
		System.out.println("==== copy ====");
		System.out.println(Arrays.toString(copy));
		System.out.println("==== ���� �� ====");
		arr[0]=100;
		arr[1]=200;
		System.out.println("==== arr ====");
		System.out.println(Arrays.toString(arr));
		System.out.println("==== copy ====");
		System.out.println(Arrays.toString(copy));
		copy[2]=300;
		copy[3]=400;
		System.out.println("==== arr ====");
		System.out.println(Arrays.toString(arr));
		System.out.println("==== copy ====");
		System.out.println(Arrays.toString(copy));

	}

}
