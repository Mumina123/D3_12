public class Main {

    public static void main(String[] args) {

        String helloWord;
        final int NUM = 10;
        String word = " MUMINA";

        helloWord = NUM + word;

        System.out.println(helloWord + NUM + word);

        if (NUM < 0){
            System.out.println(" вы сохранили отрицательное число");
        }

        else if (NUM > 0){
            System.out.println("вы сохранили полажительное число");
        }

        else {
            System.out.println(" вы сохранили нуль");
        }
    }
}