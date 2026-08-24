**table of content**
- [1.How does java work](#1how-does-java-work)
- [2.JDK  vs JRE vs JVM vs JIT](#2jdk--vs-jre-vs-jvm-vs-jit)
- [3. working](#3-working)
- [4. primitive data types //cannot break into multiple data types](#4-primitive-data-types-cannot-break-into-multiple-data-types)
- [5. Type casting](#5-type-casting)
- [6. automatic type promotion](#6-automatic-type-promotion)
- [7. Conditional statements](#7-conditional-statements)
- [8. Loops](#8-loops)
- [9. Switch](#9-switch)
  - [1. method 1](#1-method-1)
  - [2. method 2](#2-method-2)
    - [switch(day){](#switchday)
- [10. function/method in java](#10-functionmethod-in-java)
- [11. java work on pass by value](#11-java-work-on-pass-by-value)
  - [The Code Proof](#the-code-proof)
- [12. scope](#12-scope)
- [13. Shadowing](#13-shadowing)
- [14. Variable Arguments (Varargs)](#14-variable-arguments-varargs)
- [15. Method overloading](#15-method-overloading)
- [16. Array mutable](#16-array-mutable)
  - [index of array](#index-of-array)
  - [for each loop](#for-each-loop)
- [17. MultiDimension](#17-multidimension)


# 1.How does java work
    1. .java file(human written) - source code
    2. compiler(entire file convert to byte code)
    3. .class file(byte code file)
    4. interpreter(line by line)(jvm)
    5. Machine code( 0 and 1)

    this code will not directly run on a system 
    we need jvm to run this

    ### Stack Memory vs Heap Memory
        The Heap is only used for Objects (like new Dog() or new int[]). Primitives are lightweight and stay on the Stack.

    - **Stack Memory** stores method calls, local variables, and object references, and is automatically cleared after method execution.
    - **Heap Memory** stores the actual objects and arrays created using the **`new`** keyword.
    - The **reference** is stored in the **stack**, while the **actual object** is stored in the **heap**.
    - **Heap Memory** is managed by the **Garbage Collector (GC)**, while **Stack Memory** is managed automatically by the JVM.

# 2.JDK  vs JRE vs JVM vs JIT
      jdk = jre + development tools
        jre = jvm + library classes
          jvm and inside this jit(just in time)

# 3. working
    1. java source code
    2. jdk-compiler
    3. bytecode
    4. jvm-executable
    5. jre-run the executable code
    6. ouput

# 4. primitive data types //cannot break into multiple data types
    
    1. int num = 65; num here is identifiers and 65 here is literal
    2. char letter = 'r';
    3. float marks = 98.67f;
    4. double largedecimalnumber = 2342342.234234;
    5. long largeIntegger = 234234234234234234234L;
    6. boolean check = false;

# 5. Type casting
    System.out.println((int)(2345.234));
    String.valueOf(a + b);

# 6. automatic type promotion
    int a = 257;
    byte b = (byte)(a);
    System.out.println(b); // Output: 1 (because 257 % 256 = 1)
    
    byte a =110 , b=120 , c=110;
    int d = a * b / c;
        System.out.println(d);
        //a*b the operation are happening in the form of integer
        //as its exceed the byte limit java automatically promote it to int
        // if you put byte d then it will show error lowsy conversion 
        // because you cannot store the int into the byte
    }
    int number = 'A';
    System.out.println(number);//ASCII value automatic conversion

# 7. Conditional statements
    1. if--else statement 
    
    int salary = 25400;
    if(salary > 10000){
        salary = salary + 2000;
    } else {
        salary = salary + 1000;
    }
        System.out.println(salary);

# 8. Loops
    1.for loop

    for(int i = 1; i <= 3;i++){
        System.out.println(i);
    }
    
    2.while loop
    
    while (num <= 5){
        System.out.println(num);
        num += 1;
    }

    3.Do while
    
    do{
        System.out.println(num);
    }while(num <= 5);

# 9. Switch
    switch(fruit){
##  1. method 1
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();

        switch(fruit){
            case "apple":
                System.out.println("this is an apple");
                break;
            case "mango":
                System.out.println("this is an mango");
                break;
            case "banana":
                System.out.println("this is an banana");
                break;
            case "grapes":
                System.out.println("this is an grapes");
                break;
            case "kiwi":
                System.out.println("this is an kiwi");
                break;
            default:
                System.out.println("Enter the valid fruits from the list");
        }
##    2. method 2
        switch (fruit) {
            case "apple" -> System.out.println("this is an apple");
            case "mango" -> System.out.println("this is an mango");
            case "banana" -> System.out.println("this is an banana");
            case "grapes" -> System.out.println("this is an grapes");
            case "kiwi" -> System.out.println("this is an kiwi");
            default -> System.out.println("Enter the valid fruits from the list");
        }
        System.out.println(switch (fruit) {
            case "apple" -> "this is an apple";
            case "mango" -> "this is an mango";
            case "banana" -> "this is an banana";
            case "grapes" -> "this is an grapes";
            case "kiwi" -> "this is an kiwi";
            default -> "Enter the valid fruits from the list";
        });

###     switch(day){
            case 1,2,3,4,5 -> System.out.println("weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("enter valid day");
         }

# 10. function/method in java
        Acess modifier return_type name() {
        //body 
        return statement;
        }

        sum();
        System.out.println(sum2());
        
        static void sum(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the num1: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the num2: ");
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            System.out.println("The sum = " + sum);
        }

        static int sum2(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the num1: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the num2: ");
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            return sum;
        //        System.out.println("this will never execute");
        }

# 11. java work on pass by value
      1. Primitives (int, double, boolean, etc.)
      When you pass a primitive type to a method,
      Java makes a complete, independent copy of that
      value. Changing the variable inside the method 
      does absolutely nothing to the original variable.

      Primitive data type work by passing value but
      objects pass by value of that reference variable

      When you pass an object into a method, Java passes a 
      copy of the reference (the memory address), not a copy 
      of the actual object.

      This is where Java's "pass-by-value" rule confuses almost 
      everyone. The secret is understanding exactly *what* value is 
      being passed.

      When you pass an object into a method, **Java passes a copy 
      of the reference (the memory address), not a copy of the actual
      object.

      To understand this, you need to look at how Java splits memory 
      between the Stack and the Heap.

      1-The Memory: Objects live on the Heap. Reference variables (the "remote controls") live on the Stack.
      2-The Copy: Java passes objects by copying the memory address. The method gets a second remote control 
        pointing to the exact same object.
      3-Mutation (Sticks): Using the copied remote to change internal data modifies the real object on the Heap. 
        The original variable sees this change.
      4-Reassignment (Disappears): Pointing the method's remote to a new object only updates the local variable on 
        the Stack. The original variable back in main is completely unaffected.
##  The Code Proof
      
      Here is the exact code that proves you can mutate an object's 
      internal state, but you cannot permanently reassign the original 
      reference:

      
      class Dog {
          String name;
          public Dog(String name) { this.name = name; }
      }
      
      public class Main {
          public static void main(String[] args) {
              Dog myDog = new Dog("Max");
              
              modifyDog(myDog);
              
              // It prints "Buddy" (Not "Rex" and not "Max")
              System.out.println(myDog.name); 
          }
      
          public static void modifyDog(Dog dogParam) {
              // MUTATION: This works because both remotes point to the same Heap object
              dogParam.name = "Buddy"; 
              
              // REASSIGNMENT: This fails to affect 'myDog' in main.
              // We are only pointing 'dogParam' to a brand new object.
              dogParam = new Dog("Rex"); 
          }
      }

# 12. scope
          int a = 24;// initialized outside the block
        {
            // int a = 23;  this cannot happen because
            // already initialised outside the block

            a = 69; // reassign the origin ref variable to some other value
            int b = 123;
            System.out.println(a + b);
            // values initialized int this block, will remain in block

        }
        System.out.println(a);
        //System.out.println(b); cannot use outside the block
        // outside variable can be used inside
        // but inside variable cannot be used outside

# 13. Shadowing 
        public class Ex08_Shadowing {
            static int x =90; // this will be shadowed at line 8
            public static void main(String[] args) {
                System.out.println(x);//90
                int x; // declaring x again  will shadow the class variable in line 2
                // we have declared the variable over here
                //System.out.println(x); // this will throw the error that
                x=80;// we have initialized the variable over here
                System.out.println(x);//80
                fun();
            }
            static void fun(){
                System.out.println(x);//90
            }
        }

# 14. Variable Arguments (Varargs)
      used at the last while giving parameters
              import java.util.Arrays;

              public class Ex09_VarArgs {
              public static void main(String[] args) {
              fun(2,23,23,23,23434134,134,23,213);
              
                  multiple(2,3,"serf","sefg","sefg");
                  }
              
                  static void multiple(int a,int b,String ...v){ 
                      // this will create multiple data type of arrays 
                      System.out.println(a+b+" " + Arrays.toString(v));
                  }
              
                  static void fun(int ...v){ //this will create an array
                      System.out.println(Arrays.toString(v));
                  }
              }

# 15. Method overloading
        public class Ex10_FunctionOverloading {
    public static void main(String[] args) {
        fun(67);
        fun("sandeep");
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }

    }

# 16. Array mutable
    syntax
    datatype[] variableName = new datatype[size];
    new is to create an object empty of some size
    store 5 roll numbers: int[] rnos = new int[5];
    or directly: int[] rnos2 = {23,34,43,23,54}
    int array can only contain integer same for boolean string
    int[] it will contain only integer
    String[] it will contain only strings

    declaration int[] ros; ros is getting deffined in the stack
    initiaslization ros = new int[5]; object is beign created in the heap 
    
##  index of array
    arr[0];
## for each loop
    for(int i =0;i<ros.length;i++){
        System.out.println(ros[i]+ " ");
    }
    for (int n : ros) { // n is the element of the array 
        System.out.println(n + " ");
    }
    System.out.println(Arrays.toString(ros));

    for (int[] row : jaggedArray) {
        for (int element : row) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
# 17. MultiDimension/ 2D Array
    1 2 3
    4 5 6
    7 8 9
    no .of row is first and this is mandatory while declaring
    no .of column is second and it is not mandatory to specify ,[4][]
    
    Arrays.toString(): Loop through the array and print each row (1D array) using this method for a clean grid format. 
    Arrays.deepToString(): Convert the entire 2D array to a single string representation. 

    System.out.println(Arrays.deepToString(arr)); // used to print the 2d array
    System.out.println(arr.length);// no.of rows
    arr = new int[][] {
            {1, 2, 4},
            {2,5},
            {1,7,2,6}
    };

# 18. Input/Output in 2D Array
    int[][] arr = new int[3][3];
    //input
        for(int row=0; row<3;row++){
            for(int col =0 ; col<3;col++){
                arr[row][col] = in.nextInt();
            }
        }
    //output
        for(int row=0; row<arr.length;row++){ // no.of rows
             for(int col=0;col<arr[row].length;col++){//no.of columns
                 // this is printing each element one by one
                System.out.print(arr[row][col] + " ");
            }
             // this printing the whole row
            System.out.println("\n" + Arrays.toString(arr[row]));
        }
        for(int[] sarr : arr){
            // print the 2d array row by row
            System.out.println(Arrays.toString(sarr));
        }
        //directly print whole 2d array in one line
        System.out.println(Arrays.deepToString(arr));

# 19. ArrayList














