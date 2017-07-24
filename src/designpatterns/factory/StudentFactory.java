/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.factory;

/**
 *
 * @author User
 */
public class StudentFactory {
     
    public Student createStudent(String name)
    {
     if (name.equals("R"))
     {
         
      return   new SastraCollegeStudent();
     }
     else if (name.equals("N"))
     {
     return new VasaviCollegeStudent();
     }
     else if (name.equals("S")) {
       return new SrmCollegeStudent();
     }
         return null;  
    }
}
