package day16_tasks;

public class OddNumbers {
    public static void main(String[] args) {
        int num = 2;
        while (num <= 100){
            if (num  % 2 == 1){
                System.out.println(num);

            }
            num++;
        }
    }
}
