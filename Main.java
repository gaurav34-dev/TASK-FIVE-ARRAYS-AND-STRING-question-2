import java.util.Scanner;  
class Main{  
public static void main(String args[]){  
//int a[]={7,6,2,2,5,4,11,1};//declaration, instantiation and initialization  
//printing arr ]
  //reading the number of elements from the that we want to enter 
int n;  
Scanner sc=new Scanner(System.in); 
System.out.println("enter the length of array");
n=sc.nextInt();  
//creates an array in the memory of length 10  
int[] array = new int[10];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
//reading array elements from the user   
array[i]=sc.nextInt();  
}  
int temp;
  int i=0;
  int j;
  int sum=0;
  
      for(j=i+1;j<n;j++)
      {  if(array[i]<array[j])
      {
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;
      }
      }
      
    int largest=array[0];
    System.out.println("the biggest number is " + largest );
      
      
      for(j=i+1;j<n;j++)
      {  if(array[i]>array[j])
      {
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;
      }
      }
      
      //System.out.println("the smallest number is " + array[0]);
      int smallest=array[0];
      System.out.println("the smallest number is " + smallest );
      
      //int difference=largest-smallest;
  for(i=0;i<n;i++)
    {
      sum=sum +array[i];
    }
  int difference =sum-smallest-largest;
      System.out.println("sum of all the values of the array except the highest and lowest values is " + difference );
      
     
      
}
}