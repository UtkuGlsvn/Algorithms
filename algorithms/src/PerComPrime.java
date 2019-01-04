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
		static int Combination(int n,int r)
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
		public static void main(String[] args) {
			System.out.println("Fonksiyonu alýnacak sayý giriniz:");
			int number=input.nextInt();
			System.out.println(factorial(number));
			System.out.println("***************");
			System.out.println("Kombinasyon için eleman sayýsý  giriniz:");
			int n=input.nextInt();
			System.out.println("Kombinasyon için seçim sayýsý  giriniz:");
			int r=input.nextInt();
			if(r>n)
				 System.out.println("Lütfen eleman sayýsýndan küçük bir seçim sayýsý  giriniz.");
			else
				System.out.println(Combination(n,r));
			System.out.println("***************");
			System.out.println("Girdiðiniz sayýnýn asal olup olmadýðýný öðrenmek için sayý giriniz:");
			int r2=input.nextInt();
			System.out.println(primeNumber(r2));
	}

	}

