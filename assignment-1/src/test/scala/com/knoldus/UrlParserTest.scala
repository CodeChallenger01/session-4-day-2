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

