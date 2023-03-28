package com.knoldus

import scala.io.StdIn.readLine

/* Main object that read the user input and print the result */
object Main extends App {
  private val fibonacciObj = new FibonacciNumber
  private val firstNum: Int = readLine("Enter First Number :").toInt
  private val secondNum: Int = readLine("Enter Second Number :").toInt
  private val nthTerm: Int = readLine("Enter NthTerm Number :").toInt

  private val resultOfFibonacci = fibonacciObj.checkException(firstNum, secondNum, nthTerm)
  println(resultOfFibonacci)

}
