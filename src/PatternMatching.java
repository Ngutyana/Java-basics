public class PatternMatching {
    public static void main(String[] args) {
        record Person(String firstName, String lastName, int Age){} //creating a class
        String var1 = "Variable 1 successful!";
        Integer var2 = 2;
        String[] var3 = {"Variable", "Three"};
        Person var4 = new Person("Unathi", "Ngutyana",24);
        Person var5 = new Person("Eye", "Makubalo",30);

        //pattern matching using a variable data type.
        Object obj = var1;
//
//        switch (obj){
//            case String msg -> System.out.println(msg);
//            case Integer num -> System.out.println("This is variable 2" + num);
//            case Person p && p.firstName().length() > 3 -> System.out.println("Looks like Eye");  //failing
//            case String[] arr -> System.out.println("Variable 3 with "+arr.length+" elements");
//            case default -> System.out.println("Have no idea");


 //       }


    }
}
