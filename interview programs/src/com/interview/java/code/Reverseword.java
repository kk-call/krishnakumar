package com.interview.java.code;

public class Reverseword {
	
	static int wordcount(String count) {
		int cnt=0;
		for(int index=0;index<count.length();index++) {
			if(count.charAt(index)==' ') {
				cnt++;
			}
		}
		
		return cnt+1;
		}
	
	public static void main(String[] args) {
		String str="     I    am a    developer    ";
		System.out.println("Given string before Reverse:" +str);
		str=str.replaceAll("( )++"," ").trim();
		int wcount=wordcount(str);
		String[] sarray=new String[wcount];
		str=str+" ";
		String temp="";
		
		for(int ind=0;ind<str.length();ind++) {
			if(str.charAt(ind)!=' ') {
				temp=temp+str.charAt(ind);
			}
			if(str.charAt(ind)==' ') {
				sarray[--wcount]=temp;
				temp="";
			}
		}
		String result="";
		for(String s:sarray) {
			result=result+" "+s;
		}
		System.out.println("After the reverse operation :" +result);
		
	}

}
