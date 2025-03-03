package intro;

import java.util.Scanner;

public class Basic {
    private static void helloWorld() {
        System.out.println("Server is up and running");
    }

    /**
     *  *
     *  * * 
     *  * * * 
     *  * * * *
     * @param args
     */
    void print(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


  public static void main(String[] args) {
    int num = 10; // 4 bytes, -2^31 to 2^31 - 1 of range 
    System.out.println(num+ " " + Integer.MAX_VALUE + " " + Integer.MIN_VALUE); // -2147483648 to 2147483647


    System.out.println(Integer.toString(num)); // wrapper Integer String etc.

    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    System.out.println(n);
    helloWorld();


    int[] nums = {1,2,3,4,5};

    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i] + " ");
    }

    System.out.println();
    int index = 0;
    while (index < nums.length) {
        System.out.print(nums[index++] + " ");
    }


    System.out.println();
    for (int i : nums) {
        System.out.print(i+ " ");
    }

    System.out.println();
    Basic basic = new Basic();
    basic.print(10);


    s.close();
  }
}