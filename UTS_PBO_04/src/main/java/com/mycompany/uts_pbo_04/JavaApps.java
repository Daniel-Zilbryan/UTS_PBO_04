/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uts_pbo_04;

/**
 *
 * @author Njumbull
 */
public class JavaApps {
public static void main(String[] args)
   {
      Instructor myInstructor =
          new Instructor("Haris", "Daniel", "DNH1717");

      TextBook myTextBook =
          new TextBook("Pergerakan Mahasiswa",
                       "Inamul Mushofa", "Intrans ubishing");

      Course myCourse = 
         new Course("Ideologi Mahasiswa", myInstructor,
                 myTextBook);

      System.out.println(myCourse);
   }
}