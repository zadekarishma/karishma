package stringmethod;

public class methods {

	public static void main(String[] args)
	{
		String s="ABCDEFG";
		String s1="abcdefg";
		//length
		System.out.println(s1.length());
		//equal
		System.out.println(s.equals(s1));
		//equalsIgnoreCase
		System.out.println(s.equalsIgnoreCase(s1));
		//charAt method
		System.out.println(s1.charAt(4));//perticuler indx have to return
		//toUpperCase method
		System.out.println(s1.toUpperCase());
		//toLowerCase method
		System.out.println(s1.toLowerCase());
		//concat
		System.out.println(s.concat(s1));
		String str=" kajal my name is karishma ";
		//trim
		System.out.println(str.trim());
		//contain method
		System.out.println(str.contains("karishma"));//output in true false format
		String str1="hey lovely person ";
		//startWith method
		System.out.println(str1.startsWith("hey"));//true false format
		String j="ram ji ki jay";
		//endWith
		System.out.println(j.endsWith("jay"));//true false
		//isEmpty
		
		System.out.println(j.isEmpty());//true false
		//indexOf
		System.out.println(j.indexOf(" "));
		//lastIndexOf
		System.out.println(j.lastIndexOf("y"));
		//toCharArray
		String a=" ram ki nikali sawari";
		char[]ar=a.toCharArray();
		for(char k:ar)
		System.out.println(k+" ");
		//split method
		String d= "jivan,pani,agni,vara";
		String[]f=d.split("a");
		for(String l:f)
		{
			System.out.println(l+" ");
		}
		//substring
		System.out.println(d.substring(6,9));
		String n="nama shivay";
		//replace
		System.out.println(n.replace("a", "i"));
		//replaceFirst
		System.out.println(n.replaceFirst("nama", "mam"));
		//replaceAll
		System.out.println(n.replaceAll("[^nama]", ""));
	}

}
