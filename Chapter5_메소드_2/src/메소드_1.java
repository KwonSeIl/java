/*
 * 	249page �޼ҵ�
 * 	
 * 	Ŭ����
 * 	----
 * 	 �������
 * 		1) ���� => �⺻��, ������(�迭)
 * 		2) �޼ҵ�
 * 		======================== +Ŭ����(��ü����)
 * 	1. �޼ҵ�: Ư�� �۾��� �����ϴ� �Ϸ��� ��ɹ��� ��� ����
 * 			 ------> �Ѱ��� ���(��: �α��α��...������ ���, �󼼺��� ���) => ���� �����ϰ� �� 
 * 			������ ����: ����, �迭
 * 			��ɹ�(CPU): �޼ҵ� => ����� ��� ������ �� �ְ� ���ִ� ��
 * 			��)
 * 			{
 * 				int a=10;
 * 				int b=20;
 * 				int c=a+b;
 * 			}
 * 			==> �ٸ� Ŭ������ ����
 * 				Ŭ���� <=======> ���
 * 						�޼ҵ�
 * 
 * 	2. ����ϴ� ����
 * 	 1) ����
 * 	 2) ������(�ҽ��� ���õ� �������� ����) => ������ �ܶ��� ���� ó���ϴ� �Ͱ� ����(=������ ���α׷�)
 * 	 3) �ߺ��ڵ� ����
 * 
 * 	3. �޼ҵ� ����
 * 		������ �޼ҵ��(�Ű�����) ==> �����(�������̽�, �߻�Ŭ����)
 * 		{
 * 			������
 * 		}
 * 
 * 		������ ==> ����û ó�� ���: �Ѱ� ���� ����
 * 							  ----------- �ݵ�� �迭, Ŭ������ ��� ����
 * 		�Ű����� ==> ����ڰ� ó���� �����͸� ������ �ִ� ��
 * 				  ������ ����� ����(, ����� ����)
 * 		������ 
 * 		{
 * 			return ��; ==> �������� ������ �����Ͱ��̾�� ��
 * 			------ ���� ������(�������� void�� ���) void=> ��ü���� ����� ���
 * 		}
 * 
 * 		*** return�� �޼ҵ� ���Ḧ �˷��ش�. ��, �޼ҵ� ����ϸ� return ��� �� 
 * 			return�� �׻� �������� �߰��Ǵ� ���� �ƴ�(���ǿ� ���� �߰��� �� �� ����)
 * 
 * 	4. �޼ҵ� ����
 * 		--------------------------------
 * 			������			�Ű�����(���������� ����) ==> �޼ҵ� ����� ���ÿ� �޸𸮿��� ������� ����. 
 * 						�޼ҵ� �ȿ����� ��� ���� => Stack�� ����(�޸𸮿��� ����)
 * 		--------------------------------
 * 			O			O
 * 				���̺귯��)
 * 					String
 * 					------
 * 					String substring(int s)
 * 					boolean contains(String fd)
 * 					boolean equals(String fd) ==> �Ű������� �ִ� ���, 1)���� ��ġ 2) �������� ��ġ���Ѿ� ��
 * 					��)
 * 						int void add(int a,int b, double d)
 * 						=> ȣ��) add(10,20,30)
 * 						=> �޼ҵ�� ���� �̸����� ���� �� ����(�Ű������� ����, ���������� �ٸ��� ��)
 * 							println, print, ***printf(X)
 * 						=>printf("%d",10)
 * 						  printf("%d%d",10,20)
 * 						  printf("%d%d%.2f",10,20,10.5) ==> ���� �Ű����� 
 * 						  �����Ű������� �տ� ...�� �پ�����. ��) String...arg
 * 						  printf(String pattern,object...obj)
 * 						  ==> ���������� ������� ������ ���� �� ����: Object ��� (���� ū ��������)
 * 		--------------------------------
 * 			O			X		==> String trim(). double Math.random()
 * 		--------------------------------
 * 			X			O		==> �������� ���� ��쿡�� �ݵ�� void�� ��� => �޼ҵ� ��ü���� ó��
 *									��Ʈ��ũ(�����,����) / �����ͺ��̽�(��)
 *													 -----------
 *													 CURD(Create,Update,Read,Delete)
 *													 ������ �˻�, �߰�, ����, ���� 	
 *															  ------------ void				
 * 		--------------------------------
 * 			X			X		==> ��ü ó��. System.out.println()
 */

