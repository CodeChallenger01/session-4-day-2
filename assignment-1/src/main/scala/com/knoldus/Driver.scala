package com.knoldus

/*Singleton Object used to print the result inside it*/
object Driver extends App {
  private val url = new UrlParser("https://www.mywebsite.com/home")
  private val result = url match {
    case UrlParser(protocol, domain, path) => s"Protocol :$protocol\nDomain :$domain\nPath :$path"
    case _ => "Invalid Url"
  }
  println(result)
}