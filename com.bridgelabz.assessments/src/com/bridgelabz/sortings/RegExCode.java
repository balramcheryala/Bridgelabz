package com.bridgelabz.sortings;

	import java.text.*;
	import java.util.Date;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	class RegExCode{

			public static void main(String args[])
			{
				String s1="Hello <<name>> We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.Please,let us know in case of any clarification.Thank you BridgeLabz. 01/01/2015";

					String p="<<name>>";
					String replaces="Balram";
					Pattern r=Pattern.compile(p);
					Matcher m=r.matcher(s1);
					s1=m.replaceAll(replaces);
					//System.out.println(s1);

					String p2="<<full name>>";
					String fname="Cheryala Balram";
					Pattern r1=Pattern.compile(p2);
					Matcher m1=r1.matcher(s1);
					s1=m1.replaceAll(fname);
					//System.out.println(s1);

					String p3="91-(x){10}";
					String Cno="91-9000806202";
					Pattern r2=Pattern.compile(p3);
					Matcher m2=r2.matcher(s1);
					s1=m2.replaceAll(Cno);


					//System.out.println(s1);

					Date dateobj = new Date();
					SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");
					Pattern r3=Pattern.compile("(\\d){2}/(\\d){2}/(\\d){4}");
					Matcher m3=r3.matcher(s1);
					s1=m3.replaceAll(df.format(dateobj));
					System.out.println(s1);

		}

}
