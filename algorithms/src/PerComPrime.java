// STOPSHIP: 4.01.2019
//utkuglsvn
import java.util.Scanner;

public class PerComPrime {

		private static Scanner input = new Scanner(System.in);

		static int factorial(int n)
		{
			 if(n<=1)
		        return 1;
		     else
		        return n*factorial(n-1);
		}
		static int permutation(int n,int r)
		{
			 if(n<=1)
		        return 1;
		     else
		        return (factorial(n))/(factorial(n-r));
		}
		static int combination(int n,int r)
		{
			 if(n<=1)
		        return 1;
		     else
		        return (factorial(n))/(factorial(n-r)*factorial(r));
		}
		static Boolean primeNumber(int n)
		{
			if (n <= 2) 
			return (n==2)? true:false;
			else
			{
			for(int i=2;i<n;i++)
			if(n%i==0)return false;
			return true;
		}
		}
		
		static void menuSelection()
		{
			System.out.println("İşlem Menüsü");
			System.out.println("Faktoriyel işlemi yapmak için -> 1:");
			System.out.println("Permütasyon işlemi yapmak için -> 2:");
			System.out.println("Kombinasyon işlemi yapmak için -> 3:");
			System.out.println("Girdiğiniz sayının asal olup olmadığını kotrol etmek için -> 4:");
			System.out.println("Çıkış için herhangi bir tuşa basınız!");
			int secim = input.nextInt();
			switch(secim)
			{
			case 1:
				System.out.println("Sayı girmek için -> 1:");
				System.out.println("Ana menüye dönmek için herhangi bir tuşa basınız!");
				secim = input.nextInt();
				switch(secim)
				{
				case 1:
					System.out.println("Faktöriyel hesaplanacak sayıyı giriniz:");
					int number=input.nextInt();
					System.out.println("Sonuc"+factorial(number));
					menuSelection();
					break;
				default: menuSelection(); break;
				}
				break;
				//********************
			case 2:
				System.out.println("Sayı girmek için -> 1:");
				System.out.println("Ana menüye dönmek için herhangi bir tuşa basınız!");
				secim = input.nextInt();
				switch(secim)
				{
				case 1:
					System.out.println("Permütasyon için eleman sayısı  giriniz:");
					int n=input.nextInt();
					System.out.println("Permütasyon için seçim sayısı  giriniz:");
					int r=input.nextInt();
					if(r>n)
						 System.out.println("Lütfen eleman sayısından küçük bir seçim sayısı  giriniz.");
					else
						System.out.println("Sonuc"+permutation(n,r));
					
					menuSelection();
					break;
				default: menuSelection(); break;
				}
				break;
				//*******************************
			case 3:
				System.out.println("Sayı girmek için -> 1:");
				System.out.println("Ana menüye dönmek için herhangi bir tuşa basınız!");
				secim = input.nextInt();
				switch(secim)
				{
				case 1:
					System.out.println("Kombinasyon için eleman sayısı  giriniz:");
					int n=input.nextInt();
					System.out.println("Kombinasyon için seçim sayısı  giriniz:");
					int r=input.nextInt();
					if(r>n)
						 System.out.println("Lütfen eleman sayısından küçük bir seçim sayısı  giriniz.");
					else
						System.out.println("Sonuc"+combination(n,r));

					menuSelection();
					break;
				default: menuSelection(); break;
				}
				break;
				//*******************************
			case 4:
				System.out.println("Sayı girmek için -> 1:");
				System.out.println("Ana menüye dönmek için herhangi bir tuşa basınız!");
				secim = input.nextInt();
				switch(secim)
				{
				case 1:
					Boolean a=false;
					System.out.println("Girdiğiniz sayının asal olup olmadığını öğrenmek için sayı giriniz:");
					int r2=input.nextInt();
					a=primeNumber(r2);
					if(a==true) System.out.println("Girdiğiniz sayı asaldır!");
					else System.out.println("Girdiğiniz sayı asal değildir!");
					 menuSelection();
					break;
				default: menuSelection(); break;
				}
				break;
				//*******************************
				default:System.out.println("çıkış");System.exit(0);
			}
		}
		
		
		public static void main(String[] args) {	
			menuSelection();
		}

	}

