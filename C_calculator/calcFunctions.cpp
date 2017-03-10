/*
 * calcFunctions.cpp
 *
 *  Created on: Mar 10, 2017
 *      Author: Jason
 */
#include <iostream>
#include "functions.h"
using std::cout; using std::cin; using std::endl;


int main()
{
	int choice = 0;
	int sum;
	while (choice != 9)
	{
		cout<< "\nPlease enter a number 1 through 9."<<endl;
		cout<< "1. addition"<< endl;
		cout<< "2. subtraction"<<endl;
		cout<< "3. multiplcation"<<endl;
		cout<< "4. division"<<endl;
		cout<< "5. sum of squares"<<endl;
		cout<< "6. square"<<endl;
		cout<< "7. power of"<<endl;
		cout<< "8. sum total up to n"<<endl;
		cout<< "9. exit"<<endl;
		cin>> choice;

		if (choice == 1)
		{
			sum = add();
			cout<< sum<<endl;
		}
		else if (choice == 2)
		{
			sum = subtract();
			cout<< sum<<endl;
		}
		else if (choice == 3)
		{
			sum = multiply();
			cout<< sum<<endl;
		}
		else if (choice == 4)
		{
			sum = divide();
			cout<< sum<<endl;
		}
		else if (choice == 5)
		{
			sum = sumSquares();
			cout<< sum<<endl;
		}
		else if (choice == 6)
		{
			sum = square();
			cout<< sum<<endl;
		}
		else if (choice == 7)
		{
			sum = powOf();
			cout<< sum<<endl;
		}
		else if (choice == 8)
		{
			sum = sumTorial();
			cout<< sum<<endl;
		}
		else if (choice == 9)
		{
			break;
		}
		else
		{
			break;
		}
	}
	return 0;
}
