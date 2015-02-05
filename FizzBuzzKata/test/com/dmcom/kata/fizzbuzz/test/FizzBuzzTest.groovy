package com.dmcom.kata.fizzbuzz.test

import groovy.util.GroovyTestCase
import com.dmcom.kata.fizzbuzz.FizzBuzz

class FizzBuzzTest extends GroovyTestCase {
	
	void "testNormalNumbers"() {
		assert "1" == FizzBuzz.checkFizzBuzz(1)
		assert "11" == FizzBuzz.checkFizzBuzz(11)
		assert "101" == FizzBuzz.checkFizzBuzz(101)
	}
	
	void "testFizzNumbers"() {
		assert "Fizz" == FizzBuzz.checkFizzBuzz(3)
		assert "Fizz" == FizzBuzz.checkFizzBuzz(12)
		assert "Fizz" == FizzBuzz.checkFizzBuzz(131)
	}
	
	void "testBuzzNumbers"() {
		assert "Buzz" == FizzBuzz.checkFizzBuzz(5)
		assert "Buzz" == FizzBuzz.checkFizzBuzz(25)
		assert "Buzz" == FizzBuzz.checkFizzBuzz(451)
	}
	
	void "testFizzBuzzNumbers"() {
		assert "FizzBuzz" == FizzBuzz.checkFizzBuzz(15)
		assert "FizzBuzz" == FizzBuzz.checkFizzBuzz(53)
		assert "FizzBuzz" == FizzBuzz.checkFizzBuzz(1351)
	}
	
}
