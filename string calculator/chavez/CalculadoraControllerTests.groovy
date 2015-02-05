package stringcalculator

import grails.test.*

class CalculadoraControllerTests extends ControllerUnitTestCase {


    public void testSuma() {
        try{
            assertEquals(8, Calculadora.suma("3,5"))
            assertEquals(8, Calculadora.suma("8"))
            assertEquals(0, Calculadora.suma(""))
            assertEquals(29, Calculadora.suma("4,6,10,9"))
            assertEquals(29, Calculadora.suma("20\n9"))
            assertEquals(29, Calculadora.suma("4\n6,10,9"))
            assertEquals(1, Calculadora.suma("1,\n"))
            assertEquals(29, Calculadora.suma("//;4\n6,10,9"))
            assertEquals(29, Calculadora.suma("//;4\n6,10;9"))
            assertEquals(29, Calculadora.suma("//;4\n6,-10;-9"))
        }catch(Exception e){
            assertEquals(e.message, "negatives not allowed -10 -9")
        }
    }

}
