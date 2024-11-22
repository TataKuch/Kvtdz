public class Ktvdz2 {
    public static void main (String [] args){
        int a = 5;
        int b = 12;
        boolean checkOne = (a < b);
        boolean checkTwo = (a > b);
        boolean checkThree = (a == b);
        boolean checkFour= (a != b);
        boolean checkFive= (a <= b);
        boolean checkSix= (a >= b);
        System.out.println("Даны две переменные a = 5 и b =12");
        System.out.println("Мой результат сравнения переменых a и b");
        System.out.println(" a < b = " + checkOne);
        System.out.println(" a > b = " + checkTwo);
        System.out.println(" a == b = " + checkThree);
        System.out.println(" a != b = " + checkFour);
        System.out.println(" a <= b = " + checkFive);
        System.out.println(" a >= b = " + checkSix);
    }
}
