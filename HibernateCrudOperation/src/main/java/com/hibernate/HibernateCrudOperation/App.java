package com.hibernate.HibernateCrudOperation;
import java.util.Scanner;
import com.hibernate.Dao.DAOClass;
public class App 
{
	public static void main( String[] args )
	{
		int choice = 0;
		Scanner scanner=new Scanner(System.in);

		do {
			System.out.println("Enter the choice");
			System.out.println("1.Insert Data");
			System.out.println("2.Delete Data");
			System.out.println("3.Update Data");
			System.out.println("4.Display");
			System.out.println("5.exit");
			choice = scanner.nextInt();

			switch(choice) {
			case 1:DAOClass.insertRecord();
			break;
			case 2:DAOClass.deleteRecord();
			break;
			case 3:DAOClass.updateRecord();
			break;
			case 4:DAOClass.displayRecord();
			break;
			case 5:System.exit(0);
			break;

			}
		}while(choice<5);
	}
}

