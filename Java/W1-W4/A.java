// One java file can have only one public class
// The name of the java file is same as the public class 
// Private class is not accessible to other classes
// Compiling - Converting the programme to byte code - javac publicclass.java
// Running - Running the byte code - java privateclass1
// Compiling & Running - java publicclass.java
// Compiling - Converts Java to bytecode (.class file) - javac PublicClass.java
// Running - Executes the compiled bytecode (runs the main method of the class) - java publicClass or java classHavingmainMethod
// Compiling & Running - Compiles in memory and runs single-file code directly - java publicClass.java
// static - call a method of a class without creating an object of that class

public class A{
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

// class B {
//     public static int add(int x, int y){
//         return x + y;
//     }
// }

// class G {
//     public static void main(){
//     System.out.println(B.add(4, 5));
//     }
// }

class C {
    static void main(String[] args) {
        int i1 = 10, i2 = 29;
        double d;

        d = i2 / i1;
        System.out.print(d + " ");

        d = (double)(i2 / i1);
        System.out.print(d + " ");
        boolean flag = true;
        System.out.println(flag);
        d = (double)i2 / i1;
        System.out.print(d);
            // String o = "  NinjaHattori    ";
            // // System.out.println(o.toUppercase());
            // System.out.println(o.substring(5));
            // System.out.println(o.charAt(7));
            // String l = o.trim();
            // System.out.println(l);
            // System.out.println(o.split(","));
    
            // long m = 333333333333333333L;
            // int x = 3; 
            // int y = 4;
            // float subnma = (float)x/y;
            // System.out.println(subnma);
            // System.out.println(m);
        
        }
}
        
        // class D{
            //     static void main(String[] args) {
                //     for (int i = 1; i <= 5; i++) {
                    //         System.out.println(i);
                    //     }}
                    // }
                    
//                     class E{
//                         static void main() {
//                             int i = 5;
//                             do {
//                                 System.out.println(i);
//                                 i--;
//                             } while (i > 0);
//                         }
//                     }
                    
// class F {
//     public static void main(){
//         int i = 1;
//         switch (i) {
//             case 1:
//                 System.out.println("Monday");
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             default:
//                 System.out.println("Sunday");
//                 break;
//         }
//     }
// }

// class Electronic {
//     String name;
//     int sNo;
//     Electronic (String name, int sNo) {
//         this.name = name;
//         this.sNo = sNo; 
//     }
//     void getDisplay() {
//         System.out.println(sNo);
//     }
// }
// class Printer {
//     void main() {
//         Electronic e = new Electronic("piya", 26);
//         e.getDisplay();
//     }
// }

// class Bedsheet {
//     String name;
//     int code;
//     Bedsheet(String name, int code) {
//         this.name = name;
//         this.code = code;
//     }
//     Bedsheet (Bedsheet other) {
//         this.name = other.name;
//         this.code = other.code;
//     }
//     void displayCode() {
//         System.out.println(code);
//     }
//     void displayName() {
//         System.out.println(name);
//     }
//     void setName(String n) {
//         this.name = n;
//     }
// }
// class Printer2 {
//     void main(){
//     Bedsheet b = new Bedsheet("Nilkamal", 553);
//     Bedsheet b2 = new Bedsheet(b);
//     System.out.println(b.name);
//     b.setName("naila");
//     b.displayName();
//     b2.displayCode();
//     }
// }

// class Employee {
//     private String name;
//     private double salary;
//     Employee (String n, double s) {
//         this.name = n;
//         this.salary = s;
//     }
//     void setName(String n) {
//         this.name = n;
//     }
//     void setSalary(double s) {
//         this.salary = s;
//     }
//     String getName() {
//         return name;
//     }
//     double getSalary() {
//         return salary;
//     }
//     double getBonus(float percint) {
//         return (percint*salary/100);
//     }
// }
// class Manager extends Employee {
//     private String secretary;
//     Manager(String n, double s, String sec) {
//         super(n, s);
//         this.secretary = sec;
//     }
//     void setSecretary(String sec) {
//         this.secretary = sec;
//     }
//     String getSecretary() {
//         return secretary;
//     }
//     double getBonus(float perci) {
//         super.getBonus(perci);
//         return (1.5*perci);
//     }
// }
// class Printer3 {
//     public static void main(String[] args) {
//         Employee e1 = new Employee("RAghava", 20000);
//         Manager m1 = new Manager("Vimab", 40000, "ajmala");
//         System.out.println(e1.getName());
//         System.out.println(m1.getName());
//         m1.setName("Rajiv");
//         System.out.println(m1.getName());
//         System.out.println(m1.getBonus(3));
//         // Employee[] emparray = new Employee[2];
//         // emparray[0] = e1;
//         // emparray[1] = m1;
//         // for (i=0; i<emparray.length; i++) {
//         //     System.out.println(emparray[i].bonus(5));
//         // }
//     }
// }
class Print {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(a == b);
    }
}

class WhileEx2 {
    public static void main(String[] args) {
        int i = 0;

        while (i > 0) {
            System.out.println(i);
        }

        do {
            System.out.println(i);
        } while (i > 0);
    }
}
class FClass {
    public static void main(String args[]) {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // int n = 9;
        System.out.println(arr[3]);
        System.out.println(arr[4]/arr[3]);
        System.out.println(arr[9]/arr[5]);
        System.out.println(4/3);
        // n = arr[arr[n] / 2];

        // System.out.println(arr[n] / 3);
    }
}

class Book {
    private String title = "Unknown Title";
    private String author;

    public Book() {
        author = "Unknown Author";
    }
    public Book(String t, String a) {
        title = t;
        author = a;
    }
    public void setTitle(String t) {
        title = t;
    }
    public void setAuthor(String a) {
        author = a;
    }
    public String tostring() {
        return "Title: " + title + "; Author: " + author;
    }
}
class TestBook {
    public void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "Riya");

        b1.setAuthor("Diya");

        System.out.println(b1);
        System.out.println(b2);
    }
}
class TestBook {
    public void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "Riya");

        b1.setAuthor("Diya");

        System.out.println(b1);
        System.out.println(b2);
    }
}
class FClasss{
     public static void main(String[] args) {
              int[] a = {1, 2, 3};
              int[] b = a;
              System.out.print(a == b);
      }
}
class F3 {
    public static void main(String[] args) {
        String[] str1 = {"apple", "banana", "guava"};
        System.out.println(str1[1]);
    }
}

class SClass{
          int i = 10;
          public SClass(int _i) { i = 20; }
          public void print() { System.out.println(i); }
}
class PQ{
       public static void main(String[] args) {
             int i = 30;
             SClass obj = new SClass(i);
             obj.print();
     }
}
class H {
    public static void main(String[] args) {
        int[] ari = {1, 3, 2, 5, 4};
        for (int numb: ari) {
            System.out.println(numb);
        }
    }
}