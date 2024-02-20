import java.util.Scanner;

class Ans {
    private int length;
    private int width;
    
    public Ans(int x, int y) {
        length = x;
        width = y;
    }

    public int getAns() {
        return length * width;
    }

    public int getperimeter(){
        return 2*(length+width);
    }
}

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length:");
        int length = input.nextInt();

        System.out.println("Enter width:");
        int width = input.nextInt();

        Ans obj = new Ans(length, width);
        System.out.println("Area is " + obj.getAns());
        System.out.println("perimeter is :"+obj.getperimeter());

        
    }
}
