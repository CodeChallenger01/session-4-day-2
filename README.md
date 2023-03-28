# session-4-day-2(BOTH ASSIGNMENT)
This assignment **contains** day 2 assignment **Both** **Assignment-1** & **Assignment-2**

## Assignment-1    
**Step 1:** Open IntelliJ and create a new Project of Name **assignment-1**    
**Step 2:** Create a **UrlParser** scala file in **src/main/scala/com.knoldus/**.   
**Step 3:** Inside the UrlParser create a **class of UrlParser** and pass a **field of url** type **String**  
**Step 4:** Create a **object of same class name** and inside it define the **unapply method**.  
**Step 5:** Check **url is Empty then throw error** and catch or else create substring of **protocol, domain and path **  
**Step 6:** Create a **main object in Driver** scala file and inside it create instance of UrlParser class and pass url to it.   
**Step 7:** Apply the **pattern matching.** When we start applying pattern matching it will **automatically call the unapply method. **  
**Step 8:** After that add the **scalatest dependencies** in build.sbt file.   
**Step 9:** Create a Test Class in **src/test/scala/com.knoldus**. Inside the test class extend the AnyFlatSpec with Matchers Class and import the scalatest package in that test class.   
**Step 10:** Inside the test class **create instance of Class** in each test case with different url         
**Step 11:** After that apply the pattern match it fetch the protocol, domain, path and check with expected output by assert.   
**Step 12:** In terminal run the command **sbt test** it show the result that test case is passed or fail.

**OUTPUT**
**sbt compile and sbt run**
![Screenshot from 2023-03-28 21-04-12](https://user-images.githubusercontent.com/124979629/228310627-ed4b41a4-2187-42fa-a4da-e64508c107e8.png)
**sbt test**
![Screenshot from 2023-03-28 21-04-23](https://user-images.githubusercontent.com/124979629/228310698-e8c31bc5-377c-4a37-b3ad-b1f1f2250286.png)


## Assignment-2    
**Step 1:** Open IntelliJ and create a new Project of Name **assignment-2**     
**Step 2:** Create a Scala file of name **FibonacciNumber** by moving in structure **assignment-2/src/main/scala/com.knoldus**     
**Step 3:** Inside the Scala File **create a class** of Name **FibonacciNumber**.      
**Step 4:** Define a method of name **fibonacciNumber** that takes **three parameter firstNum, secondNum and nthTerm**      
           Apply if condition if **nthTerm less than equal to 1** then it return secondNum else **call the same method** and pass the parameter in first              field as secondNum, in second part pass sum of first and secondNum and in third part decrease the nth Term.**           
**Step 5:** Create a c**heckException method in same class** and pass all the three number and use **try catch block** if exception found handle it through catch **else call fibonacciNumber** method to get the result.
  *Use try catch exception handling if firstNUm<0 or secondNum<=0 or firstNum>=SecondNum then throw error and remove it through catch exception
 *Else call the fibonacci Number and pass three parameter to it and print the result       
**Step 6:** Create another Driver class and inside it create Singleton Object and create instance of **FibonacciNumber** and **read the FirstNUm, secondNum and nthTerm**         
**Step 7:** After that add the **scalatest dependencies** in build.sbt file.    
**Step 8:** Create a Test Class in **src/test/scala/com.knoldus**. Inside the test class extend the **AnyFlatSpec with Matchers** Class and import the scalatest package in that test class.      
**Step 9:** Inside the test class create instance of Class.       
**Step 10:** After that call the checkException method and in assert compare the actual value with output return by checkException method with both == or !=.        
**Step 11:** In terminal run the command sbt test it show the result that test case is passed or fail.
    
**OUTPUT**
**sbt compile & sbt run**
![Screenshot from 2023-03-28 22-29-19](https://user-images.githubusercontent.com/124979629/228313950-af952fd1-b6fe-4e50-80a2-8b6521352b13.png)
**sbt test**
![Screenshot from 2023-03-28 22-29-35](https://user-images.githubusercontent.com/124979629/228314014-c9fe6a4e-0151-4b40-983c-3854e1b7895e.png)
