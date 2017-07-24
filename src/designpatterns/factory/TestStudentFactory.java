/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.factory;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TestStudentFactory {
    
    public static void main(String[] args) {
        StudentFactory studentFactory = new StudentFactory();
        Student myStudent = null;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter R or S or N");
        if (input.hasNextLine())
        {
      String name =  input.nextLine();
      myStudent = studentFactory.createStudent(name);   
            System.out.println(myStudent );

    }
        
    }
    
}
