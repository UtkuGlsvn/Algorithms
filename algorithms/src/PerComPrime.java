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
			System.out.println("Fonksiyonu al�nacak say� giriniz:");
			int number=input.nextInt();
			System.out.println(factorial(number));
			System.out.println("***************");
			System.out.println("Kombinasyon i�in eleman say�s�  giriniz:");
			int n=input.nextInt();
			System.out.println("Kombinasyon i�in se�im say�s�  giriniz:");
			int r=input.nextInt();
			if(r>n)
				 System.out.println("L�tfen eleman say�s�ndan k���k bir se�im say�s�  giriniz.");
			else
				System.out.println(Combination(n,r));
			System.out.println("***************");
			System.out.println("Girdi�iniz say�n�n asal olup olmad���n� ��renmek i�in say� giriniz:");
			int r2=input.nextInt();
			System.out.println(primeNumber(r2));
	}

	}

