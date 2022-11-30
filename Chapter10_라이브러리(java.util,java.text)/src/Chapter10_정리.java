/*
 * 	날짜 / 시간 (10장)
 * 
 * 	***Date: 저장용(현재 시스템의 날짜,시간 읽어옴) => 오라클에서 사용 -> 단점) 기능이 거의 없음
 * 	***Calendar: Date클래스 확장 -> 제어가 쉽게 만들어준 클래스(추상클래스로 이루어짐)
 * 		생성방법: Calendar cal=calendar.getInstance() ==> 528페이지
 * 		읽기: cla.get(Calendar.YEAR) ==> 530페이지
 *			cla.get(Calendar.MONTH)
 * 			cla.get(Calendar.DATE)
 * 			cla.get(Calendar.DAY_OF_WEEK)
 * 		쓰기: cla.set(Calendar.YEAR,2022)
 *			cla.set(Calendar.MONTH,11-1) // 0~11
 * 			cla.set(Calendar.DATE,22)
 * 			*** cal.getActualMaximum(Calendar.DATE) : 설정된 달의 마지막 날짜
 *  ***SimpleDateFormat ==> 554페이지(Date를 변환해서 출력)
 *  	년도: yyyy
 *  	월: MM, M
 *  	일: dd, d
 *  	시간: hh
 *  	분: mm, m
 *  	초: ss, s
 *  
 *  ***DecimalFormat: 숫자 변환-> 1,000 => ###,### ==>541페이지
 *  	형식) DecimalFormat df=new DecimalFormat("#,###,###,###")
 *  		System.out.println(df.format(12345678)) ==> 12,345,678 => 쇼핑몰 상품, 예약 최종금액 
 *  MessageFormat: DB에서 출력형식을 만든다
 *  	String pattern="{0},{1},{2}...";
 *  	Object[] obj={};
 *  	MessageFormat.format(pattern,obj)
 *  ***LocalDate: 날짜
 *  	LocalDate.now(): 현재 날짜 
 *  	LocalTime.of(년, 월, 일): 날짜 설정
 *  LocalTime: 시간
 *  	LocalTime.now(): 현재 시간
 *  	LocalTime.of(시간, 분, 초) => 시간 24시간
 *  ***LocalDateTime: 날짜+시간
 *  	LocalDate+LocalTime
 *  
 *  ==============> isAfter(), isBefore(), isEqual()
 *  ==============> between
 *  
 */
public class Chapter10_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