// printf(String format, Object... args)
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.*;
public class �޼ҵ�_1 {
	static boolean isLogin(String id,String pwd)
	{
		final String ID="admin";
		final String PWD="1234";
		
		/*if(id.equals(ID) && pwd.equals(PWD))
		{
			return true; //�޼ҵ�� return�� �ִ� ������ ���� ==> for������ break�� ���� 
			
		}
		return false;*/
		boolean bCheck=false;
		
		if(id.equals(ID) && pwd.equals(PWD)) //equalsIgnoreCase: ��ҹ��� ����X. equalse: ��ҹ��� ������ ��
			bCheck=true;
		/*else
			bCheck=false;*/ //default ��Ƴ����� ���� else ���� ���ص� ��
		
		return bCheck;
		
	}

	static String recommand()
	{
		String[] title={
        		"That That (Prod. & Feat. SUGA of BTS)",
        		"�����������ܿ� (Still Life)",
        		"TOMBOY",
        		"LOVE DIVE",
        		"����ΰ� ��",
        		"Feel My Rhythm",
        		"����� �� ������",
        		"GANADARA (Feat. ������)",
        		"LOVE me",
        		"���߰��",
        		"�츮���� ��罺",
        		"ZOOM",
        		"������ �� �̸��� �θ���",
        		"�ٽ� ���� �� ������",
        		"���� X����",
        		"��ȣ��",
        		"Celeb",
        		"��� ������",
        		"���� ���� �Ͼ��",
        		"INVU",
        		"ELEVEN",
        		"Stay",
        		"������",
        		"strawberry moon",
        		"MY BAG",
        		"���϶�",
        		"�ƹ���",
        		"A bientot",
        		"�����̾� (Feat. ���ð�)",
        		"Celebrity",
        		"���� ��� ����",
        		"���� �� ���� �״�",
        		"19�� abcdefu",
        		"ȸ���� (Feat. Zion.T & ����Ÿ��) (Prod. by Slom)",
        		"����� ��¥",
        		"�����",
        		"Stronger (What Doesn't Kill You)",
        		"��������",
        		"FEARLESS",
        		"�����ڸ�",
        		"���̶�� ���� (Feat. 10CM)",
        		"Next Level",
        		"�ʸ� ������",
        		"������ (Feat. MINO) (Prod. by GRAY)",
        		"������ �����",
        		"����ؿ� �״븦",
        		"�λ�����",
        		"Bad Habits",
        		"Weekend",
        		"Butter",
        		"�����ټ�, �����ϳ�",
        		"OHAYO MY NIGHT",
        		"�ٶ� ����",
        		"Dynamite",
        		"Counting Stars (Feat. Beenzino)",
        		"ȣ��������",
        		"�� ���� ���",
        		"����ó��",
        		"��鸮�� �ɵ� �ӿ��� �� ��Ǫ���� �������ž�",
        		"Seoul",
        		"����",
        		"�ʷ����Ÿ���츮��",
        		"Tiny Riot",
        		"SMILEY (Feat. BIBI)",
        		"That's Hilarious",
        		"2002",
        		"Timeless",
        		"������ ������ �� �� (The Eternal Moment)",
        		"����",
        		"My Universe",
        		"��� ��, ��� ���� (Every day, Every Moment)",
        		"Permission to Dance",
        		"���",
        		"RUN2U",
        		"������ �뷡",
        		"���ϴ��� ���� (2020)",
        		"���� (With ������)",
        		"���� �ƴ϶�",
        		"Blueming",
        		"���",
        		"���õ� ������ �ʿ��� (To You My Light) (Feat.�̶��)",
        		"Loving You Girl (Feat. Hkeem)",
        		"���� Ʈ��Ʈ�� �Ⱦ��",
        		"With you",
        		"���� ����� (Feat. ������)",
        		"���� �쿬",
        		"���� ���ݾ� (Feat. ������)",
        		"Dun Dun Dance",
        		"Step Back",
        		"At My Worst",
        		"���� �͵��� ���� �� (Boy With Luv) (Feat. Halsey)",
        		"������ ���� �̺��� ����� (Feat. Leellamarz) (Prod. by TOIL)",
        		"Because Of You",
        		"Savage",
        		"Off My Face",
        		"�� to ����",
        		"������ (Feat. ȭ��)",
        		"����",
        		"���̷� Remix (Feat. UNEDUCATED KID & Paul Blanco)",
        		"�Ѹ� (Rollin')",
        		"Every Second",
        		"���縸����",
        		"���� (Prod. & Feat. SUGA of BTS)",
        		"�ƹ����� ��",
        		"12 : 45 (Stripped)",
        		"����",
        		"Hey Mama (Feat. Nicki Minaj & Bebe Rexha & Afrojack)",
        		"�ܿ���",
        		"19�� Peaches (Feat. Daniel Caesar & Giveon)",
        		"Real Love",
        		"��� ������ ���� �Ǿ� �����ٰ�",
        		"��� �̺����� ����ϰھ�, �� ����ϴ� ����",
        		"�Ʒ���",
        		"���� ��ȣ�� ������ (Prod. by ��ȭó��)",
        		"��� ���",
        		"�ʴ�",
        		"�װ� �� ���� �� ���� (N��° ���� X ��θ���)",
        		"�߾��� �������� �̺��� ����",
        		"Savage Love (Laxed - Siren Beat) (BTS Remix)",
        		"�� �翡",
        		"����",
        		"Bad",
        		"����ϰ� �� �� �˾Ҿ�",
        		"Starlight",
        		"�츮�� ������� �ߴ� ����",
        		"Dance Monkey",
        		"Memories",
        		"Dreams Come True",
        		"�����ϴ� ���ε��� ����",
        		"������ �� ����ؿ�",
        		"parachute",
        		"���� (Prod. ������)",
        		"METEOR",
        		"����� (Feat. ������)",
        		"�׷��� �׷� (Feat. ����)",
        		"��⸦ ���� (�������� �׳� X ���)",
        		"Way Back Home",
        		"��",
        		"���������ܿ� ��.",
        		"�� ���� ���� (2021)",
        		"��, �� (N��° ���� X ���� (Whee In))",
        		"���� �� ������",
        		"�������� (We Ride)",
        		"Shape Of You",
        		"ù��ó�� �ʿ��� ���ڴ�",
        		"��� ���� (Prod. by VAN.C)",
        		"�쿬�� ��",
        		"���� �� ���� �� �� ���濡��",
        		"Wake Up (Prod. by �ڵ� �ｺƮ)",
        		"Kiss Me More (Feat. SZA)",
        		"Lovesick Girls",
        		"������",
        		"�׳��� ���� ���� ��������",
        		"Light Switch",
        		"������ �����",
        		"������ ���� �λ�",
        		"Rainy day (Feat. ASH ISLAND & Skinny Brown)",
        		"�ð��� �Ž��� (���� �ߴ� �� X ������)",
        		"���� ��ȣ�� ������",
        		"���� (Feat. MINO) (Prod. by GRAY)",
        		"�ȳ�",
        		"GANJI (Feat. Jessi)",
        		"Can't Control Myself",
        		"Ashes",
        		"��Ǫ (Ah puh)",
        		"����",
        		"����",
        		"��ε�",
        		"Good Boy Gone Bad",
        		"���̵����",
        		"�����̿��ȳ�",
        		"����ΰ� �� (Acoustic Ver.)",
        		"������ �Ǹ� �츮 �׸� �����",
        		"Paris In The Rain",
        		"��������",
        		"���ݾ�",
        		"����� ���",
        		"LOVE",
        		"���� ���� �ʳ׿�",
        		"����",
        		"Christmas Tree",
        		"��� ���� (Feat. ����ȣ)",
        		"MILLIONS",
        		"9INTRO",
        		"�뷡 (The Song)",
        		"��Ҽ�",
        		"�ٽ� ����Ѵٸ� (���� Ver.)",
        		"Don't Start Now",
        		"�װ� ���� �� (Feat. ASH ISLAND) (Prod. by GRAY)",
        		"Whisky on the Rock",
        		"DAYDREAM",
        		"All For You",
        		"����� �����",
        		"��¦ ������ (Nonstop)",
        		"�����ϱ�",
        		"Leave The Door Open",
        		"Forever Young",
        		"���� (Feat. ������)",
        		"�Ϸ縸 ��",
        		"Circles"
        };
		String result="";
		int no=(int)(Math.random()*title.length);
		// ���߿��� ī��, ��α׿��� �ҷ��� ��
		result=title[no];
		return result;
	}
	
	static void sort(int[] arr)
	{
		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n-----------------------------");
		//�������� ����
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	static void gugudan()
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=2;j<=9;j++)
			{
				System.out.printf("%d*%d=%d\t",j,i,j*i);
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a=10;
		String aa="";
		Object o=10;
		o=true;
		o="";
		o=10.5;
		o='A'; */
		/*String id=JOptionPane.showInputDialog("ID�Է�:");
		String pwd=JOptionPane.showInputDialog("��й�ȣ �Է�:");
		
		boolean bCheck=isLogin(id, pwd);
		if(bCheck)
		{
			System.out.println(id+"�� �α��� �Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("ID�� Password�� Ʋ�Ƚ��ϴ�.");
		}*/
		
		//String title=recommand();
		//System.out.println(title);
	
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		//�����ؼ� ��� ��û
		System.out.println(Arrays.toString(arr));
		sort(arr); //sort�� ������ ��������
		System.out.println();
		
		gugudan();
		
		
	}

}
