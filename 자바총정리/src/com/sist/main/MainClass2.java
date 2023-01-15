package com.sist.main;
/*
 * 	¶óÀÌºê·¯¸®
 *		= java.lang(ÀÚ¹ÙÇÁ·Î±×·¥ÀÇ ±âº») => import¸¦ »ý·«ÀÌ °¡´É
 *			1) Object: ÃÖ»óÀ§ Å¬·¡½º(¸ðµç Å¬·¡½º´Â Object·ÎºÎÅÍ »ó¼ÓÀ» ¹Þ´Â´Ù)
 *					=> ¼­·Î ´Ù¸¥ Å¬·¡½º¸¦ ¹­¾î¼­ °ü¸®
 *					=> ¸ðµç ¶óÀÌºê·¯¸®¿¡¼­ °´Ã¼¸¦ ¸®ÅÏÇÏ´Â ¸Þ¼Òµå´Â ObjectÇüÀ» °¡Áö°í ÀÖÀ½
 *						--------- »ç¿ëÀÚ°¡ ¾î¶² Å¬·¡½º¸íÀ» »ç¿ëÇÒÁö ¾ËÁö ¸øÇÏ±â ¶§¹®¿¡ -> Çüº¯È¯
 *						class A
 *						{
 *							aaa()
 *							bbb()
 *							ccc()
 *						}
 *						Object a=new A(); ==> È£ÃâX(º¯¼ö´Â Object°¡ °¡Áö°í ÀÖ´Â º¯¼ö¸¸ Á¦¾î °¡´É)
 *						A aa=(A)a;
 *							Object°¡ °¡Áö°í ÀÖ´Â ¸Þ¼Òµå¸¸ È£Ãâ °¡´É(¸Þ¼Òµå => ¿À¹ö¶óÀÌµùµÈ ¸Þ¼Òµå¸¦ È£ÃâÇÔ)
 *					=> toString(): °´Ã¼¸¦ ¹®ÀÚ¿­·Î º¯È¯ (»ý·«ÇÒ ¼ö ÀÖÀ½) 
 *						A a=new A();
 *						System.out.println("a="+a) ==> a.toString()		
 *														----------- °´Ã¼ÀÇ ÁÖ¼Ò Ãâ·Â
 *														----------- ¿À¹ö¶óÀÌµù(º¯¼öÀÇ °ª) 
 *					=> finalize(): ¼Ò¸êÀÚ(°¡ºñÁöÄÃ·º¼Ç-> ÀÚµ¿È£Ãâ) => ÀçÁ¤ÀÇ(¸Þ¸ð¸® ÇØÁ¦ ¿©ºÎ È®ÀÎ) 
 *									=> ¸ÖÆ¼¹Ìµð¾î, È­»ó, À½¼º
 *					=> clone(): º¹»ç(°°Àº ¸Þ¸ð¸® Å©±â·Î »õ·Î¿î ¸Þ¸ð¸® Á¦ÀÛ) => ½ºÇÁ¸µ(prototype)
 *						½ºÇÁ¸µ¿¡¼­´Â ½Ì±ÛÅÏ ¸¹ÀÌ »ç¿ë(°´Ã¼´ç ¸Þ¸ð¸® ÇÑ°³¸¸ »ç¿ë) -> ¿©·¯°³ Á¦ÀÛ(clone) => ¸Þ¸ð¸® ´©¼öÇö»ó ¹æÁö
 *					=> equals(): °´Ã¼ ºñ±³
 *								ºñ±³-> == : ÁÖ¼Ò°ª ºñ±³
 *									equals(): ½ÇÁ¦ ÀúÀåµÈ °ª ºñ±³ 
 *					=> ÂüÁ¶
 *						class A
 *						A a=new A();
 *						A b=a; 	=============> a,b´Â °°´Ù(¸Å°³º¯¼ö·Î °ªÀ» ¹Þ´Â °æ¿ì)
 *												Call By Reference: °°Àº ÁÖ¼Ò¸¦ Á¦¾î 
 *						A a=new A();
 *						A b=a.clone();	====> »õ·Î¿î ¸Þ¸ð¸®°¡ ÇÊ¿ä. ´Þ¶óÁü 
 *						
 *			2) String: ¹®ÀÚ¿­ ÀúÀå(µ¥ÀÌÅÍº£ÀÌ½º)
 *						¿À¶óÅ¬
 *							¹®ÀÚÇü, ¼ýÀÚÇü, ³¯Â¥Çü, ±âÅ¸Çü
 *							---- CHAR, VARCHAR2, CLOB => ÀÚ¹Ù¿¡¼­´Â StringÀ¸·Î ¹Þ´Â´Ù
 *								 ---- NUMBER(4), NUMBER(7,2) => int, double
 *										--- DATE, TIMESAMP => java.util.Date
 *											 --- BLOB/BFILE => InputStream
 *				= ¹®ÀÚ ÀúÀå ¹æ¹ý
 *					String s=""(»ç¿ëÒý), String s=new String("")
 *				= ±â´É: À¥»çÀÌÆ®(È­¸éUI => HTMLÀº ÇÑÁÙ ¹®ÀÚ¿­) => CSS·Î Á¶Àý
 *					1Â÷: SQL, È­¸éUI(±Û²Ã, »ö»ó)
 *				= length(): ¹®ÀÚÀÇ °³¼ö => int length()
 *				= trim(): ÁÂ¿ì °ø¹é Á¦°Å => String trim() -> ·Î±×ÀÎ, È¸¿ø°¡ÀÔ, °Ë»ö
 *				= substring(): ¹®ÀÚ ÀÚ¸¦ ¶§ 
 *								¿À¹ö·Îµù: String substring(int begin)
 *										String substring(int begin, int end): end-1
 *				= startsWith(): ½ÃÀÛ ¹®ÀÚ¿­ÀÌ °°Àº °æ¿ì -> Cookie ÀúÀå
 *								boolean startsWith(String fd)
 *				= endsWitt(): ³¡³ª´Â ¹®ÀÚ¿­ÀÌ °°Àº °æ¿ì
 *								boolean endsWith(String fd)
 *				= contains(): ¹®ÀÚ Æ÷ÇÔ ¿©ºÎ -> °Ë»ö
 *								=> ÀÚÀ½À¸·Î Ã£±â. -> ¿À¶óÅ¬(PL/SQL)=Procedure, ÀÚ¹Ù
 *								=> Procedure -> ´ñ±Û
 *								=> ÇÁ·Î½ÃÀú VS Æ®¸®°Å
 *								=> boolean contains(string fd) -> ÃßÃµ, Ãªº¿
 *				= equals(): °°Àº °æ¿ì => ´ë¼Ò¹®ÀÚ ±¸ºÐ -> ·Î±×ÀÎ, ¾ÆÀÌµð Ã£±â, ºñ¹Ð¹øÈ£ Ã£±â 
 *				= indexOf(): Ã£´Â ¹®ÀÚ³ª ¹®ÀÚ¿­ÀÇ À§Ä¡ -> ¾Õ¿¡¼­ºÎÅÍ Ã£À½
 *							=> int indexOf(char c)
 *							=> int indexOf(String s)
 *							=> INSER("",1)
 *				= lastIndexOf(): Ã£´Â ¹®ÀÚ³ª ¹®ÀÚ¿­ÀÇ À§Ä¡-> µÚ¿¡¼­ºÎÅÍ Ã£À½ => °æ·Î¸í, È®ÀåÀÚ
 *							=> int lastIndexOf(char c)
 *							=> int lastIndexOf(String s)
 *							=> INSTR("",-1)
 *							=> Hello Java
 *							   1234567890
 *										-1
 *				= valueOf(): static ¸Þ¼Òµå -> ¸ðµç µ¥ÀÌÅÍÇüÀ» ¹®ÀÚ¿­·Î º¯È¯ 
 *							static String valueOf(int)
 *							static String valueOf(double)
 *							static String valueOf(char[])
 *			3) StringBuffer: ¹®ÀÚ¿­ °áÇÕ -> ÃÖÀûÈ­
 *				= append(): ¹®ÀÚ¿­ °áÇÕ(+)
 *				= toString(): ÀúÀåµÈ µ¥ÀÌÅÍ¸¦ ÇÑ¹ø¿¡ ÀÐÀ» ¶§ 
 *			4) Math: ¼öÇÐ °ü·Ã
 *				= random(): ³­¼ö ¹ß»ý, (0.0~0.99) => static double random()
 *				= ceil(): ¿Ã¸² ÇÔ¼ö -> ÃÑÆäÀÌÁö ±¸ÇÏ±â => static double ceil(double d)
 *				= round(): ¹Ý¿Ã¸² -> ÆòÁ¡ => static double round(double d)
 *			5) ***Wrapper: µ¥ÀÌÅÍÇüÀ» Å¬·¡½ºÈ­ => Integer, Double, Boolean, Long
 *					=> ÁÖ·Î »ç¿ë -> Á¦³×¸¯½º: ±âº»ÇüÀ» »ç¿ëÇÒ ¼ö ¾øÀ½ <Å¬·¡½ºÇü>
 *					=> <int> X -> <Integer>
 *						±âº»Çü ====== Wrapper È£È¯µÇ¾î ÀÖÀ½
 *						Wrapper = ±âº»°ª: ¹Ú½Ì
 *							Integer i=10
 *						±âº»Çü = Wrapper: ¾ð¹Ú½Ì 
 *							int ii=i
 *
 *					=> parseInt(), parseDouble(), parseBoolean(), parseLong()
 *						=> ¹®ÀÚ¿­À» ÇØ´ç µ¥ÀÌÅÍÇüÀ¸·Î º¯°æ
 *							--- ½ÇÁ¦ ÇÁ·Î±×·¥: À©µµ¿ì, ºê¶ó¿ìÀú, ÈÞ´ëÆù 
 *										   --- ex ÆÄÀÏ Á¸ÀçX -> ´õºíÅ¬¸¯ ºÒ°¡ . µ¥ÀÌÅÍÇü(¹®ÀÚ¿­) 
 *			6) System
 *				Ç¥ÁØ ÀÔÃâ·Â => System.in, System.out
 *				gc(): °¡ºñÁöÄÃ·º¼Ç È£Ãâ 
 *				currentTimeMillis(): ½Ã°£ ÀÐ±â => ½ÇÇà½Ã°£ -> ·Î±×ÆÄÀÏ 
 *		= java.util: À¥, ¸ð¹ÙÀÏ¿¡¼­ »ç¿ëºóµµ°¡ ¸¹Àº Å¬·¡½ºÀÇ ÁýÇÕ
 *			1) StringTokenizer: ´Ü¾îº° ¹®ÀÚ¸¦ ÀÚ¸¦ ¶§ »ç¿ë
 *				= »ý¼ºÀÚ -> new StringTokenizer(String data, ±¸ºÐÀÚ)
 *															--- String
 *					   -> »ý¼ºÀÚ -> new StringTokenizer(String data) => °ø¹é
 *					   -> ¹è¿­ Çü½ÄÀ¸·Î => µ¥ÀÌÅÍ °³¼ö ³ÑÀ¸¸é ¿À·ù ¹ß»ý
 *				= ±¸ºÐµÈ µ¥ÀÌÅÍ ÀÐ±â: nextToken() => String nextToken()
 *				= ±¸ºÐµÈ µ¥ÀÌÅÍ¸¸Å­ ·çÇÁ Ã³¸®: hasMoreTokens(): °³¼ö°¡ ´Ù¸£°Å³ª Àß ¸ð¸£´Â °æ¿ì
 *					**while(hasMoreTokens()) => boolean hasMoreTokens()
 *				= countTokens(): ÀÚ¸¥ °³¼ö => int countTokens()
 *			2) Date, Calendar => Date´Â ±â´ÉÀº ¾ø´Ù(³¯Â¥ÀÇ µ¥ÀÌÅÍÇü)
 *							  => Date¿¡ ¾ø´Â ±â´ÉÀ» Ãß°¡ »õ·Î¿î Å¬·¡½º -> calendar
 *							  => Calendar´Â Ãß»óÅ¬·¡½º
 *								»ý¼º
 *								Calendar cal=Calendar.getInstance()
 *								----------------------------------
 *								³¯Â¥ ¼³Á¤: set(Calendar.YEAR,2022)
 *										set(Calendar.MONTH,10) => MONTH´Â ÀÎ½ÄÇÒ ¶§ 0¹øºÎÅÍ ÀÎ½Ä
 *										set(Calendar.DATE,30)	
 *								³¯Â¥ ÀÐ±â: get(Calendar.YEAR)
 *										get(Calendar.MONTH)
 *										get(Calendar.DATE)
 *										get(Calendar.DAY_OF_WEEK) =>¿äÀÏ 1¹ø(ÀÏ¿äÀÏ) 
 *								=> ´Þ·Â(¿¹¸Å, ¿¹¾à, °áÀçÀÏ, ¹è¼ÛÀÏ) 
 *			3) ArrayList, HashSet, HashMap = Vector
 *						Collection: µ¥ÀÌÅÍ¸¦ ¸ð¾Æ¼­ °ü¸®(¹è¿­À» È®Àå, ¹è¿­ÀÇ ´ÜÁ¡À» º¸¿Ï)
 *						---------- ÀÎÅÍÆäÀÌ½º·Î µÇ¾î ÀÖÀ½: Ç¥ÁØÈ­ µÇ¾î ÀÖÀ½, ÇÊ¿ä½Ã¿¡ ¿À¹ö¶óÀÌµùÇØ¼­ »ç¿ë
 *						 ¹è¿­ ´ÜÁ¡: °°Àº µ¥ÀÌÅÍÇü¸¸ ¸ð¾Æ¼­ ÀúÀå, °íÁ¤Àû 
 *								 ------------------ -----
 *									´Ù¸¥ µ¥ÀÌÅÍÇüÀ» ÀúÀåÇÒ ¼ö ÀÖÀ½(Object), °¡º¯Çü
 *						Collection
 *							|
 *					----------------------------
 *					|				|			|
 *				  List			 Set			Map
 *					List: ¼ø¼­ °¡Áü, µ¥ŸæÅÍ Áßº¹ Çã¿ë -> °Ë»ö, ¼øÂ÷ÀûÀ¸·Î ÀúÀå¼Óµµ°¡ °¡Àå ºü¸§, µ¥ÀÌÅÍ Á¢±ÙÇÏ´Â ¼Óµµ ºü¸§
 *							µ¥ÀÌÅÍº£ÀÌ½º¿¡¼­ ÁÖ·Î »ç¿ëµÇ´Â ÄÃ·º¼Ç
 *							=> ±¸ÇöµÈ Å¬·¡½º: ArrayList, Vector, LinkedList
 *										  -------- ÀÚ·á±¸Á¶(½±°Ô ¸Þ¸ð¸® Á¦¾î°¡ °¡´É => CURD)
 *											add(), remove(), set(), get(), clear(), size()
 *											Ãß°¡		»èÁ¦		¼öÁ¤		ÀÐ±â		ÀüÃ¼»èÁ¦	°³¼ö
 *					Set: ¼ø¼­ ¾øÀ½, µ¥ÀÌÅÍ Áßº¹ Çã¿ëÇÏÁö ¾ÊÀ½
 *						 ArrayList¿¡ ÀúÀåµÈ µ¥ÀÌÅÍÁß¿¡ Áßº¹µÈ µ¥ÀÌÅÍ Á¦°Å  ==> ¿À¶óÅ¬¿¡¼­ Á¦°Å: DISTINCT
 *						 HashSet / TreeSet
 *						 -------
 *						   add(), remove(), get(), clear(), size()
 *						  => À¥¿¡¼­ Åë½ÅÇÒ ¶§ (»ç¿ëÀÚ Á¤º¸ ÀúÀå)-> ºê¶ó¿ìÀú¿¡ Ã¤ÆÃ
 *							Application: Socket
 *							Web: WebSocket(Spring)
 *					Map: Å°¿Í °ªÀ» µ¿½Ã¿¡ ÀúÀå
 *						 Å°´Â Áßº¹ÇÒ ¼ö ¾øÀ½
 *						 °ªÀº Áßº¹ °¡´É 
 *						 => Å¬·¡½º °ü¸®(½ºÇÁ¸µ), SQL°ü¸®(¸¶ÀÌ¹ÙÆ¼½º), ÄíÅ°, ¼¼¼Ç, ¿äÃ»°ª, ÀÀ´ä°ª ==> Web¿¡¼­ ÁÖ·Î µîÀå
 *						 => HashMap / Hashtable 
 *							------	  ---------
 *							ºñµ¿±â			µ¿±â			====> AJAX
 *							put(): ÀúÀå
 *							get(): ÀÐ±â
 *							----------- µ¥ÀÌÅÍ°ª º¯°æ -> putÀÌ¿ë ==> put("°°Àº Å°","°ª") 
 *			4) java.lang.regexx
 *				Pattern / Matcher ==> Á¤±Ô½Ä
 *				Á¤±Ô½Ä ±âÈ£
 *				--------
 *				[] => ¹üÀ§ [A-Z], [a-z], [A-Za-z], [0-9], [°¡-ÆR]
 *						  [A-C] [A|D|V]
 *				{} => °³¼ö [A-Z]{3}, [A-Z]{1,3}
 *				+: 1ÀÌ»ó => ¸ÀÀÖ+
 *				*: 0ÀÌ»ó => ¸À¾ø*
 *				.: ÀÓÀÇÀÇ ±ÛÀÚ ÇÑ±ÛÀÚ [A-Z]. A1 AK A°¡
 *				$: ³¡³ª´Â ¹®ÀÚ [A-Z]$
 *				^: ½ÃÀÛ¹®ÀÚ ^[A-Z] /ºÎÁ¤¹®ÀÚ(¿¹¿Ü) [^A-Z]
 *				|: ¼±ÅÃ
 *				=====================================> ¹®ÀÚ¿­ÀÇ ÆÐÅÏÀ» ¸¸µé¾î °Ë»ö (¿À¶óÅ¬, ÀÚ¹Ù½ºÅ©¸³Æ®)
 *		= java.text
 *			1) SimpleDateFormat: ³¯Â¥¸¦ ¿øÇÏ´Â ÇüÅÂ·Î Ãâ·Â => °Ô½ÃÆÇ, ÀÔ·Â...
 *				=> TO_CHAR ¿À¶óÅ¬¿¡¼­ º¯°æÈÄ »ç¿ë
 *				=> String, Math, Date ..: ÇÊ¿ä½Ã¿¡´Â ¿À¶óÅ¬¿¡¼­ º¯°æÀÌ °¡´É 
 *			2) MessageFormat: SQL => Çü½ÄÀÖ´Â ¹®ÀÚ¿­À» ¸¸µé ¶§ »ç¿ë
 *				=> String name, sex, address, tel;
 *					int age; 
 *					WHERE name LIKE '%A%'
 *					WHERE REGEXP_LIKE(name,'A')
 *					WHERE SUBSTR(name,1,'A')
 *					WHERE INSTR(name,1,'A')>0
 *				=> Ãß°¡(¹®ÀÚ¿­À» ¿À¶óÅ¬·Î Àü¼Û)
 *					String sql="INSERT INTO table_name VALUES('"+name+"','"+sex+"','"+address
 *								+"','"+tel+"',"+age+")";
 *					String sql="INSRT INTO table_name VALUES('{0}','{1}','{2}','{3}',{4});
 *					==> ÃÖ±Ù¿¡ java.sql¿¡ µîÀå -> PreparedStatement => (?,?,?,?,?)
 *		= java.io	
 *			1) File: ÆÄÀÏ / µð·ºÅä¸® Á¤º¸ °¡Áü 
 *				File file=new File("°æ·Î¸í"); ==> µð·ºÅä¸® Á¤º¸
 *				File file=new File("°æ·Î¸í/ÆÄÀÏ¸í"); ==> ÆÄÀÏ Á¤º¸
 *				=> ÁÖ¿ä ¸Þ¼Òµå 
 *					= getName(): ÆÄÀÏ¸í, µð·ºÅä¸®¸í
 *					= getPath(): °æ·Î¸í ÀüÃ¼ ÀÐ±â
 *					= getParent(): °æ·Î¸í¸¸ ÀÐ±â
 *					= length(): ÆÄÀÏ Å©±â
 *					= listFiles(): ÀüÃ¼ ÆÄÀÏ¸íÀ» ÀÐ±â ==> ls -a, dir
 *					= createNewFile(): ÆÄÀÏ ¸¸µé±â
 *					= mkdir(): Æú´õ ¸¸µé±â ==> mkdir
 *					= delete(): ÆÄÀÏ »èÁ¦ ==> rm -rf
 *			2) FileInputStream / BufferedInputStream
 *					read(), close() ==> ÀÐ±â / ´Ý±â 
 *			3) FileOutputStream / BufferedOutputStream ==> ´Ù¿î·Îµå
 *					write(), close()
 *			--------------------------------------------------- ÀÐÀ» ¶§ 1byte => ¹ÙÀÌÆ® ½ºÆ®¸²
 *			4) FileReader / ***BufferedReader : readLine()
 *					read(), close()
 *			5) FileWriter / BufferedWriter
 *					write(String), close()
 *			------------------------------------------------ ÀÐÀ» ¶§ 2byte => ¹®ÀÚ ½ºÆ®¸²
 *															ÇÑ±ÛÀÌ Æ÷ÇÔµÈ °æ¿ì¿¡ ÁÖ·Î »ç¿ë(ÆÄÀÏ¿¡ ÀúÀåµÈ µ¥ÀÌÅÍ¸¦ Á¦¾îÇÒ ¶§ ¸¹ÀÌ »ç¿ë) 
 *		= java.net
 *			1) URL: À¥»çÀÌÆ® ÁÖ¼Ò¸¦ ¼³Á¤ÇÒ ¶§ »ç¿ë
 *			2) URLEncoder: ºê¶ó¿ìÀú(ASC), ÀÚ¹Ù(Unicode)
 *							--------	--------- 
 *							1byte		2byte
 *							=> ÀÚ¹Ù ========== ºê¶ó¿ìÀú·Î Àü¼Û
 *									byte ¹è¿­·Î º¯°æ => ÀÎÄÚµù 
 *							=> ºê¶ó¿ìÀú ======== ÀÚ¹Ù
 *									byte¹è¿­À» StringÀ¸·Î º¯È¯ => µðÄÚµù
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
			if(conn!=null) //¿¬°áµÇ¾ú´Ù¸é
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
