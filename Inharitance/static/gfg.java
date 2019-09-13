$$$$$$$Difference between static and non-static method in Java
What is an static method ?:
A static method is a method that belongs to a class, but its not belongs to an instance of that class and this method can be called without the instance or object of that class.

$$$$$$$What is an non-static method ?:
Every methods in java are non-static method, but the methods must not have static keyword before method name. non-static methods can access any static method and static variable also, without using the object of the class.

Below are the various important differences among these:

$$$$$$Accessing members and methods:
In static method, the method can only access only static data members and static methods of another class or same class but cannot access non-static methods and variables. Also a static method can rewrite the values of any static data member.
In non-static method, the method can access static data members and static methods as well as non-static members and method of another class or same class, ans also can change the values of any static data member.

$$$$$$Calling process:
In static method, The memory of a static method is fixed in the ram, for this reason we don’t need the object of a class in which the static method is defined to call the static method. To call the method we need to write the name of the method followed by the class name.
class GFG{
 public static void geek()
 { }
}

// calling
GFG.geek();
filter_none
edit
play_arrow

brightness_5
// Java program to call a static method 
  
class GFG { 
  
    // static method 
    public static int sum(int a, int b) 
    { 
        return a + b; 
    } 
} 
  
class Main { 
    public static void main(String[] args) 
    { 
        int n = 3, m = 6; 
  
        // call the static method 
        int s = GFG.sum(n, m); 
  
        System.out.print("sum is = " + s); 
    } 
} 
Output:

sum is = 9
In non-static method, the memory of non-static method is not fixed in the ram, so we need class object to call a non-static method. To call the method we need to write the name of the method followed by the class object name.
class GFG{
 public void geek()
 { }
}

// creating object
GFG g = new GFG();

g.geek();

// calling
filter_none
edit
play_arrow

brightness_5
// Java program to call a non-static method 
  
class GFG { 
  
    // static method 
    public int sum(int a, int b) 
    { 
        return a + b; 
    } 
} 
  
class Main { 
    public static void main(String[] args) 
    { 
        int n = 3, m = 6; 
        GFG g = new GFG(); 
        int s = g.sum(n, m); 
        // call the non-static method 
  
        System.out.print("sum is = " + s); 
    } 
} 
Output:

sum is = 9
$$$$$$$$$Binding process:
In static method, the method use compile time or early binding.For this reason we can access static method without creation a instance.
In non-static method, the method use runtime or dynamic binding. So that we cannot access a non-static method without creation a instance.
Overriding:
In static method, we cannot override a static method, because of early binding.
Example:
filter_none
edit
play_arrow

brightness_5
// Override of non-static method 
  
class Parent { 
    void show() 
    { 
        System.out.println("Parent"); 
    } 
} 
  
// Parent inherit in Child class 
class Child extends Parent { 
  
    // override show() of Parent 
    void show() 
    { 
        System.out.println("Child"); 
    } 
} 
  
class GFG { 
    public static void main(String[] args) 
    { 
        Parent p = new Parent(); 
        // calling Parent's show() 
        p.show(); 
  
        Parent c = new Child(); 
        // calling Child's show() 
        c.show(); 
    } 
} 
Output:

Parent
Child
In non-static method, we can override a non-static method. Because for override we need runtime polymorphism, which is happens only in runtime binding.
Example:
filter_none
edit
play_arrow

brightness_5
// Override of static method 
class Parent { 
  
    // static method 
    static void show() 
    { 
        System.out.println("Parent"); 
    } 
} 
  
// Parent inherit in Child class 
class Child extends Parent { 
  
    // override show() of Parent 
    void show() 
    { 
        System.out.println("Child"); 
    } 
} 
  
class GFG { 
    public static void main(String[] args) 
    { 
        Parent p = new Parent(); 
        // calling Parent's show() 
        p.show(); 
        // cannot override Parent's show() 
    } 
} 
Error:

java:15: error: show() in Child cannot override show() in Parent
    void show()
         ^
  overridden method is static
Memory allocation:
In static method, memory allocation happens only once, because the static keyword fixed a particular memory for that method in ram. So when the method is called every time in a program, each time that particular memory is used. For that reason the less memory is allocated.
In non-static method, here memory allocation happens when the method is invoked and the memory is allocated every time when the method is called. So much memory is used here.
Difference table:

POINTS	STATIC METHOD	NON-STATIC METHOD
Definition	A static method is a method that belongs to a class, but its not belongs to an instance of that class and this method can be called without the instance or object of that class.	Every methods in java are non-static method, but the methods must not have static keyword before method name. non-static methods can access any static method and static variable also, without using the object of the class.
Accessing members and methods	In static method, the method can only access only static data members and static methods of another class or same class but cannot access non-static methods and variables.	In non-static method, the method can access static data members and static methods as well as non-static members and method of another class or same class.
Binding process	Static method uses compile time or early binding.	Non-static method uses runtime or dynamic binding.
Overriding	Static method cannot be overridden because of early binding.	Non-static method can be overridden because of runtime binding.
Memory allocation	In static method, less memory is use for execution because memory allocation happens only once, because the static keyword fixed a particular memory for that method in ram. .	In non-static method, much memory is used for execution because here memory allocation happens when the method is invoked and the memory is allocated every time when the method is called.


Recommended Posts:
Difference between static and non-static variables in Java
Understanding "static" in "public static void main" in Java
Static and non static blank final variables in Java
Static method in Interface in Java
Static Block and main() method in Java
Difference between Static and Shared libraries
Difference between == and .equals() method in Java
Static class in Java
static keyword in java
Static blocks in Java
Static import in Java
Shadowing of static functions in Java
Comparison of static keyword in C++ and Java
Static Control Flow in Java
Final static variable in Java
