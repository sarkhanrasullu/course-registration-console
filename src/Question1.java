import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

    }
//    --------------  Question 1  ------------------------------------------
    public static void question1() {
        System.out.println("Enter the number");
        int a = new Scanner(System.in).nextInt();
        for(int i=0;i<a;i++) {
            if(i%2==0) {
                System.out.print(i+" ");
            }
        }
    }
//   --------------  Question 2.1  ------------------------------------------
    public static void question2() {
        System.out.println("Enter a number to find out if it's prime or composite");
        int number = new Scanner(System.in).nextInt();
        int count =0;
        for(int i=1;i<number;i++) {
            if(number%i==0) {
                count++;
            }
        }
        if(count>1) {
            System.out.println(number+" is composite number");
        } else{
            System.out.println(number+ " is prime number");
        }
    }
//    --------------  Question 2.2  ------------------------------------------
    public static void q2() {
        System.out.println("Enter a number");
        int number = new Scanner(System.in).nextInt();
        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count < 3) {
                System.out.println(i);
            }
        }
    }

//    --------------  Question 6.1  ------------------------------------------
    public static void question6() {
        int a=5;
        int result = 1;
        for(int i=a;i>=1;i--) {
            result=i*result;
        }
        System.out.println(result);
    }

//    --------------  Question 6.2  ------------------------------------------
    public static void q6() {
        int a=5;
        int result = foo(a);

        System.out.println(result);
    }
    public static int foo(int a) {
        if(a==1)
            return a;
        return a*foo(--a);
    }

//    --------------  Question 12  ------------------------------------------
    public static void question12() {
        System.out.println("Enter a number");
        int number = new Scanner(System.in).nextInt();
        int isNumber = determine(number);
        System.out.println(isNumber);
    }

    public static int determine(int number) {
        if(number>0) {
            return +1;
        } else if(number<0) {
            return -1;
        } else return 0;
    }

//    --------------  Question 13  ------------------------------------------
    public static void question13() {
        int[] array = new int[4];
        for(int i=0; i< array.length;i++) {
            System.out.println("Enter a number");
            array[i] = new Scanner(System.in).nextInt();
        }
        boolean isTwoEqual = comparing(array);
        System.out.println(isTwoEqual);
    }
    public static boolean comparing(int[] array) {
        boolean isEqual =false;
        for(int i=array.length-1;i>0;i--) { //2 1 2 5
            for(int j=0;j<4;j++) {
                if (array[j] == array[i]) {
                    isEqual = true;
                    return true;
                } else {
                    break;
                }
            }
        }
        if(isEqual==true)
            return true;
        return false;
    }

//    --------------  Question 14  ------------------------------------------
    /*public static void question14() {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        int d = new Scanner(System.in).nextInt();
        boolean isCorrect = compare(a,b,c,d);
        System.out.println(isCorrect);
    }
    public static boolean compare(int a, int b, int c, int d) {
        if(a<b && b<c && c<d) {
            return true;
        } return false;
    }*/

    public static void question14() {
        int count = new Scanner(System.in).nextInt();
        int[] array = new int[count];
        boolean isCorrect = compare(array);
        System.out.println(isCorrect);
    }
    public static boolean compare(int[] array) {
        for(int i=0; i< array.length;i++) {
            System.out.println("Enter a number");
            array[i] = new Scanner(System.in).nextInt();
        }
        boolean isBigger = false;
        for (int i=0; i< array.length;i++) { //2 1 3
            if(i+1< array.length) {
                if(array[i]<array[i+1]){
                    isBigger=true;
                } else {
                    isBigger= false;
                    return false;
                }
            }

        } if(isBigger=true)
            return true;
        return isBigger;
    }

//    --------------  Question 16  ------------------------------------------
    public static void question16() {
        String a = new Scanner(System.in).nextLine();
        String b = new Scanner(System.in).nextLine();
        boolean isEqual = check(a,b);
        System.out.println(isEqual);
    }
    public static boolean check(String a, String b) {
        if(a.equalsIgnoreCase(b)) {
            return true;
        } return false;
    }

//    --------------  Question 17  ------------------------------------------
    public static void question17() {
        String word = new Scanner(System.in).nextLine();
        int count = new Scanner(System.in).nextInt();
        char c = new Scanner(System.in).nextLine().charAt(0);
        String newWord = merging(word, count, c);
        System.out.println(newWord);
    }
    public static String merging(String word, int count, char c) {
        for(int i=0;i<count;i++) {
            word =word+c;
        }
        return word;
    }

//    --------------  Question 18  ------------------------------------------
    public static void question18() {
        String a = new Scanner(System.in).nextLine();
        String b = new Scanner(System.in).nextLine();
        String c = new Scanner(System.in).nextLine();
        boolean isCPresented = presenting(a,b,c);
        System.out.println(isCPresented);
    }
    public static boolean presenting(String a, String b, String c) {
        if(a.contains(c) && b.contains(c)) {
            return true;
        } else return false;
    }

//    --------------  Question 19  ------------------------------------------
    public static void question19() {
        String a = new Scanner(System.in).nextLine();
        int begin = new Scanner(System.in).nextInt();
        int end = new Scanner(System.in).nextInt();
        String word = printing(a,begin, end);
        System.out.println(word);
    }
    public static String printing(String a, int begin, int end) {
        if(end>a.length()) {
            end=a.length();
        }
        String newWord = a.substring(begin, end);
        return newWord;
    }

//    --------------  Question 20  ------------------------------------------
    public static void question20() {
        String s1 = new Scanner(System.in).nextLine();
        String s2=new Scanner(System.in).nextLine();
        String printS=returningS(s1, s2);
        System.out.println(printS);
    }
    public static String returningS(String s1, String s2) {
        if(s1.length()>s2.length()) {
            return s1;
        } else {
            return s2;
        }
    }

//    --------------  Question 21  ------------------------------------------
    public static void question21() {
        String s = "HeLLo WorlD";
        byte[] b = s.getBytes();

        for(int i =0;i<b.length;i++) {
            if(b[i]>97) {
                b[i] -=32;
                char c = (char) b[i];
                System.out.print(c);
            } else if(b[i]==32) {
                char c = (char) b[i];
                System.out.print(c);
            } else{
                b[i] +=32;
                char c = (char) b[i];
                System.out.print(c);
            }
        }
    }

//    --------------  Question 23  ------------------------------------------
    public static void question23() {
        int[] arr = {1,5,3,2};
        int[] myArr = new int[arr.length];
        boolean missingNumber = false;
        for(int i=0; i<arr.length;i++) {
            if(i!=arr[i]) {
                myArr[i] =1;
            }
        }
        for(int i=0; i< arr.length;i++) {
            if(myArr[i]==0) {
                System.out.println(i);
            }
        }
    }


}
