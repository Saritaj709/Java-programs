/*11. Write a TemperaturConversion.java program, given the temperature in fahrenheit
as input outputs the temperature in Celsius or viceversa using the formula
Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
Fahrenheit to Celsius: (°F − 32) x 5/9 = °C */

class TemperatureConversion
{
public static void main(String[] args)
{
double C,F;
C=Double.parseDouble(args[0]);
F=Double.parseDouble(args[1]);
double CTF=(C*9/5)+32;
double FTC=(F-32)*5/9;
System.out.println("Celsius to Fahrenheit" +CTF);
System.out.println("Fahrenheit to Celsius" +FTC);
}
}

