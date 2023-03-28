package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.language.postfixOps

class FibonacciNumberTest extends AnyFlatSpec with Matchers {

  val fibonacciObj = new FibonacciNumber

  "it " should "match with first number 0 and second number 1 if first number or second number less than 0 and 1" in {
    val firstNum: Int = -1
    val secondNum: Int = 1
    val nthTerm: Int = 1
    val result = fibonacciObj.checkException(firstNum, secondNum, nthTerm)
    val expectedOutput = "first number should be 0 second number should be 1"
    expectedOutput shouldBe result
  }

  "it " should "match with nth Term must be at least one" in {
    val firstNum: Int = 0
    val secondNum: Int = 1
    val nthTerm: Int = 0
    val result = fibonacciObj.checkException(firstNum, secondNum, nthTerm)
    val expectedOutput = "At least Nth Term must starts with One."
    assert(expectedOutput == result)
  }

  "it " should "match with 10th term fibonacci number" in {
    val firstNum: Int = 0
    val secondNum: Int = 1
    val nthTerm: Int = 10
    val result: Int = fibonacciObj.checkException(firstNum, secondNum, nthTerm).toInt
    val expectedOutput: Int = 55
    expectedOutput shouldBe result
  }

  "it " should "not match with other number or term of fibonacci number" in {
    val firstNum: Int = 0
    val secondNum: Int = 1
    val nthTerm: Int = 10
    val result: Int = fibonacciObj.checkException(firstNum, secondNum, nthTerm).toInt
    val expectedOutput: Int = 51
    assert(expectedOutput != result)
  }

  "it " should "match with 60th term fibonacci number" in {
    val firstNum: Int = 0
    val secondNum: Int = 1
    val nthTerm: Int = 60
    val result: Int = fibonacciObj.checkException(firstNum, secondNum, nthTerm).toInt
    val expectedOutput: Int = 1820529360
    expectedOutput shouldBe result
  }

  "it " should "match with secondNum if nthTerm is 1 or First" in {
    val firstNum: Int = 0
    val secondNum: Int = 1
    val nthTerm: Int = 1
    val result: Int = fibonacciObj.checkException(firstNum, secondNum, nthTerm).toInt
    val expectedOutput: Int = 1
    expectedOutput shouldBe result
  }

}

