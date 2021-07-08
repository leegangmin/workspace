package com.gangminlee.util;

public class Util {
	// ë°©ë²•1
	public static int str2Int(String str) {
		// 120Aì�´ë ‡ê²Œ ë“¤ì–´ì˜¨ë‹¤ë©´ 120ì�„ ë¦¬í„´í•´ì¤�ë‹ˆë‹¤.
		int result = 0;
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				temp += str.charAt(i);
			}
		}
		result = Integer.parseInt(temp);
		return result;
	}

	// ë°©ë²•2
	public static int str2Int2(String str) {

		try {
			return Integer.parseInt(str);
		} catch (Exception e) {
			return 0;
		}

	}

}
/*
 * ìž…ì‹¤/í‡´ì‹¤ ì¹´ë“œ ê¼­ ì°�ì–´ì£¼ì„¸ìš”.
 * í‡´ì‹¤í•˜ì‹¤ë•Œ ì•ˆ ì°�ìœ¼ì‹œë©´
 * ì»´í“¨í„° ê³„ì†� ì¼œ ë‘¬ì•¼ í•©ë‹ˆë‹¤. ã… ã… 
 * ì˜¤ëŠ˜ ì¶œê·¼í•´ì„œ ì»´í“¨í„° ê»�ì–´ìš” ;;;;;
 * 
 * 
 */













