/*
// Sample code to perform I/O:

name = Console.ReadLine();                  // Reading input from STDIN
Console.WriteLine("Hi, {0}.", name);        // Writing output to STDOUT

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
*/

// Write your code here
// Online C# Editor for free// Write, Edit and Run your C# code using C# Online Compiler

// using System;using System.Collections;

// public class HelloWorld {  static void Main(string[] args) {

//     long t = Convert.ToInt64(Console.ReadLine());    while (t > 0) {      long ans = 0;      long n = Convert.ToInt64(Console.ReadLine());      int i = 1;      while (i <= Math.Sqrt(n)) {        i = i * 2;        if (n / i >= i / 2) {          ans = n - n / i;        } else {          ans = (n - (i / 2) + 1);        }      }      Console.WriteLine(ans);      t--;    }

//   }

// }