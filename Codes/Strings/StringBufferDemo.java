package Strings;


public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer str= new StringBuffer("abc");

		str.setCharAt(0, 'd');

		str.append("efg");
		System.out.println(str);

		//AND Also
		StringBuffer str1=new StringBuffer("");
		for(int i=0;i<5;i++)
		{
			str1.append((char)('a'+i));
		}
		System.out.println(str1);
	}
}