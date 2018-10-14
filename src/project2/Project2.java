
package project2;

import java.util.Random;

public class Project2 {

    public static void main(String[] args) {
        Random random = new Random();
        Sequence<Integer> integerSequence = new Sequence<>();
        for (int i = 0; i < integerSequence.size(); i++) {
            integerSequence.set(i, random.nextInt(500));
        }
        integerSequence.append(random.nextInt(500));
        for (int i = 0; i < integerSequence.size(); i++){
            System.out.print(integerSequence.get(i) + " ");
        }
    }
}
