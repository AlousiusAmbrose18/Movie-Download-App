package com.jsp.MovieModel;

import java.util.Scanner;
import java.lang.Thread;

class KannadaMovies 

{
	
	
	public KannadaMovies()
	
	{
		System.out.println("");
		System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t                          **********   Kannada Movies List   **********");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 1. K.G.F -2                          6.  Kirik Party                    11. Ugramm");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 2. 777 Charlie                       7.  PailWaan                       12. Googly");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 3. James                             8.  Power Star                     13. GentleMan");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 4. Vikrant Rona                      9.  Bell Bottom                    14. Wheel Chair Romeo");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 5. Hostel                           10.  Police Story                   15. Tagaru");
		
		
	}

	public  void KanMovies() 
	
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
					System.out.println("\t\t\t\t\t\t\t\t                     ***  K.G.F - 2 (2022)  ***");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					m1("Yash","Vijay Kiragandur","Prashanth Neel","Ravi Basrur",9.8);
					mSize(450,800,1.8f);
					break;
			
				case 2:
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t\t\t                     ***  777 Charlie (2022) ***");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					m1("Rakshit Shetty","RajKumar","kiranraj","Nobin Paul",9.3);
					mSize(450,750,1.7f);
					break;
			
				case 3:
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t\t\t                 ***   James (2022) ***");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					m1("Puneeth Rajkumar","Kishore","Chethan Kumar","Paul",7.8);
					mSize(350,700,1.5f);
					break;
					
				case 4:
					
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t\t\t                     *****  Vikrant Rona (2022) *****");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					m1("Sudeep","kicha ","Anup Bhandari","awlnbh",7.8);
					mSize(350,700,1.5f);
					break;
					
				case 5:
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t\t\t                     ***  Hostel (2022) ***");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					m1("Aishwarya","Tident","Sumanth","Gyllenhall",9.8);
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

