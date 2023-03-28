package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class UrlParserTest extends AnyFlatSpec with Matchers {

  "it" should "match with Invalid Url if empty url is passed in UrlParser class" in {
    val urlParserObj = new UrlParser("")
    val result = urlParserObj match {
      case UrlParser(protocol, domain, path) => s"Protocol :$protocol\nDomain :$domain\nPath :$path"
      case _ => "Invalid Url"
    }
    val expectedOutput = "Invalid Url"
    expectedOutput shouldBe result
  }

  "it" should "not match with protocol, domain, url  if empty url is passed in UrlParser class" in {
    val urlParserObj = new UrlParser("")
    val result = urlParserObj match {
      case UrlParser(protocol, domain, path) => s"Protocol :$protocol\nDomain :$domain\nPath :$path"
      case _ => "Invalid Url"
    }
    val expectedOutput = "Protocol: https\nDomain :www.mywebsite.com\nPath :home"
    assert(expectedOutput != result)
  }

  "it" should "match with protocol, domain, path of url if valid string is passed" in {
    val urlParserObj = new UrlParser("https://www.mywebsite.com/home")
    val result = urlParserObj match {
      case UrlParser(protocol, domain, path) => s"Protocol :$protocol\nDomain :$domain\nPath :$path"
      case _ => "Invalid Url"
    }
    val expectedOutput = "Protocol :https\nDomain :www.mywebsite.com\nPath :home"
    expectedOutput shouldBe result
  }

  "it" should "not match with different protocol, domain, path of url " in {
    val urlParserObj = new UrlParser("https://www.mywebsite.com/home")
    val result = urlParserObj match {
      case UrlParser(protocol, domain, path) => s"Protocol :$protocol\nDomain :$domain\nPath :$path"
      case _ => "Invalid Url"
    }
    val expectedOutput = "Protocol :https\nDomain :www.com\nPath :home"
    assert(expectedOutput != result)
  }

  "it" should "match with Invalid Url if any string(not url) is passed to UrlParser class " in {
    val urlParserObj = new UrlParser("httpswww.mywebsite.comhome")
    val result = urlParserObj match {
      case UrlParser(protocol, domain, path) => s"Protocol :$protocol\nDomain :$domain\nPath :$path"
      case _ => "Invalid Url"
    }
    val expectedOutput = "Invalid Url"
    assert(expectedOutput == result)
  }

  "it" should "match with other parts of url  if other part is available" in {
    val urlParserObj = new UrlParser("https://www.google.com/")
    val result = urlParserObj match {
      case UrlParser(protocol, domain, path) => s"Protocol :$protocol\nDomain :$domain\nPath :$path"
      case _ => "Invalid Url"
    }
    val expectedOutput = "Protocol :https\nDomain :www.google.com\nPath :"
    assert(expectedOutput == result)
  }

}

/*
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
