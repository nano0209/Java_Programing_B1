package day37_a_abstraction.exercise;
//runner class
public class Gym {

    public static void main(String[] args) {

        //Even if you have a constructor we still cannot
        //Exercise obj = new Exercise ("Hello");

        Running obj2 = new Running("Running");
        System.out.println(obj2.name);
        obj2.performExercise();
        System.out.println(obj2.getCaloriesBurned(10));


    }
}
