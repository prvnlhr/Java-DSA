/*
   ** JDK = JRE + Development Tools
   * ? More at : https://www.geeksforgeeks.org/introduction-to-java/

   * Diff b/w C++,Java,Python https://www.geeksforgeeks.org/c-vs-java-vs-python/
   * https://www.geeksforgeeks.org/differences-jdk-jre-jvm/

   JVM -> is interpreter
   JIT -> https://www.geeksforgeeks.org/just-in-time-compiler/

    Why is OS independent :
   * https://www.geeksforgeeks.org/java-platform-independent/
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

// -> Main Method
class Demo1 {
    public static void main(String[] args) {

    }
}
/*
  * About Main Method ::
  ? public: So that JVM can execute the method from anywhere.
  ? static: The main method is to be called without an object. The modifiers
  ? public and static can be written in either order.
  ? void: The main method doesn't return anything.
  ? main(): Name configured in the JVM. The main method must be inside the class definition.
  ? The compiler executes the codes starting always from the main function.
  ? String[]: The main method accepts a single argument, i.e., an array of elements of type String.

 */

/*
  ? Data Types in Java
  - 1.Primitive Data Type: such as boolean, char, int, short,byte,long,float,double
  - 2.Non-Primitive Data Type or Object Data type : such as String, Array,Class,Interface etc.

  ? boolean -> true/false -> 1 bit , default : false
  ? char -> 16 bits -> 2 byte , default : \u0000'
  ? byte -> 8 bit : -128 to 127. default : 0
  ? int -> 32 bits : -2147483648 to 2147483647. default : 0
  ? long -> 64 bits : -9223372036854775808 to 9223372036854775807 , default : 0L
  ? float -> 32 bits : ex. 0.0 : up to 7 decimal digits :1.40239846e-45f to 3.40282347e+38f, default : 0.0f
  ? double -> 64 bits : up to 16 decimal digits : 4.94065645841246544e-324 to 1.79769313486231570e+308, default : 0.0d
 */

class DatTypes {

    // Main driver method
    public static void main(String args[])
    {

        // Creating and initializing custom character
        char a = 'G';

        // Integer data type is generally
        // used for numeric values
        int i = 89;

        // use byte and short
        // if memory is a constraint
        byte b = 4;

        // this will give error as number is
        // larger than byte range
        // byte b1 = 7888888955;

        short s = 56;

        // this will give error as number is
        // larger than short range
        // short s1 = 87878787878;

        // by default fraction value
        // is double in java
        double d = 4.355453532;

        // for float use 'f' as suffix as standard
        float f = 4.7333434f;

        // need to hold big range of numbers then we need
        // this data type
        long l = 12121;

        System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);
    }
}

/*
* Why char uses 2 bytes in java and what is \u0000?
  ? Char uses 2 bytes in java because it uses the Unicode system rather than the ASCII system.
  ? “\u000” is the lowest range of the Unicode system.



 * Java Identifiers -> In programming languages, identifiers are used for identification purposes.
 *                     In Java, an identifier can be ,
 ?                     1. class name,
 ?                     2. method name,
 ?                     3. variable name,
 ?                     4. label.
 ! rules for indentifiers
 * a-z , A-Z, $, _
 * Special charaters are not allowed, ex. @, * etc
 * does not start with 0-9
 * case-sensitive
 * reserved word can't be used

 * Examples :
    > MyVariable
    > MYVARIABLE
    > myvariable
    > x
    > i
    > x1
    > i1
    > _myvariable
    > $myvariable
    > sum_of_array
    > geeks123
 */

// * Operators in Java :  https://www.geeksforgeeks.org/operators-in-java/


/*

 + Java Input/Output Streams:
 * Java brings various Streams with its I/O package that helps the user to perform all the input-output operations.
 * These streams support all types of objects, data types, characters, files, etc to fully execute the I/O operations.
 * There are two ways by which we can take input from the user or from a file,
    ? 1. BufferedReader Class.
    ? 2. Scanner Class.


    > Scanner Class
    - Advanced version of BufferReader Class
    - The scanner can read formatted input.
    - The scanner is much easier to read as we don’t have to write throws as there is no exception thrown by it.
    - It was added in later versions of Java
    - It contains predefined functions to read an Integer, Character, and other data types as well.

     * import java.util.Scanner;
     ? Synatax : Scanner s = new Scanner(System.in);

    * Differences Between BufferedReader and Scanner
    * BufferedReader is a very basic way to read the input generally used to read the stream of characters.
    * It gives an edge over Scanner as it is faster than Scanner because Scanner does lots of post-processing for parsing the input;
    * as seen in nextInt(), nextFloat()
    * BufferedReader is more flexible as we can specify the size of stream input to be read. (In general, it is there that BufferedReader reads larger input than Scanner)
    * These two factors come into play when we are reading larger input. In general, the Scanner Class serves the input.
    * BufferedReader is preferred as it is synchronized. While dealing with multiple threads it is preferred.
    * For decent input, and easy readability. The Scanner is preferred over BufferedReader.
 */

