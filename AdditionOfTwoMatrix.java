import java.util.Scanner;
class AdditionOfTwoMatrix
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] arr = new int[2][2];
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
System.out.println("enter element for "+(i+1)+"row and"+(j+1)+"column");
arr[i][j] = sc.nextInt();
}