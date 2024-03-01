public class ForLoopEx {
    public static void main(String[] args) {
        for (int count= 0;count<10;count++){
            System.out.printf("Count number: %d",count);
        }

//No 1.
        String[] fruits = {"apple", "orange","pear","plum"};
        for(int counter = 0; counter < fruits.length; counter++){
            System.out.printf("The current fruit is %s %n",fruits[counter]);
        }

//No 2.  {alternatively}
        for (String fruit : fruits){  //If you don't need an index or a counter, this is the best way to use a for loop
            System.out.printf("The current fruit is %s %n",fruits);
        }
    }
}
