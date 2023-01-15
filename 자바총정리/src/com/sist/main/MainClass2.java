package com.sist.main;
/*
 * 	���̺귯��
 *		= java.lang(�ڹ����α׷��� �⺻) => import�� ������ ����
 *			1) Object: �ֻ��� Ŭ����(��� Ŭ������ Object�κ��� ����� �޴´�)
 *					=> ���� �ٸ� Ŭ������ ��� ����
 *					=> ��� ���̺귯������ ��ü�� �����ϴ� �޼ҵ�� Object���� ������ ����
 *						--------- ����ڰ� � Ŭ�������� ������� ���� ���ϱ� ������ -> ����ȯ
 *						class A
 *						{
 *							aaa()
 *							bbb()
 *							ccc()
 *						}
 *						Object a=new A(); ==> ȣ��X(������ Object�� ������ �ִ� ������ ���� ����)
 *						A aa=(A)a;
 *							Object�� ������ �ִ� �޼ҵ常 ȣ�� ����(�޼ҵ� => �������̵��� �޼ҵ带 ȣ����)
 *					=> toString(): ��ü�� ���ڿ��� ��ȯ (������ �� ����) 
 *						A a=new A();
 *						System.out.println("a="+a) ==> a.toString()		
 *														----------- ��ü�� �ּ� ���
 *														----------- �������̵�(������ ��) 
 *					=> finalize(): �Ҹ���(�������÷���-> �ڵ�ȣ��) => ������(�޸� ���� ���� Ȯ��) 
 *									=> ��Ƽ�̵��, ȭ��, ����
 *					=> clone(): ����(���� �޸� ũ��� ���ο� �޸� ����) => ������(prototype)
 *						������������ �̱��� ���� ���(��ü�� �޸� �Ѱ��� ���) -> ������ ����(clone) => �޸� �������� ����
 *					=> equals(): ��ü ��
 *								��-> == : �ּҰ� ��
 *									equals(): ���� ����� �� �� 
 *					=> ����
 *						class A
 *						A a=new A();
 *						A b=a; 	=============> a,b�� ����(�Ű������� ���� �޴� ���)
 *												Call By Reference: ���� �ּҸ� ���� 
 *						A a=new A();
 *						A b=a.clone();	====> ���ο� �޸𸮰� �ʿ�. �޶��� 
 *						
 *			2) String: ���ڿ� ����(�����ͺ��̽�)
 *						����Ŭ
 *							������, ������, ��¥��, ��Ÿ��
 *							---- CHAR, VARCHAR2, CLOB => �ڹٿ����� String���� �޴´�
 *								 ---- NUMBER(4), NUMBER(7,2) => int, double
 *										--- DATE, TIMESAMP => java.util.Date
 *											 --- BLOB/BFILE => InputStream
 *				= ���� ���� ���
 *					String s=""(�����), String s=new String("")
 *				= ���: ������Ʈ(ȭ��UI => HTML�� ���� ���ڿ�) => CSS�� ����
 *					1��: SQL, ȭ��UI(�۲�, ����)
 *				= length(): ������ ���� => int length()
 *				= trim(): �¿� ���� ���� => String trim() -> �α���, ȸ������, �˻�
 *				= substring(): ���� �ڸ� �� 
 *								�����ε�: String substring(int begin)
 *										String substring(int begin, int end): end-1
 *				= startsWith(): ���� ���ڿ��� ���� ��� -> Cookie ����
 *								boolean startsWith(String fd)
 *				= endsWitt(): ������ ���ڿ��� ���� ���
 *								boolean endsWith(String fd)
 *				= contains(): ���� ���� ���� -> �˻�
 *								=> �������� ã��. -> ����Ŭ(PL/SQL)=Procedure, �ڹ�
 *								=> Procedure -> ���
 *								=> ���ν��� VS Ʈ����
 *								=> boolean contains(string fd) -> ��õ, ê��
 *				= equals(): ���� ��� => ��ҹ��� ���� -> �α���, ���̵� ã��, ��й�ȣ ã�� 
 *				= indexOf(): ã�� ���ڳ� ���ڿ��� ��ġ -> �տ������� ã��
 *							=> int indexOf(char c)
 *							=> int indexOf(String s)
 *							=> INSER("",1)
 *				= lastIndexOf(): ã�� ���ڳ� ���ڿ��� ��ġ-> �ڿ������� ã�� => ��θ�, Ȯ����
 *							=> int lastIndexOf(char c)
 *							=> int lastIndexOf(String s)
 *							=> INSTR("",-1)
 *							=> Hello Java
 *							   1234567890
 *										-1
 *				= valueOf(): static �޼ҵ� -> ��� ���������� ���ڿ��� ��ȯ 
 *							static String valueOf(int)
 *							static String valueOf(double)
 *							static String valueOf(char[])
 *			3) StringBuffer: ���ڿ� ���� -> ����ȭ
 *				= append(): ���ڿ� ����(+)
 *				= toString(): ����� �����͸� �ѹ��� ���� �� 
 *			4) Math: ���� ����
 *				= random(): ���� �߻�, (0.0~0.99) => static double random()
 *				= ceil(): �ø� �Լ� -> �������� ���ϱ� => static double ceil(double d)
 *				= round(): �ݿø� -> ���� => static double round(double d)
 *			5) ***Wrapper: ���������� Ŭ����ȭ => Integer, Double, Boolean, Long
 *					=> �ַ� ��� -> ���׸���: �⺻���� ����� �� ���� <Ŭ������>
 *					=> <int> X -> <Integer>
 *						�⺻�� ====== Wrapper ȣȯ�Ǿ� ����
 *						Wrapper = �⺻��: �ڽ�
 *							Integer i=10
 *						�⺻�� = Wrapper: ��ڽ� 
 *							int ii=i
 *
 *					=> parseInt(), parseDouble(), parseBoolean(), parseLong()
 *						=> ���ڿ��� �ش� ������������ ����
 *							--- ���� ���α׷�: ������, ������, �޴��� 
 *										   --- ex ���� ����X -> ����Ŭ�� �Ұ� . ��������(���ڿ�) 
 *			6) System
 *				ǥ�� ����� => System.in, System.out
 *				gc(): �������÷��� ȣ�� 
 *				currentTimeMillis(): �ð� �б� => ����ð� -> �α����� 
 *		= java.util: ��, ����Ͽ��� ���󵵰� ���� Ŭ������ ����
 *			1) StringTokenizer: �ܾ ���ڸ� �ڸ� �� ���
 *				= ������ -> new StringTokenizer(String data, ������)
 *															--- String
 *					   -> ������ -> new StringTokenizer(String data) => ����
 *					   -> �迭 �������� => ������ ���� ������ ���� �߻�
 *				= ���е� ������ �б�: nextToken() => String nextToken()
 *				= ���е� �����͸�ŭ ���� ó��: hasMoreTokens(): ������ �ٸ��ų� �� �𸣴� ���
 *					**while(hasMoreTokens()) => boolean hasMoreTokens()
 *				= countTokens(): �ڸ� ���� => int countTokens()
 *			2) Date, Calendar => Date�� ����� ����(��¥�� ��������)
 *							  => Date�� ���� ����� �߰� ���ο� Ŭ���� -> calendar
 *							  => Calendar�� �߻�Ŭ����
 *								����
 *								Calendar cal=Calendar.getInstance()
 *								----------------------------------
 *								��¥ ����: set(Calendar.YEAR,2022)
 *										set(Calendar.MONTH,10) => MONTH�� �ν��� �� 0������ �ν�
 *										set(Calendar.DATE,30)	
 *								��¥ �б�: get(Calendar.YEAR)
 *										get(Calendar.MONTH)
 *										get(Calendar.DATE)
 *										get(Calendar.DAY_OF_WEEK) =>���� 1��(�Ͽ���) 
 *								=> �޷�(����, ����, ������, �����) 
 *			3) ArrayList, HashSet, HashMap = Vector
 *						Collection: �����͸� ��Ƽ� ����(�迭�� Ȯ��, �迭�� ������ ����)
 *						---------- �������̽��� �Ǿ� ����: ǥ��ȭ �Ǿ� ����, �ʿ�ÿ� �������̵��ؼ� ���
 *						 �迭 ����: ���� ���������� ��Ƽ� ����, ������ 
 *								 ------------------ -----
 *									�ٸ� ���������� ������ �� ����(Object), ������
 *						Collection
 *							|
 *					----------------------------
 *					|				|			|
 *				  List			 Set			Map
 *					List: ���� ����, ������ �ߺ� ��� -> �˻�, ���������� ����ӵ��� ���� ����, ������ �����ϴ� �ӵ� ����
 *							�����ͺ��̽����� �ַ� ���Ǵ� �÷���
 *							=> ������ Ŭ����: ArrayList, Vector, LinkedList
 *										  -------- �ڷᱸ��(���� �޸� ��� ���� => CURD)
 *											add(), remove(), set(), get(), clear(), size()
 *											�߰�		����		����		�б�		��ü����	����
 *					Set: ���� ����, ������ �ߺ� ������� ����
 *						 ArrayList�� ����� �������߿� �ߺ��� ������ ����  ==> ����Ŭ���� ����: DISTINCT
 *						 HashSet / TreeSet
 *						 -------
 *						   add(), remove(), get(), clear(), size()
 *						  => ������ ����� �� (����� ���� ����)-> �������� ä��
 *							Application: Socket
 *							Web: WebSocket(Spring)
 *					Map: Ű�� ���� ���ÿ� ����
 *						 Ű�� �ߺ��� �� ����
 *						 ���� �ߺ� ���� 
 *						 => Ŭ���� ����(������), SQL����(���̹�Ƽ��), ��Ű, ����, ��û��, ���䰪 ==> Web���� �ַ� ����
 *						 => HashMap / Hashtable 
 *							------	  ---------
 *							�񵿱�			����			====> AJAX
 *							put(): ����
 *							get(): �б�
 *							----------- �����Ͱ� ���� -> put�̿� ==> put("���� Ű","��") 
 *			4) java.lang.regexx
 *				Pattern / Matcher ==> ���Խ�
 *				���Խ� ��ȣ
 *				--------
 *				[] => ���� [A-Z], [a-z], [A-Za-z], [0-9], [��-�R]
 *						  [A-C] [A|D|V]
 *				{} => ���� [A-Z]{3}, [A-Z]{1,3}
 *				+: 1�̻� => ����+
 *				*: 0�̻� => ����*
 *				.: ������ ���� �ѱ��� [A-Z]. A1 AK A��
 *				$: ������ ���� [A-Z]$
 *				^: ���۹��� ^[A-Z] /��������(����) [^A-Z]
 *				|: ����
 *				=====================================> ���ڿ��� ������ ����� �˻� (����Ŭ, �ڹٽ�ũ��Ʈ)
 *		= java.text
 *			1) SimpleDateFormat: ��¥�� ���ϴ� ���·� ��� => �Խ���, �Է�...
 *				=> TO_CHAR ����Ŭ���� ������ ���
 *				=> String, Math, Date ..: �ʿ�ÿ��� ����Ŭ���� ������ ���� 
 *			2) MessageFormat: SQL => �����ִ� ���ڿ��� ���� �� ���
 *				=> String name, sex, address, tel;
 *					int age; 
 *					WHERE name LIKE '%A%'
 *					WHERE REGEXP_LIKE(name,'A')
 *					WHERE SUBSTR(name,1,'A')
 *					WHERE INSTR(name,1,'A')>0
 *				=> �߰�(���ڿ��� ����Ŭ�� ����)
 *					String sql="INSERT INTO table_name VALUES('"+name+"','"+sex+"','"+address
 *								+"','"+tel+"',"+age+")";
 *					String sql="INSRT INTO table_name VALUES('{0}','{1}','{2}','{3}',{4});
 *					==> �ֱٿ� java.sql�� ���� -> PreparedStatement => (?,?,?,?,?)
 *		= java.io	
 *			1) File: ���� / ���丮 ���� ���� 
 *				File file=new File("��θ�"); ==> ���丮 ����
 *				File file=new File("��θ�/���ϸ�"); ==> ���� ����
 *				=> �ֿ� �޼ҵ� 
 *					= getName(): ���ϸ�, ���丮��
 *					= getPath(): ��θ� ��ü �б�
 *					= getParent(): ��θ� �б�
 *					= length(): ���� ũ��
 *					= listFiles(): ��ü ���ϸ��� �б� ==> ls -a, dir
 *					= createNewFile(): ���� �����
 *					= mkdir(): ���� ����� ==> mkdir
 *					= delete(): ���� ���� ==> rm -rf
 *			2) FileInputStream / BufferedInputStream
 *					read(), close() ==> �б� / �ݱ� 
 *			3) FileOutputStream / BufferedOutputStream ==> �ٿ�ε�
 *					write(), close()
 *			--------------------------------------------------- ���� �� 1byte => ����Ʈ ��Ʈ��
 *			4) FileReader / ***BufferedReader : readLine()
 *					read(), close()
 *			5) FileWriter / BufferedWriter
 *					write(String), close()
 *			------------------------------------------------ ���� �� 2byte => ���� ��Ʈ��
 *															�ѱ��� ���Ե� ��쿡 �ַ� ���(���Ͽ� ����� �����͸� ������ �� ���� ���) 
 *		= java.net
 *			1) URL: ������Ʈ �ּҸ� ������ �� ���
 *			2) URLEncoder: ������(ASC), �ڹ�(Unicode)
 *							--------	--------- 
 *							1byte		2byte
 *							=> �ڹ� ========== �������� ����
 *									byte �迭�� ���� => ���ڵ� 
 *							=> ������ ======== �ڹ�
 *									byte�迭�� String���� ��ȯ => ���ڵ�
 */
import java.io.*;
import java.net.*;

import javax.net.ssl.HttpsURLConnection;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			URL url=new URL("https://www.daum.net/");
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			if(conn!=null) //����Ǿ��ٸ�
			{
				BufferedReader in=
						new BufferedReader(new InputStreamReader(conn.getInputStream()));
				while(true)
				{
					String s=in.readLine();
					if(s==null) break;
					System.out.println(s);
				}
			}
		}catch(Exception ex) {}

	}

}
