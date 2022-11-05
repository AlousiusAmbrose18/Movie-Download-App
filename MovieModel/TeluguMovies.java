package com.jsp.MovieModel;

import java.util.Scanner;
import java.lang.Thread;

class TeluguMovies 

{
	
	
	public TeluguMovies()
	
	{
		System.out.println("");
		System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t                          **********   Telugu Movies List   **********");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 1. RRR                               6.  Banagaraju                     11. Hero");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 2. Sarkaru Vaari Patta               7.  DJ Tillu                       12. Super Machi");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 3. Bheemla Nayak                     8.  Ante Sundaraniki               13. Rowdy Boys");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 4. Radhe Shayam                      9.  Major                          14. Induvadana");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 5. Acharya                          10.  F3                             15. Aasha Encounter");
		
		
	}

	public  void TelMovies() 
	
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
					System.out.println("\t\t\t\t\t\t\t\t                     ***   R R R (2022)  ***");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					m1("Jr N.T.R & Ram Charan","Danaya","Rajamouli","Keeravani",9.5);
					mSize(450,800,1.8f);
					break;
			
				case 2:
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t\t\t                     ***  Sarkaru Vaari Patta  (2022) ***");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					m1("Mahesh Babu","Naveen","Parasuram","Thaman",8.9);
					mSize(450,750,1.7f);
					break;
			
				case 3:
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t\t\t                 ***  Bheemla Nayak (2022) ***");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					m1("Pawan Kalyan","Vamsi","Chandra","Thaman",8.5);
					mSize(350,700,1.5f);
					break;
					
				case 4:
					
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t\t\t                     *****  Radhe Shayam  (2022) *****");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					m1("Prabhas","vamsi","Radha","Thaman",8.8);
					mSize(350,700,1.5f);
					break;
					
				case 5:
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t\t\t                     ***  Acharya  (2022) ***");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					m1("Chiranjeevi","Niranjan Reddy","Koratala Siva","Mahi Sharam",9.8);
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

