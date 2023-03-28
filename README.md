# session-4-day-2
This assignment contains day 2 assignment Both Assignment-1 & Assignment-2

##Assignment-1
* Step 1: Open IntelliJ and create a new Project of Name assignment-1
* Step 2: Create a UrlParser scala file in src/main/scala/com.knoldus/.
* Step 3: Inside the UrlParser create a class of UrlParser and pass a field of url type String
* Step 4: Create a object of same class name and inside it define the unapply method.
* Step 5: Check url is Empty then throw error and catch or else create substring of protocol, domain and path
* Step 6: Create a main object and inside it create instance of UrlParser class and pass url to it.
* Step 7: Apply the pattern matching. When we start applying pattern matching it will automatically call the unapply method.
 */

/*
Step 8: After that add the scalatest dependencies in build.sbt file.
Step 7: Create a Test Class in src/test/scala/com.knoldus. Inside the test class extend the AnyFlatSpec Class and import the scalatest package in that test class.
Step 8: Inside the test class create instance of Class in each test case with different url .
Step 9: After that apply the pattern match it fetch the protocol, domain, path and check with expected output by assert.
  Step 10: In terminal run the command sbt test it show the result that test case is passed or fail.*/