import java.util.*;

class ScannerClass {

    public static void main(String[] args) {
        // Scanner definition
        Scanner scn = new Scanner(System.in);

        // * input is a string ( one word )
        // read by next() function
        String str1 = scn.next();

        // print String
        System.out.println("Entered String str1 : " + str1);

        // * input is a String ( complete Sentence )
        // read by nextLine()function
        String str2 = scn.nextLine();
        // print string
        System.out.println("Entered String str2 : " + str2);

        // * input is an Integer
        // read by nextInt() function
        int x = scn.nextInt();

        // print integer
        System.out.println("Entered Integer : " + x);

        // * input is a floatingValue
        // read by nextFloat() function
        float f = scn.nextFloat();

        // * print floating value
        System.out.println("Entered FloatValue : " + f);

        double d = scn.nextDouble();
        System.out.println("Entered DoubleValue : " + d);

    }

}
// *   Strings basics in Java : https://www.geeksforgeeks.org/strings-in-java/
    class StringDemo{
    String str1 = "Geeks";  // string Object created as literal
                            // created in string constant  pool
    String str2 = new String("Geeks");  // string Object created using new keyword
                                               // not created in string pool
    String internedString = str2.intern();
    // this will add the string to string constant pool.

    // * It is preferred to use String literals as it allows JVM to optimize memory allocation.




    // ? String Builder ::
    StringBuilder str = new StringBuilder();
    str.append("GFG");
    // * StringBuilder in Java represents a mutable sequence of characters.
    // * Since the String Class in Java creates an immutable sequence of characters, the StringBuilder
    // * class provides an alternative to String Class, as it creates a mutable sequence of characters.


     /*    ? Why string objects are immutable in java?
           * Because java uses the concept of string literal. Suppose there are 5 reference variables,
           * all refers to one object “sachin”. If one reference variable changes the value of the object,
           * it will be affected to all the reference variables. That is why string objects are immutable in java.
     */


    /*
     * String methods in  Java ::
    -> https://www.geeksforgeeks.org/string-class-in-java/
     */
}



class ArrayClassDemo {


    /*

     ? int intArray[];    // declaring array
     ? intArray = new int[20];  // allocating memory to array
     ? int[] intArray = new int[20]; // combining both statements in one


     * In a situation where the size of the array and variables of the array are already known,
     * array literals can be used.
     ?  int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

     * Multidimensional Array
     ? int [][] arr= new int[3][3];

     * Jagged Array
     ? https://www.geeksforgeeks.org/jagged-array-in-java/
     */


    public static void main(String[] args)
    {
        // declares an Array of integers.
        int[] arr;

        // allocating memory for 5 integers.
        arr = new int[5];

        // initialize the first elements of the array
        arr[0] = 10;

        // initialize the second elements of the array
        arr[1] = 20;

        // so on...
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i
                    + " : " + arr[i]);
    }
}

// * Read About Java Collections
// * Read About Java Wrapper Class -> https://www.programiz.com/java-programming/wrapper


class ArrayLisytDemo{
    public static void main(String[] args) {
        /*
        * ArrayList -> Resizeable arrays
        * It implements the List interface of the collections framework.
        * Arraylists are also known as dynamic arrays.
        * Arraylists can automatically adjust their capacity when we add or remove elements from them.

        ? syntax :
         ArrayList<Type> arrayList = new ArrayList<>();

         * We have used ''Integer'' not int. It is because we cannot use primitive types while
         * creating an arraylist. Instead, we have to use the corresponding wrapper classes.
        */

        // * Basic Operation on ArrayList

        // ? 1. Add Elements to an ArrayList
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(5);
        arrList.add(6);
        arrList.add(7);
        // O/P : arrList -> {5,6,7};

        // * add at specific index
        arrList.add(3,10);

        // create a set
        HashSet<String> vowels = new HashSet<>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");

        // create an arraylist
        ArrayList<String> alphabets = new ArrayList<>();

        // * add all elements of set to arraylist
        alphabets.addAll(vowels);
        System.out.println("ArrayList: " + alphabets);

        // ? 2. Access ArrayList Elements
        int  x = arrList.get(2);

        // ? 3. Change ArrayList Elements
        arrList.set(2,11);

        // ? 4. Remove ArrayList Elements
        arrList.remove(2);

        // ? 6. Iterate through an ArrayList

        for(int ele :arrList){
            System.out.println(ele);
        }

        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }

