package com.greatlearning.dsa.services;
import java.util.Scanner;
import com.greatlearning.dsa.services.DenominationDistribution;
import com.greatlearning.dsa.services.DenominationSorting;

public class DriverTravellerCurrencyExchange 
{
	public static void main(String[] args) 
	{
		DenominationSorting ds= new DenominationSorting();
		DenominationDistribution dd= new DenominationDistribution();
		
				Scanner s = new Scanner(System.in);	
				System.out.println("enter the size of  currency denominations");
				int size = s.nextInt();
				int arr[] = new int[size];
				
				System.out.println("enter the  currency denominations Value");
					for (int i = 0; i < size; i++)
					{
						arr[i] = s.nextInt();
					}
					System.out.println("enter the amount you want to pay");
					int amountToPay = s.nextInt();	
					ds.SortDesending(arr,0,arr.length-1);
					dd.denomination(arr, amountToPay);
	}

}
