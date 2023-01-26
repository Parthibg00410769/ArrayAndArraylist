package ie.atu;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer>myList = new ArrayList<>();

        myList.add(100);
        myList.add(200);
        myList.add(300);
        myList.add(400);
        myList.add(500);
        myList.add(600);
        myList.add(700);
        myList.add(800);
        myList.add(900);
        myList.add(1000);
        loop(myList);

        Scanner myScan = new Scanner(System.in);

        try {
            System.out.println("Please enter the name: ");
            myList.add(myScan.nextInt());
            loop(myList);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Run out of the length"+ e);
        }
    }

    public static void loop(ArrayList<Integer>someArrayList) {
        int indexValue = 0;
        for(int value: someArrayList){
            System.out.println("ELement at index " + indexValue + " : " + value);
        }

    }

}
