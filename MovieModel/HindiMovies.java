package com.jsp.MovieModel;

import java.util.Scanner;
import java.lang.Thread;

class HindiMovies 

{
	
	
	public HindiMovies()
	
	{
		System.out.println("");
		System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t                          **********   Hindi Movies List   **********");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 1. Shamshera                         6.  Lall Sing Chaddha              11. Cirkus");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 2. Bhool Bhulaiyaa                   7.  Takht                          12. Vikram Vedha");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 3. Major                             8.  Dhaakad                        13. Raama Setu");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 4. Samrat Prithvraj                  9.  Anek                           14. Yodha");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 5. Maidaan                          10.  Doctor G                       15. Bhediya");
		
		
	}

	public  void HinMovies() 
	
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
					System.out.println("\t\t\t\t\t\t\t\t                     ***  Shamshera (2022)  ***");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					m1("Tridha Choudry","Aditya Chopra","Karan Malhotra","Divyam Agrwal",6.4);
					mSize(450,800,1.8f);
					break;
			
				case 2:
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t\t\t                     ***  Bhool Bhulaiyaa (2022) ***");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					m1("aaaaaa","bbbbbb","cccccc","dddddd",7.9);
					mSize(450,750,1.7f);
					break;
			
				case 3:
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t\t\t                 ***  Major (2022) ***");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					m1("aaaaaa","bbbbbb","cccccc","dddddd",5.8);
					mSize(350,700,1.5f);
					break;
					
				case 4:
					
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t\t\t                     *****  Samrat Prithvraj (2022) *****");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					m1("aaaaaa","bbbbbb","dddddd","ssssss",7.8);
					mSize(350,700,1.5f);
					break;
					
				case 5:
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t\t\t                     ***  Maidaan (2022) ***");
					System.out.println("");
					System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
					System.out.println("");
					m1("mmmmmm","zzzzzz","Alia Neel","Gyllenhall",9.8);
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

