/*
Object oriented programming Lab 2 question 3

Complete the main method in the PrintNumbers class by using a for loop to print the values from 1 to 10 on separate lines of the console
For example:
Test	Result
PrintNumbers.main(new String[]{})	1
2
3
4
5
6
7
8
9
10

Starter code
public class PrintNumbers
{
    public static void main(String[] args)
    {
       
    }
}
*/
public class PrintNumbers
{
	public static void main(String[] args)
	{
		for (int i = 1; i<= 10; i++) //interate from 1 up to 10
		{
			System.out.println(i); //print i
		}
	}
}
