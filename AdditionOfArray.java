import java.util.Scanner;

class AdditionOfArray
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] arr = new int[3][3];
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
System.out.println("enter element for "+(i+1)+"row and"+(j+1)+"column");
arr[i][j] = sc.nextInt();
}

}
for (int i = 0; i < 3; i++) {
int sum = 0;
for (int j = 0; j < 3; j++) {
// System.out.print("value of aa");
System.out.print(arr[i][j]+" ");
sum = sum+arr[i][j];

}
System.out.print(sum);
System.out.println();
}
}
}