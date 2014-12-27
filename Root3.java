package java24book;

class Root3 {
    public static void main(String[] arguments) {
        /* The main() method puts all arguments in an array of strings, here named
           arguments. The first argument is stored in array element arguments[0].
           Calling the method Integer.parseInt() with that element creates an 
           integer value from a string. */
        int number = Integer.parseInt(arguments[0]);
        System.out.println("The square root of "
            + number
            + " is "
            + Math.sqrt(number)
        );
    }
}