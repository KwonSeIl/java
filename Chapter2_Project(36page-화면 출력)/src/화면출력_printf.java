/*
 *  1. ����  2. ������  3. ���  4. ȭ�����
 *  ---------------------------------����(��Ƽ� ����)=> �޼ҵ�, Ŭ����
 *  								 (��ŷ ����-> ������ ��ȣ=>ĸ��ȭ)=> ���, ����
 *  1. ���α׷� (�ҽ� �ڵ� �ݺ�) => ���� ���� 
 *  
 *  ������ ����  ==> ������ ���� ==> ȭ�� ���
 *   (����)		������, ���
 *   		    ---------->���� ���߱�
 *   ��������: �޸�ũ�� (�⺻��)
 *   --------------------------------------------------
 *   ����
 *    byte(1byte): -128~127, ��Ʈ��ũ����, ���Ͼ�/�ٿ�ε�
 *    ***int (4byte): �Ϲ� ���� ����, -21�� 4õ~21�� 4õ
 *    ***long (8byte): ������, ê��
 *   �Ǽ�
 *    ***double (8byte): �Ҽ��� 15�ڸ�
 *   ����
 *    char (2byte): 0~65535->��� ���ڴ� ��ȣ ����. 'A':65, 'a':97, '0':48
 *    				*** ���� ó�� �� ���������� ���� 
 *    				*** ��������: string 
 *   ��
 *    ***boolean (1byte): true/false
 *  
 *  �������� ũ�� => �ʿ�ÿ��� �������� �������� ����O (����ȯ)
 *  ---------
 *   byte < char < int < long < float < double
 *   		short
 *   ����ó�� �ϰ� ��)
 *    int + long = long
 *    double + int + char = double
 *    
 *    10+10.5 ==> 20.5
 *    --> 10.0���� ��ȯ	
 *        10.0+10.5 => 20.5 ==> �ڵ���ȯ 
 * 
 *  ȭ�����(36page)
 *  System.out.println() : ���� ��� => ln(newLine)
 *  System.out.print() : ���� ��� 
 *  System.out.printf() : ���� ����(�ڸ���, ���� ���)
 *  	=> %d, %c, %f, %s
 *  		--------------�����
 *  		%d: ����
 *  		%c: ����
 *  		%f: �Ǽ�
 *  		%s: ���ڿ�
 *  		-%o(8����), %x(16����), %e(����), %b(boolean): ���ø� ���� 
 *  Ư������*****(�� ���)
 *  -----
 *   \t: tab-> �������� ó�� 
 *   \n: ������ ���-> newLine
 *   \": ��θ�
 *  -----------------------------------------------------------
 *  
 *  
 */
public class ȭ�����_printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//println()
		//System.out.println("Hello");
		//System.out.println("Java");
		//System.out.print("Hello\t"); ->��������
		//System.out.print("\n"); <==> System.out.println(); 
		//System.out.print("Hello\n"); 
		//System.out.println("Java");
		//System.out.printf("%s,%s","Hello","Java"); 
		System.out.printf("��������:%d",80);
		System.out.println("���:"+(85/3.0)); //�Ҽ��� ���� ����
		//System.out.printf("���:%.2f",(85/3.0)); �Ҽ���, ��°��� ���� �� ���
		// %5d(����������)   %-5d(��������) ==> 3�ڸ�
		//System.out.printf("%5d%5d%5d",90,80,70);
		System.out.printf("%-5d%-5d%-5d\n",90,80,70); //jdk 1.5=> c����� printf ��� 
		System.out.println(90+"   "+80+"   "+70);
		
	}

}
