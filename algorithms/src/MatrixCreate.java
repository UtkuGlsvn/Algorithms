import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class MatrixCreate {
	static Random rand = new Random();
	static Scanner input = new Scanner(System.in);

	static void matrixCreate(int m[][],int n,int k)
	{

		m=new int[n][k];
		ArrayList<Integer> asd = new ArrayList<>();
		for(int i=0;i<n;i++)
			for(int j=0;j<k;j++)
			{
				m[i][j]=rand.nextInt(50) + 1;
				asd.add(m[i][j]);
			}
		matrixScreenWrite(m,k);


	}
	static void matrixScreenWrite(int m[][],int k)
	{
		System.out.println("Matrix");
		for (int i=0; i<m.length;i++)
		{
			for(int j=0;j<k;j++)
				System.out.print((i+1)+".sat�r"+(j+1)+".s�tun :"+(m[i][j])+"\t");
			System.out.println();
		}
		System.out.println("***********************************************");
	}

	
	static void matrixInput(int l)
	{
		int [][]m=null;
		for(int i=0;i<l;i++)
		{
		System.out.println("Matrisin sat�r say�s�n� giriniz:");
		int n = input.nextInt();
		System.out.println("Matrisin s�tun say�s�n� giriniz:");
		int j = input.nextInt();
		matrixCreate(m,n,j);
		}
	}
	public static void main(String[] args) {
	System.out.println("Ka� matrix girmek istiyorsunuz");
	//input integer control
	 if (input.hasNextInt()){
			int n = input.nextInt();
			matrixInput(n);
    }
    else {
        System.out.println("Tam say� giriniz!.");
    }
	
	}
}
