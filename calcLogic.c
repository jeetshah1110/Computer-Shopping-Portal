#include<stdio.h>

extern int countTotal(int [],int);
int countTotal(int arr[],int len)
{
	int i=0,sum=0;
	for(i=0;i<len;i++)
	{
		sum+=arr[i];
	}
	return sum;
}
