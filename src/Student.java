/*
Application Purpose: creates a class that check if the info is true
Author: Illia Kucheruk
Date:31.02.2021
Time: 2:09
 */
public class Student {
    //create a private varibles
    private String first_name;
    private String last_name;
    private int student_number;
    //create a constructor
    public Student(String first_name, String last_name, int student_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.student_number = student_number;
    }
    //cheking if our first name is written without blanks and more then 2 characters
    public String getFirst_name() {
        first_name = first_name.toUpperCase();//make it in UpperCase
        int first_number = first_name.length();//translate to String
        if(first_name.contains(" ")||(first_number<=2)){
            System.out.println("Enter your real first name!");
        }
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    //cheking if our last name is written without blanks and more then 2 characters
    public String getLast_name() {
        last_name = last_name.toUpperCase();//make it in UpperCase
        int last_number = last_name.length();//translate to String
        if(last_name.contains(" ")||((last_number<=2))){
            System.out.println("Enter your real last name!");
        }
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    //cheking if student number is 9 digits
    public int getStudent_number() {
        int numb_length = String.valueOf(student_number).length();
        if(numb_length!=9){
            System.out.println("Enter your real student number!");
        }
        return student_number;
    }

    public void setStudent_number(int student_number) {
        this.student_number = student_number;
    }
}