        // ? 7. Methods of ArrayList
        //  * 1. sort() :
                arrList.sort(Comparator.naturalOrder()); // asceding ordeer
                arrList.sort(Comparator.reverseOrder()); // descending order

        //  * 2. size() :
                int sz = arrList.size();

        //  * 3. indexOf() : return index of first occurance, if not present return -1
                int indx = arrList.indexOf(11);

        //  * 4. contians() :
        //  * 5. isEmpty() :
        //  * 6. clone() :

/*
? How is data stored in ArrayList?
* ArrayList can stores data till the ArrayList size is full, after that
* the size of ArrayList is doubled if we want to store any more elements.

? Vector is also similar to ArrayList
They are very similar to ArrayList, but Vector is synchronized and has some
legacy methods that the collection framework does not contain.
Synchronised means only one thread at a time can access the code.
It is rarely used in a non-thread environment as it is synchronized, and due
to this, it gives a poor performance in adding, searching, deleting, and updating its elements.
*/
    }
}



/*
? Java Collections framework
 * The Java collections framework provides a set of ''interfaces'' and ''classes'' to
 * implement various ''data structures and algorithms''.

 * Sub-interfaces
 1. List -> ArrayList, LinkedList, Vector-> Stack
 2. Set -> HashSet, LinkedHashSet, SortedSet -> TreeSet
 3. Queue ->  Priority Queue, Deque, ArrayDeque


 1. ArrayList :
    ArrayList<Type> arrayList= new ArrayList<>();

 2. LinkedList:
    LinkedList<Type> linkedList = new LinkedList<>();
    addFirst();
    addLast();
    getFirst();
    getLast();
    removeFirst();
    removeLast();
    peek(); -> head, gives head of LL
    poll(); -> removes first
    offer(); -> adds given element to end


 3. Vector :
    Vector<Data-type> v = new Vector<Data-Type>();
    Vector<Data-type> v = new Vector<Data-Type>(int size);

 4. Stack :
    Stack<Data-Type> stack = new Stack<Data-Type>();
    push();
    pop();
    peek();

 5. Queue -> implemented as -> ArrayDeque, LinkedList, PriorityQueue

    * LinkedList implementation of Queue
    Queue<String> animal1 = new LinkedList<>();

    * Array implementation of Queue
    Queue<String> animal2 = new ArrayDeque<>();

    * Priority Queue implementation of Queue
    Queue<String> animal 3 = new PriorityQueue<>();

 6. PriorityQueue -> The PriorityQueue class provides the functionality of the heap data structure.

    * minPQ
    PriorityQueue<Data-Type> pq = new PriorityQueue<Data-Type>();
    PriorityQueue<Data-Type> pq = new PriorityQueue<Data-Type>(int size);

    * maxPQ
    PriorityQueue<Data-Type> pq = new PriorityQueue<Data-Type>(Collections.reverseOrder());

    * or using custom Comparator
    PriorityQueue<Integer> numbers = new PriorityQueue<>(new CustomComparator());

        class CustomComparator implements Comparator<Integer> {

            @Override
            public int compare(Integer number1, Integer number2) {
                int value =  number1.compareTo(number2);
                // elements are sorted in reverse order
                if (value > 0) {
                    return -1;
                }
                else if (value < 0) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        }


        * methods
        add(); -> adds eleement
        poll(); -> remove top most element
        peek(); -> get top most element
        remove() -> removes the specified element from the queue
        size() ->	Returns the length of the priority queue.

        * To iterator we use iterator();
          Iterator<Integer> iterate = pq.iterator();
          -> interate.next();
          -> iterate.hasNext();

         while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }


 7. Deque ->  insert and remove elements from both front and rear.

    * Array implementation of Deque
    Deque<String> animal1 = new ArrayDeque<>();

    * LinkedList implementation of Deque
    Deque<String> animal2 = new LinkedList<>();

    addFirst() - Adds the specified element at the beginning of the deque. Throws an exception if the deque is full.
    addLast() - Adds the specified element at the end of the deque. Throws an exception if the deque is full.
    offerFirst() - Adds the specified element at the beginning of the deque. Returns false if the deque is full.
    offerLast() - Adds the specified element at the end of the deque. Returns false if the deque is full.
    getFirst() - Returns the first element of the deque. Throws an exception if the deque is empty.
    getLast() - Returns the last element of the deque. Throws an exception if the deque is empty.
    peekFirst() - Returns the first element of the deque. Returns null if the deque is empty.
    peekLast() - Returns the last element of the deque. Returns null if the deque is empty.
    removeFirst() - Returns and removes the first element of the deque. Throws an exception if the deque is empty.
    removeLast() - Returns and removes the last element of the deque. Throws an exception if the deque is empty.
    pollFirst() - Returns and removes the first element of the deque. Returns null if the deque is empty.
    pollLast() - Returns and removes the last element of the deque. Returns null if the deque is empty.

8. Set ->  HashSet, LinkedHashSet, TreeSet, EnumSet
            -> SortedSet, NavigableSet


       1. HashSet<Data-type> hs = new HashSet<Data-type>();
          HashSet<Data-type> hs = new HashSet<Data-type>(int size);
          * When we insert elements into the HashSet, it is not guaranteed
          * that it gets stored in the same order.

        * Methods
            add();
            remove();
            removeAll();
            size();
            clear();
            contains();

       2. LinkedHashSet<Data-type> lhs = new LinkedHashSet<Data-type>();
          LinkedHashSet<Data-type> lhs = new LinkedHashSet<Data-type>(int size);
               -> stores in natural order

        * Methods
            add();
            remove();
            removeAll();
            size();
            clear();
            contains();

       3. SortedSet<Data-Type> ts = new TreeSet<Data-type>();
            -> stores in sorted order

            * Methods
            add();
            remove();
            removeAll();
            size();
            clear();
            contains();

        4. Set <String> ts = new TreeSet<>();

 9. Map -> A map is an object that stores key and value pairs.
        -> It contains unique keys as the same key cannot have multiple mappings.
        -> It uses a hash table for storing key-value pairs.

         1. Map<Data-Type> hm = new HashMap<> ();

         2. HashMap<Integer, Double> hm = new HashMap<Integer, Double>();

         3. Map<String, Integer> values = new TreeMap<>();

       * Methods

       put(K, V) - Inserts the association of a key K and a value V into the map. If the key is already present, the new value replaces the old value.
       putAll() - Inserts all the entries from the specified map to this map.
       putIfAbsent(K, V) - Inserts the association if the key K is not already associated with the value V.
       get(K) - Returns the value associated with the specified key K. If the key is not found, it returns null.
       getOrDefault(K, defaultValue) - Returns the value associated with the specified key K. If the key is not found, it returns the defaultValue.
       containsKey(K) - Checks if the specified key K is present in the map or not.
       containsValue(V) - Checks if the specified value V is present in the map or not.
       replace(K, V) - Replace the value of the key K with the new specified value V.
       replace(K, oldValue, newValue) - Replaces the value of the key K with the new value newValue only if the key K is associated with the value oldValue.
       remove(K) - Removes the entry from the map represented by the key K.
       remove(K, V) - Removes the entry from the map that has key K associated with value V.
       keySet() - Returns a set of all the keys present in a map.
       values() - Returns a set of all the values present in a map.
       entrySet() - Returns a set of all the key/value mapping present in a map.

*/



