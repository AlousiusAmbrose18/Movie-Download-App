package com.jsp.MovieModel;

import java.util.Scanner;
import java.lang.Thread;

class TamilMovies 

{
	
	
	public TamilMovies()
	
	{
		System.out.println("");
		System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t                          **********   Tamil Movies List   **********");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 1. Vikram                            6. Mahhan                          11. FIR");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 2. Beast                             7. Taanakkaran                     12. Viruman");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 3. Veetla Vishesham                  8. Kadaisi Vivasayi                13. Mudal Nee");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 4. Don                               9. Mudivum Nee                     14. Saani Kaaidham");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 5. K.G.F - 2                        10. Nenjuku Needhi                  15. Border");
		System.out.println("");
	}

	public  void TamMovie() 
	
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.print("\t\t\t\t\t\t >>> Select one Movie : ");
			
			int sel = sc.nextInt();
		
		
			
			switch(sel)
		
			{
		
				case 1:
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t\t\t                     ***  Vikram (2022)  ***");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					m1("Kamal Haasan","R.Mahendran","Lokesh Kanagaraj","Anirudh",9.5);
					mSize(350,700,1.5f);
					break;
			
				case 2:
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t\t\t                     ***  Beast (2022) ***");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					m1("Vijay","Kalanithi Maran","Nelson","Anirudh",6.8);
					mSize(350,700,1.5f);
					break;
			
				case 3:
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t\t\t                 ***  Veetla Vishesham (2022) ***");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					m1("R.J Balaji","Zee Studios","N.J Saravanan","Girish",8.8);
					mSize(350,700,1.5f);
					break;
					
				case 4:
					
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t\t\t                     *****  Don (2022) *****");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					m1("Sivakarthikeyan","Subaskaran","Cibi Chakravathy","Anirudh",7.8);
					mSize(350,700,1.5f);
					break;
					
				case 5:
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t\t\t                     ***  K.G.F - 2 (2022) ***");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					m1("Yash","Vijay Kiragandur","Prashanth Neel","Ravi Basrur",9.8);
					mSize(350,700,1.5f);
					break;
					
					default:
						System.out.println("");
						System.out.println("");
						System.err.println("\t\t\t\t\t\t                  XXXXXXXXXX Invalid Input XXXXXXXXX");
						System.out.println("");
						System.out.println("");
						System.out.println("");
		
			}
	
		
	}
	public   void m1(String a, String b, String c, String d,double e)
	
	{
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t\t\t Actor      :       "+a);
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t\t\t Producer   :       "+b);
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t\t\t Director   :       "+c);
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t\t\t Music      :       "+d);
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t\t\t Rating     :       "+e+" /10");
		System.out.println("");
		System.out.println("");
		
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("");
			System.out.print("\t\t\t\t\t\t Enter 1 to Download Movie : ");
			int n = sc.nextInt();
			
			if(n==1)break;
			else
				System.out.println("");
				System.err.println("\t\t\t\t\t\t                               Invalid..Please Enter 1 to Download");	
				System.out.println("");
		}
		
	}
	
	
 public void mSize(int a, int b, float c)
 
 {
	 	System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
	 	System.out.println("");
	 	System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t\t 1. Low Quality    :    (480 x 320) --> "+a+" MB");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t\t 2. Medium Quality :    (640 x 360) --> "+b+" MB");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t\t 3. High Quality   :    (720 x 640) --> "+c+" GB");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
		System.out.println("");
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.print("\t\t\t\t\t\t  Select Movie Quality : ");
		int n = sc.nextInt();
		System.out.println("");
	 	System.out.println("");
	 	System.out.println("");
		
		if(n==1|| n==2 || n==3)
		{
			System.out.println("\t\t\t\t\t\t\t\t                        [   Please Wait   ]");
		 	System.out.println("");
		 	System.out.println("");
			System.out.print("\t\t\t\t\t\t\t\t                         Movie Downloading ");
			for (int x=0; x<=10; x++)
			{
				try 
				{
					Thread.sleep(500*x);
					
				} 
				
				catch (InterruptedException e) 
				
				{
					Thread.currentThread().interrupt();
				}
				
				System.err.print(">");
			}
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t                        **********  Movie Downloaded SuccessFully   *******");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		
	 
 }


}
