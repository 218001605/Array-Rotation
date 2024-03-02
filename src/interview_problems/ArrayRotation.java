package interview_problems;
/*Author : 218001605
 * msstudymail@gmail.com
 * 
 * 
 * 
 * */
import java.util.*;
public class ArrayRotation {
	private static int [] arr = new int[10]; //creating an array;
	public ArrayRotation() {
		// TODO Auto-generated constructor stub
	}
	public static void clockwise() {
		int f=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[arr.length-1]==arr[i]) {
				arr[arr.length-1]=f;
			}else {
				arr[i]=arr[i+1];
			}
		}
	}
	public static void Anticlockwise() {
		int f=arr[arr.length-1];// copy the value of last element since is about to be overwritten.
		for(int i=arr.length-1;i>=0;i--) {// since we overwritte from last index, then becareful to overwrite till index zero; 
			if(i==0){
				arr[i]=f; // since we rotate anticlowise fist shell is occupied by the value of the last shell.
			}
			else{ 
				arr[i]=arr[i-1]; //at this index the value is overwritten by the value of previous index likewise
			}
		}
	}
	public static void display() {
		System.out.println("");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Array ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+(i+1)+"]=");arr[i]=scan.nextInt(); 
		}
		int n;
		do {
			System.out.println("**********Choose menu**********");
			System.out.println("1- Rotatate Array Clocwise.");
			System.out.println("2- Rotatate Array AntiClocwise.");
			n=scan.nextInt();
			display();
			if(n==1) {
				clockwise();
				display();System.out.print("Rotated clockwise");
			}if(n==2) {
				Anticlockwise();
				display();System.out.print("Rotated Anticlockwise");
			}
		}while(n!=1 && n!=2);
	}
}
