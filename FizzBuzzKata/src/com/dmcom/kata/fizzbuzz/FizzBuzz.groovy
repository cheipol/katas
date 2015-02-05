package com.dmcom.kata.fizzbuzz

class FizzBuzz {
	
	private static FIZZ = "Fizz"
	private static BUZZ = "Buzz"
	private static FIZZ_BUZZ_MAP = [Fizz: 3, Buzz : 5]
	
	static main(args) {
		(1..100).each {
			println it + " : " + checkFizzBuzz(it)
		}
	}
		
	static checkFizzBuzz(number) {
		def result = ""
		if (isFizz(number)) result = FIZZ
		if (isBuzz(number)) result += BUZZ
		result?:number.toString()
	}

	private static isFizz(number) {
		number % FIZZ_BUZZ_MAP[FIZZ] == 0 || hasDigit(number, FIZZ_BUZZ_MAP[FIZZ])
	}
	
	private static isBuzz(number) {
		number % FIZZ_BUZZ_MAP[BUZZ] == 0 || hasDigit(number, FIZZ_BUZZ_MAP[BUZZ])
	}
	
	private static hasDigit(number, digit) {
		number?.toString().indexOf(digit.toString()) > -1
	}

}