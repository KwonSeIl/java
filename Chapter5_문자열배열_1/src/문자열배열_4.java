import java.util.Scanner;

public class ���ڿ��迭_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {
        		"���:apple",
        		"��:pear",
        		"��:chestnut",
        		"��:pine nut",
        		"ȣ��:walnut",
        		"���丮:acorn",
        		"��:tangerine",
        		"����:strawberry",
        		"���ξ���:pineapple",
        		"����:grape",
        		"������:peach",
        		"�챸:apricot",
        		"�Ž�:Japanese apricot",
        		"�ڵ�:plum",
        		"Ű��:kiwi",
        		"�丶��:tomato",
        		"��纣��:blueberry",
        		"�޵�:cherry",
        		"�ٳ���:banana",
        		"������:orange",
        		"����:watermelon",
        		"���:melon",
        		"����:oriental melon",
        		"����:mango",
        		"����:lemon",
        		"����:pomegranate",
        		"�ڸ�:grapefruit",
        		"����:jujub",
        		"��:persimmon",
        		"����:dried persimmon",
        		"��ġ:litchi",
        		"���:quince",
        		"����:mulberry",
        		"����:citron",
        		"��ȭ��:fig",
        		"ȣ��:pumpkin",
        		"����:cucumber",
        		"����:onion",
        		"����:garlic",
        		"����:ginger",
        		"��:radish",
        		"��:mugwort",
        		"���:carrot",
        		"�λ�:ginseng",
        		"���:wild ginseng",
        		"����:deodeok",
        		"�׼�:bamboo shoot",
        		"������ī:paprika",
        		"�Ǹ�:pimiento",
        		"����:chives",
        		"��:green onion",
        		"����:potato",
        		"����:sweet-potato",
        		"����:eggplant",
        		"������:corn",
        		"����:pepper",
        		"����:chili, hot pepper",
        		"����:Chinese cabbage",
        		"�����:cabbage",
        		"����:lettuce",
        		"�����:lettuce",
        		"�ñ�ġ:spinach",
        		"��:bean",
        		"����:peanut",
        		"��:sesame",
        		"����:sesame leaf",
        		"�ᳪ��:bean sprouts",
        		"����:mushroom",
        		"�̿�:seaweed"
        };
		/*
		 * 	equals: ��ҹ��� �����ؼ� ��
		 * 	equalsIgnoreCase: ��ҹ��� ����X => �˻��� 
		 *  ------------------------------------ ���������� ����
		 *  
		 */
		Scanner scan=new Scanner(System.in);
		System.out.print("�����̸� �Է�:");
		String f=scan.next();
		for(String s:arr)
		{
			String kor=s.substring(0,s.indexOf(":"));
			String eng=s.substring(s.indexOf(":")+1);
			if(kor.equals(f)) //���� ��쿡 ã�� ==> startsWith, contains, equals, equalsIgnoreCase ����
			{
				System.out.println("���ϸ�:"+kor);
				System.out.println("������:"+eng);
				break;
			}
		}

	}

}
