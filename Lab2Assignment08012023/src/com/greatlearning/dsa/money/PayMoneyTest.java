package com.greatlearning.dsa.money;
import java.util.Scanner;

public class PayMoneyTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter the values of array");
		
		for (int i = 0; i < size; i++)
		arr[i] = sc.nextInt();
		System.out.println("Enter the total no of targets that needs to be achieved");
		int noOfTarget = sc.nextInt();
			
			while (noOfTarget-- != 0) 
			{
				int flag = 0;
				int target;
				System.out.println("Enter the value of target");
				target = sc.nextInt();
				int sum = 0;
					for (int i = 0; i < size; i++) 
					{
						sum += arr[i];
						if (sum >= target) 
						{
							System.out.println("Target achieved after "+(i + 1) + " transactions ");
							flag = 1;
							break;
						}
					}
							if (flag == 0) 
							{
								System.out.println(" Given target is not achieved ");
							}
			}
	}
}

