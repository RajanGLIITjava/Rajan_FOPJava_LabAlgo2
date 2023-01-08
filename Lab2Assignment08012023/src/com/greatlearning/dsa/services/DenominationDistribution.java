package com.greatlearning.dsa.services;

public class DenominationDistribution
{
	public void denomination (int[] arr,int amountToPay)
	{
	
		int dcounter[] = new int[arr.length];
				for(int i=0;i<arr.length;i++)
				{
					if(amountToPay>=arr[i])	
					{
						dcounter[i]=amountToPay/arr[i];
						amountToPay= amountToPay-dcounter[i] * arr[i];
					}
				}
				if(amountToPay>0)
				{
					System.out.println("We dont have Correct Denomination equvalent to, Thank You");
				}
				else
				{
					for(int i=0;i<arr.length;i++)
					{
						if(dcounter[i] !=0)
						{
							System.out.println(" Currency Demonimation for " + arr[i] +":" + dcounter[i]);
						}
					}
					System.out.println("Thank You");
				}	
	}

}
