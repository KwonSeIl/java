/*
 * Scanner sc = new Scanner(System.in);                                
System.out.print("Á¤¼ö ÇÏ³ª ÀÔ·Â : ");                
int num = sc.nextInt();                                
System.out.println("1ºÎÅÍ 100 »çÀÌÀÎÁö È®ÀÎ : " + (#1));  
#1.
num>=1 && num<=100 => ¹üÀ§ Æ÷ÇÔ   1~100»çÀÌ ¼ö                           
 //5~10 »çÀÌÀÇ ¹üÀ§¿¡ ÇØ´çÇÏÁö ¾ÊÀº °ªÀÌ¸é true ¾Æ´Ï¸é false¸¦ ¸®ÅÏ
 System.out.println("5ºÎÅÍ 10 »çÀÌÀÇ °ªÀÌ ¾Æ´ÑÁö È®ÀÎ : " + (#2)); 
 #2.
 !(num>=5 && num<=10)                               
//¿µ¾î ´ë¹®ÀÚ³Ä?                
//--> ¹®ÀÚº¯¼ö >= 'A' && ¹®ÀÚº¯¼ö <= 'Z'                
System.out.print("¹®ÀÚ ÇÏ³ª ÀÔ·Â : ");                
char ch = sc.next().charAt(0);                
System.out.println("¿µ¾î ´ë¹®ÀÚÀÎÁö È®ÀÎ : " + (#3));
#3.
ch>='A' && ch<='Z'      => ¼Ò¹®ÀÚ ch>='a' && ch<='z'
                         =>ÇÑ±Û ch>='°¡' && ch<='ÆR' [^°¡-ÆR]->ÇÑ±Û »©°í
// || : ¿©·¯ °ªÀ» Á¦½ÃÇÏ°í ±× Áß¿¡ ÇÏ³ª¶óµµ ¸Â´Â°Ô ÀÖ´ÂÁö ¹°¾îº¼ ¶§ »ç¿ë                
// ÀÔ·Â ¹®ÀÚ°¡ ´ë ¼Ò¹®ÀÚ »ó°ü ¾øÀÌ 'y' È¤Àº 'Y' ÀÎÁö ¹°¾îº¼ ¶§               
System.out.print("°è¼Ó ÇÏ½Ã·Á¸é y È¤Àº Y¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");                
char ch2 = sc.next().charAt(0);                
System.out.println("¿µ¹®ÀÚ y È¤Àº YÀÎÁö È®ÀÎ : " + (#4));
#4.
ch2=='y' || ch2=='Y'  
 // ¾ËÆÄºª ´ë¹®ÀÚ ÀÌ°Å³ª ¼Ò¹®ÀÚÀÎÁö È®ÀÎ                
System.out.print("¹®ÀÚ ÇÏ³ª ÀÔ·Â : ");                
char ch3 = sc.next().charAt(0);               
 System.out.println("¾ËÆÄºªÀÎÁö È®ÀÎ : " +($5)); 
 #5.
 (ch3>'a' && ch3<='Z||ch3>='a' && ch3<='z') / !(ch>'a' && ch<='Z||ch>='a' && ch<='z')               

 */
public class ¹®Á¦19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
