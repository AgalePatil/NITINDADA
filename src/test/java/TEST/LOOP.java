package TEST;

import java.util.Scanner;

public class LOOP {

	public static void main(String[] args) {
		String POnum="00001580";
		int i=Integer.parseInt(POnum);  
	 System.out.println(i);
	String item1="laptop";
	String item2="bag";
	String item3="Pen";
	String item4="Pencil";
	String item5="spec";
	
	
	
	
	
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter PO Number:");
         String interponum=sc.nextLine();
         System.out.println("Enter Item Code:");
	     String interItemCode=sc.nextLine();
	
	
	     boolean itm1=(interItemCode.equalsIgnoreCase("laptop")&&interponum.equalsIgnoreCase("1580"))||(interItemCode.equalsIgnoreCase("laptop")&&interponum.equalsIgnoreCase("1580"));
		
		while((itm1)) {
			i++;
			System.out.println(i);
			System.out.println("The PO number ==="+i);
		
			
		}
		
		
		

	}

}
