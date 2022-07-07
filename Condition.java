import java.util.Scanner;
public class Condition{

public static void main(String args[])
{
    int marks ;
    System.out.println("Entet get marks in exam:-");
    Scanner r = new Scanner(System.in);
    marks = r.nextInt();
    if(marks<25)
    {
        System.out.print("The student is fail");
    }
    else if(marks >=25 && marks <=50)
    {
        System.out.print("The student is 3rd div");
    }
    else if(marks >=50 && marks <= 70)
    {
        System.out.print("The student is 2nd div");
    }
    else
    {
        System.out.print("The student is 1st div");
    }#include <stdio.h>
//Calculate array size
#define ARRAY_SIZE(a) sizeof(a)/sizeof(a[0])
// Naive method to count pair in an array with a given sum
int findPair(int arr[], int n, int sum)
{
int i, j;
int countPair = 0;
// Consider all possible pairs and check their sums
for (i = 0; i < n; i++)
{
// start from the i+1 element till the last element
for (j = i + 1; j < n; j++)
{
// if the desired sum is found increment counter
if (arr[i] + arr[j] == sum)
{
printf("(%d,%d)\n",arr[i],arr[j]);
countPair++;
}
}
}
return countPair;
}
int main()
{
int arr[] = {1, 5, 7, -1, 5,2,1,4};
int sum = 111;
//find array size
const int N = ARRAY_SIZE(arr);
//get pairs in array
const int pairCount = findPair(arr,N,sum);
if(pairCount != 0)
{
printf("Count of pairs is %d",pairCount);
}
else
{
printf("Pair Not found");
}
return 0;
}

}
}