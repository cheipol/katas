package stringcalculator

class Calculadora {

    static constraints = {
    }

    public static int suma(String numeros){
        int total = 0
        if(!numeros.equals("")){
            if (numeros.startsWith("//")){
                String delimeter = numeros.charAt(2)
                numeros = numeros.substring(3).replaceAll(delimeter,",")
            }
            def num = numeros.split(/\n|,/)
            String listaNeg = ""
            num.length.times{
                if (num[it].startsWith("-")) listaNeg += " " + num[it]
                else total += Integer.parseInt(num[it])
            }
            if (!listaNeg.equals("")) throw new Exception("negatives not allowed" + listaNeg)
        }
        return total
    }
}
