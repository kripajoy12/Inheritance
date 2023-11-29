package stringJava;

public class StringExample {
	
		public static void main(String[] args) 
		{
			//easy to understand lets take "s" for pool m/y and "st" for heap m/y
			String s1="Hello";//by String literal//stored in pool
			System.out.println(s1);
			
			String s2="hello";//by String literal//stored in pool
			System.out.println(s2);
			
			String st1=new String("Hello");//by using new keyword//stored in heap memory
			System.out.println(st1);
			
			String st2=new String("hello");//by using new keyword//stored in heap memory
			System.out.println(st2);
			
			String s3="Helloo";
			System.out.println(s3);
			
			String s4="Hello";//it will not store it will give reference for st2 to s1
			System.out.println(s4);
			
			String s5="Today";//it will stored in pool
			System.out.println(s5);
			
			//by using ==
			/*System.out.println(s1==st1);//false 'coz s1 in pool and st1 in heap memory
			System.out.println(s1==s3);//false 'coz s1="Hello" & s3="Helloo"
			System.out.println(s1==s2);//false 'coz s1="Hello" & s2="hello"
			System.out.println(s1==s4);//true 'coz s1="Hello" and s4="Hello"
			System.out.println(s1==s5);//false 'cos s1="Hello" whereas s5="Today"//not same*/
			
			//by using .equals//no issue for m/y but values should be same
			/*System.out.println(s1.equals(s2));//false 'coz s1="Hello" & s2="hello"
			System.out.println(s1.equals(st1));//true 'cos s1="Hello" & st1="Hello"
			System.out.println(s1.equals(st2));//false s1="Hello" & st2="hello"
			System.out.println(s1.equals(s3));//false s1="Hello" & s3="Helloo"
			System.out.println(s1.equals(s4));//true s1="Hello" & s4="Hello"
			System.out.println(s1.equals(s5));// false s1="Hello" & whereas s5="Today"//not same*/
			
			//by using .equalsIgnoreCase //no issue for m/y and case(uppercase/lowercase)
			/*System.out.println(s1.equalsIgnoreCase(s2));//true s1="Hello" & s2="hello"
			System.out.println(s1.equalsIgnoreCase(st1));//true s1="Hello" & st1="Hello"
			System.out.println(s1.equalsIgnoreCase(st2));//true s1="Hello" & st2="hello"
			System.out.println(s1.equalsIgnoreCase(s3));//false s1="Hello" & s3="Helloo"
			System.out.println(s1.equalsIgnoreCase(s4));//true s1="Hello" & s4="Hello"
			System.out.println(st1.equalsIgnoreCase(st2));//true st1="Hello" & st2="hello"*/
			
			//concat
			//s1.concat("Hi");
			//System.out.println(s1);//can't print like this- not the correct way
			/*s1=s1.concat(" Hi");//correct way
			System.out.println(s1);
			s1=s1.concat(" "+s4);
			System.out.println(s1);*/
			
			//length
			/*int length=s1.length();//Length is 5
			System.out.println("Length is "+length);*/
			
			//isEmpty
			/*String s66="";//true
			String s6=" ";//false
			System.out.println(s66.isEmpty());
			System.out.println(s6.isEmpty());
			
			//isBlank
			System.out.println(s66.isBlank());//true
			System.out.println(s6.isBlank());//true
			System.out.println(s5.isBlank());//false s5="Today"*/
			
			//substring
			//String s7="SachinTendulkar".substring(1, 7);//Hello Hi Today
			
			/*String s7="SachinTendulkar";//SachinTendulkar->index start from 01234567891011121314
			System.out.println(s7.substring(0, 6));//Sachin//from 0 and before 6 it will print
			System.out.println(s7.substring(7));//endulkar//from 7 onwards it will print*/
			
			//split 
			String s8="Good-Morning-All";
			String[] split=s8.split("-");
			for(String s:split)//for each loop
			System.out.println(s);
		}

	}

}