/*
? EXCEPTION HANDLING IN JAVA

Exception :
 - An exception is an unwanted or unexpected event that occurs during the execution of the program,
 - that disrupts the flow of the program.
 - Exceptions usually occur due to the code and can be recovered.
 - They can occur at both run time and compile time.

Error :
 - An error is also an unwanted condition but it is caused due to lack of resources and indicates a serious problem.
 - Errors are irrecoverable, they cannot be handled by the programmers.
 - They can occur only at run time.


**  Java uses try-catch blocks and other keywords like finally, throw, and throws to handle exceptions.
**  We handle exceptions in java to make sure the program executes properly without any halt, which occurs when an exception is raised.

- Try : block contains the program statements that may raise an exception.
- Catch : block catches the raised exception and handles it.
- Throw : keyword is used to explicitly throw an exception.
- Throws : keyword is used to declare an exception.
- Finally : block contains statements that must be executed after the try block.
            inally block is used to execute important statements such as closing
            statement, release the resources, and release memory also.
            Finally block can be used with try block with or without catch block.


 * Exceptions can be categorized in two ways:
 ? 1.  Built-in Exceptions
    a. Checked Exception -> exceptions that are checked at compile time
    - ClassNotFoundException
    - FileNotFoundException
    - IOException
    - SQLException

    b. Unchecked Exception -> exceptions that are not checked at compile time
       - IndexOutOfBoundsException
       - NullPointerException
       - ArithmeticException
       - IllegalArgumentException

 ? 2. User-Defined Exceptions





 */
class InvalidProductException extends Exception {
    public InvalidProductException(String s) {
        // Call constructor of parent Exception
        super(s);
    }
}

public class CustomExample1 {
    void Check(int weight) throws InvalidProductException {
        if (weight < 50) {
            //raises exception is weight is less than 50
            throw new InvalidProductException("Product Invalid");
        }
    }

    public static void main(String args[]) {
        CustomExample1 obj = new CustomExample1();
        try {
            obj.productCheck(35);
        } catch (InvalidProductException ex) {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }
}









