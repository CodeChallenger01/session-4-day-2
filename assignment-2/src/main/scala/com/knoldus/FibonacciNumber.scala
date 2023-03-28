package com.knoldus

import scala.annotation.tailrec

/* A class for Fibonacci Number */
class FibonacciNumber {

  /* This fibonacci Method is used to find the fibonacci number of the nth term by Tail Recursion */
  @tailrec
  private final def fibonacciNumber(firstNum: Int, secondNum: Int, nthTerm: Int): Int = {
    if (nthTerm <= 1) secondNum
    else fibonacciNumber(secondNum, firstNum + secondNum, nthTerm - 1)
  }

  /* Checking the Exception that can rise while finding the fibonacci of nth Terms*/
  def checkException(firstNum: Int, secondNum: Int, nthTerm: Int): String = {
    try {
      if (firstNum < 0 || secondNum <= 0 || firstNum >= secondNum) throw new NoSuchElementException("first number should be 0 second number should be 1")
      else if (nthTerm < 1) throw new ArithmeticException("Term starts with One")
      else {
        /* If exception doesn't found it will call the fibonacciNumber method and store the value in result*/
        val result: Int = fibonacciNumber(firstNum, secondNum, nthTerm)
        result.toString
      }
    }
    catch {
      case ex: NoSuchElementException => s"first number should be 0 second number should be 1"
      case ex: ArithmeticException => s"At least Nth Term must starts with One."
    }
  }
}


