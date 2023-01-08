package com.greatlearning.dsa.services;

public class DenominationSorting 
{
	public void SortDesending(int[] arr, int i, int j) 
	{
	for( i=arr.length-1; i>=0; i--)
		{
			for(int k=0; k<j; k++)
			{
				if(arr[k] < arr[k+1]) //change only < or > to make asending/descending
				{
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}
			}
		}
	}

}
