package com.knoldus

class UrlParser(val url: String)

/*Companion Object of Name UrlParser*/
object UrlParser {
  /*
    *This method is used to parser the Url and get the protocol, domain, path of url
    *unapply method invoked automatically when pattern matching is applied
  */
  def unapply(link: UrlParser): Option[(String, String, String)] = {
    val url: String = link.url
    try {
      if (url.isEmpty) throw new NullPointerException("String is Empty")
      else {

        /*To get the protocol from URL*/
        val protocol: String = {
          if (url.contains("://")) {
            val protocolString: String = url.substring(0, url.indexOf("://"))
            protocolString
          }
          else throw new RuntimeException("Invalid url")
        }

        /*To get the domain from URL*/
        val domain: String = {
          if (url.contains("/")) {
            val domainString: String = url.substring(url.indexOf("/") + 2, url.lastIndexOf("/"))
            domainString
          }
          else throw new RuntimeException("Invalid url")
        }

        /*To get the path from URL*/
        val path: String = {
          if (url.contains("/")) {
            val pathString: String = url.substring(url.lastIndexOf("/") + 1)
            pathString
          }
          else throw new RuntimeException("Invalid url")
        }
        Some(protocol, domain, path)
      }
    }
    catch {
      case ex: NullPointerException => None
      case ex: RuntimeException => None
    }
  }
}



