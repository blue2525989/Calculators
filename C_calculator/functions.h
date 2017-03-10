/*
 * functions.h
 *
 *  Created on: Mar 10, 2017
 *      Author: Jason
 */
#include <iostream>
using std::cout; using std::cin; using std::endl;

#ifndef FUNCTIONS_H_
#define FUNCTIONS_H_


int sumSquares()
{
	int n = 0;
	cout<< "enter a number"<<endl;
	cin>> n;
	int sum = 0;
	while (n > 0)
	{
		sum += n * n;
		n--;
	}
	return sum;
}

int add()
{
	int x;
	int y;
	cout<< "enter a number"<<endl;
	cin>> x;
	cout<< "enter a number"<<endl;
	cin>> y;
	int sum = 0;
	sum = x + y;
	return sum;
}

int subtract()
{
	int x;
	int y;
	cout<< "enter a number"<<endl;
	cin>> x;
	cout<< "enter a number"<<endl;
	cin>> y;
	int sum = 0;
	sum = x - y;
	return sum;
}

int multiply()
{
	int x;
	int y;
	cout<< "enter a number"<<endl;
	cin>> x;
	cout<< "enter a number"<<endl;
	cin>> y;
	int sum = 0;
	sum = x * y;
	return sum;
}

int divide()
{
	int x;
	int y;
	cout<< "enter a number"<<endl;
	cin>> x;
	cout<< "enter a number"<<endl;
	cin>> y;
	int sum = 0;
	sum = x / y;
	return sum;
}

int square()
{
	int x;
	int y;
	cout<< "enter a number"<<endl;
	cin>> x;
	cout<< "enter a number"<<endl;
	cin>> y;
	int sum = 0;
	sum = x * x;
	return sum;
}

int powOf()
{
	int x;
	int y;
	cout<< "enter a number"<<endl;
	cin>> x;
	cout<< "enter a number"<<endl;
	cin>> y;
	int sum = 0;
	for (int z = 0; z <= y; z++)
	{
		sum += (x * x);
	}
	return sum;
}

int sumTorial()
{
	int x;
	cout<< "enter a number"<<endl;
	cin>> x;
	int sum = 0;
	for (int y = 0; y <= x; y++) {
		sum += (x + y);
	}
	return sum;
}



#endif /* FUNCTIONS_H_ */
