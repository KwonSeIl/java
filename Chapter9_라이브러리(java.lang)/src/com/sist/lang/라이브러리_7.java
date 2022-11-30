package com.sist.lang;
class Student
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Student(String name)
	{
		this.name=name;
	}
	// equals => 오버라이딩 -> 주소비교X, 객체가 가지고 있는 이름(문자열)
	// Object에서 equals는 사용빈도가 거의 없고 String(Object상속) => 로그인/ID체크...
	// Object에서는 주소값 비교(new), String => 실제 저장된 문자열 비교 
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) //객체 크기 비교할 때 사용 instancof
			/*
			 * 	(Student)obj.name => 오류
			 * 	--------    - => .이 우선순위
			 * 	((Student)obj).name => 많이 나옴 
			 */
			return name==((Student)obj).name; //같은 이름이면 true ==> 문자열(이름 비교) 
		else
			return false;
	}
	
}
public class 라이브러리_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("홍길동");
		Student s2=new Student("홍길동");
		
		if(s1.equals(s2))
		{
			System.out.println("같은 학생입니다");
		}
		else
		{
			System.out.println("다른 학생입니다");
		}

	}

}
