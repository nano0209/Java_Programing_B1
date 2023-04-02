package day20_nested_loop;

public class BreakNested {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            System.out.println("i:" +i);

            if(i==3){
                break;

            }
            for (int j = 0; j < 2; j++) {
                System.out.println("j:" +j);
                break;

            }

        }
    }
}
