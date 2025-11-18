/*
1. Identifier can contain only
    letters, digits,SCs
      a-z     0-9     $ _
      A-Z

2. Identifier can not starts with a digit, a digit can used from second character onwrds

3. Identifer can not contains special characters other than $ and _

4. Identfier can not have space in between words. if need use space, connect them by using _. Hence _ is called connector symbol

5. Identifier is case sensitive (a!=A)

6. We can not use keywords or reserved words identifiers. But we can use predefined classname, variable name, methods names as user defiend identifiers, because they can differentiated by using package name and class name.

7. From Java 9v onwards we can not use single '_' 
   as identifier, because from java 9v onwards 
   it is a keyword

Note: Like in C language, in Java there is no limitation on identifier length
      we can use any number of characters, but it is not recommanded, because
	  it different to remember and access.

//Below program show all above rules
*/


class Example {
//Rule #1:
    int a = 10;
    int a1 = 20;
    int a1_$ = 30;

//Rule #2: 	       
   //int 1a = 40;
   int a1b = 40;
   int ab1 = 40;
   int _ab1 = 40;
   int $ab1 = 40;
   //int 1 = 10;	
   int _1 = 10;	

//Rule #3:
  //int a@b = 20;
  //int a#b = 20;
  int a_b = 20;
  int a$b = 20;

//Rule #4:
   //int number of students = 10;
   int numberofstudents = 10;
   int number_of_students = 10;
   int numberOfStudents = 10;
   //int account number = 10;
   int account_number = 10;
   int accountNumber = 10;

//Rule #5:
   int balance = 10;
   int Balance = 20;

//Rule #6: 
   //int static = 10;
   int _static = 10;
   int static1 = 10;
   int Static = 10;

   int System = 10; 
   int String = 10; 
   int out = 10; 

//Rule #7:
   int p = 10;
   //int 2 = 10;
   int $ = 20;
   //int _ = 30;
   int _2 = 40;	
   int _a = 40;
   int _$ = 40;

   int __ = 50;	

   int asdfsdfasfasdfwerwqersdfsadfwersservferasddfw21424124124sfsar32412ddq4tsfsfdr4ersfstg5412ffqwqsdfqrqrq42 = 40;	

}
