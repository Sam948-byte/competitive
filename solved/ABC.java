package solved;
import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();

        String order = in.next();

        int[] nums = new int[3];

        if(first < second && first < third) {
            nums[0] = first;
            if(second < third) {
                nums[1] = second;
                nums[2] = third;
            }else{
                nums[1] = third;
                nums[2] = second;
            }
    }else if(second < first && second < third) {
        nums[0] = second;
        if(first < third) {
            nums[1] = first;
            nums[2] = third;
        }else{
            nums[1] = third;
            nums[2] = first;
        }
}else if(third < first && third < second) {
    nums[0] = third;
    if(first < second) {
        nums[1] = first;
        nums[2] = second;
    }else{
        nums[1] = second;
        nums[2] = first;
    }
    }

    for(int i = 0; i < 3; i++) {
        if(order.charAt(i) == 'A') {
            System.out.print(nums[0] + " ");
        }else if(order.charAt(i) == 'B') {
            System.out.print(nums[1] + " ");
        }else if(order.charAt(i) == 'C') {
            System.out.print(nums[2] + " ");
        }
    }
}
}
