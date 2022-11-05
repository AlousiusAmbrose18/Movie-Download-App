package com.jsp.MovieModel;

import java.util.Scanner;

public class SADVC 
{
	
	public SADVC() 
	
	{
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t\t\tXXXXXXXXXX\tWarning : It is not Legal Website... Your Data may Visible to the Website Owner    \tXXXXXXXXXX");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t                     <<< SADVC MOVIES >>>");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t----------------------------------------------------------------------------------------------------------\t");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 1. ENGLISH Movies                     2. HINDI Movies                       3. KANNADA Movies");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t 4. ODISA   Movies                     5. TAMIL Movies                       6. TELUGU  Movies");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.print("\t\t\t\t\t\t Select Movie Language :  ");
	}
	
	public void MovieLang(int SelLang)
	
	{
		switch (SelLang) 
		
		{
			case 1:
					EnglishMovies em = new EnglishMovies();
					em.EngMovies();
					break;
				
			case 2:
					HindiMovies hm = new HindiMovies();
					hm.HinMovies();
					break;
			case 3:
					KannadaMovies km = new KannadaMovies();
					km.KanMovies();
					break;
			case 4:
					OdisaMovies om = new OdisaMovies();
					om.OdiaMovies();
					break;
			case 5:
					TamilMovies tam = new TamilMovies();
					tam.TamMovie();
					break;
			case 6:
					TeluguMovies tem = new TeluguMovies();
					tem.TelMovies();
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
	
	public static void Play()
	{
		while(true)
		{
		Scanner sc =new Scanner(System.in);
		System.out.println("");
		System.out.println("");
		System.out.print("\t\t\t\t\t\t\t                                Enter P to Play Video >>> ");
		char p = sc.next().charAt(0);
	
		if(p=='p'|| p=='P')
		{
			{
				new BgImage();
			}
			System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t                ## NOTE: Your Video will Open in Video Player Seperatly ## ");
			break;
		}
		
		else
			{
			System.out.println("");
			System.out.println("");
			System.err.println("\t\t\t\t\t\t\t                                ## Invalid Input ## ");
			System.out.println("");
			System.out.println("");
			}
		}
	}

	public static void main(String[] args)
	{
	    Scanner sc =new Scanner(System.in);
		
		while(true) {
			
		SADVC a1 = new SADVC();
		
		int selLang = sc.nextInt();
	
		a1.MovieLang(selLang);
		Play();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.print("\t\t\t\t\t\t\t                Enter Y to Continue Or Enter N to Exit : ");
		char c = sc.next().charAt(0);
		if(c=='N'|| c=='n')
		{
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
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.print("\t\t\t\t\t\t\t                       ********** Thank You ... **********");
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
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			break;
		}
			
			
		else 
			{
			System.out.println("");
			System.out.println("");
			System.out.println("");
			continue;
			}
		}
	
		
		
	}

}
