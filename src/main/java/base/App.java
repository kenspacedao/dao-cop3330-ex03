package base;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kenny Dao
 */
public class App 
{
    public static void main( String[] args )

    {
        System.out.print("What is the quote? ");
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();
        System.out.print("Who said it?  ");
        Scanner input2 = new Scanner(System.in);
        String author = input.nextLine();
        System.out.print(author + " says, \"" + quote + "\"");


    }
}
