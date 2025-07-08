package day03;

public class Keywords {
	/*
	 * Below are the list of 71 reserved words
=========================================
01. Package creation and usage (2)
	01. package
	02. import
02. Class creation (3)
	03. class
	04. interface
	05. enum (1.5)
03. Data types and Return types (8 + 1)
	06. byte 
	07. short 
	08. int 
	09. long 

	10. float
	11. double

	12. char
	13. boolean

	14. void
04. Memory allocation (2)
	    static
	15. new
05. Control flow statements (11)
     01. Conditional or Decision Making (5)
     	16. if
	17. else

	18. switch
	19. case
	20. default

     02. Loop or Iterative (3)
     	21. while
	22. do
	23. for

     03. Transfer or Branching (3) 
     	24. break
	25. continue
	26. return 
06. Accessibility Modifiers (4)
	27. private 
	    <default>/<package-private>
	28. protected
	29. public
07. Execution level Modifiers (8)
	30. static	34. transient
	31. final	35. volatile	
	32. abstract	36. synchronized
	33. native	37. strictfp (1.2v) (17v*)
08. Establishing inheritance relationship (2)
	38. extends
	39. implements
09. Represnting object and its members (3)
	40. this
	41. super
	42. instanceof
10. Exception Handling statements (5 + 1)
	43. throw
	44. throws 

	45. try
	46. catch
	47. finally

	48. assert (1.4v)
11. Unimplemented keywords (2)
	49. goto
	50. const
12. Java 9v new keyword (1)
	51. _ (Underscore)

13. Default/Reserved literals (3)
      -boolean literals(2)
	52. true
	53. false

      - Null literal (1)
	54. null

14. Java 9v Restricted keywords (10)
	55. module
	
	 56. requires 	
	 57. transitive

	 58. exports
	 59. open	
	 60. opens
	 61. to 

	 62. provides	
	 63. with

	 64. uses

15. Special Identifiers or Restricted Identifiers (7)
	65. var			(Java 10)	

				  Preview        Permanent
	66. yield		(Java 13 ->-----> Java 14)
	67. record		(Java 14 -> 15 -> Java 16)

	68. sealed		(Java 15 -> 16 -> Java 17)
	69. non-sealed		(Java 15 -> 16 -> Java 17)
	70. permits		(Java 15 -> 16 -> Java 17)

	71. when		(Java 19 -> 20 -> Java 21)
		

    - all above 7 words are not either reserved words or not keywords,
      they are just identifiers (means names), special identifiers or 
      reserved identifiers

    - It means we can use those 7 words as our userdefined identidiers
      for providing name to our class, variable and method

    - These words are called reserved identifiers, becasue
      they have special meaning in some places in the program

	For example:	
		- The identifier 'var' has special meaning 
		  if we use it in place of data type
		
		- we can also write 
		        int a = 10; as
			var a = 10; 

		  here 'var' has speical meanning
		  here var is considered as a data type

		- int var = 10;
			here var is just name of the variable
			it does not have any meaning
		this is the reason it is called special identifier

Conlusion on keywords, reserved words and identifiers
=====================================================
- Every keyword is a reserved word, but every reserved word is not a keyword
	for example:
		- The word 'public' is a reserved word and also keyword  
		- The word 'null' is just a reserved word and but not keyword  

- The reserved word that performs some operation in the java file 
  is called keyword, else it is just called reserved word.
  	For example:
		- The word 'public' provides set access permissions 
		  so it is a keyword

		- The word 'null' does not perform any operation,
		  it just represents a value, so it is not a keyword
		  it is just a reserved word.

- In Java totally we have 71 reserved words
  they are divided into 4 catogaries
	1. keywords (51)
	2. 3  are reseved iterals
	2. 10 are restricted keywords
	3. 7  are reserved identifiers

- Identify valid literals from the below list

	 * 
	 * 
	 */

}
