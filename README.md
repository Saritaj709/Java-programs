# program1
1. Write a program “ PrintThreeNames.java ” that takes three names as input and
prints out a proper sentence with the names in the reverse of the order given, so
that for example, " java PrintThreeNames Alice Bob Carol " gives "Hi Carol, Bob,
and Alice.".
2. Write a IntOpt.java program by taking a, b and c as input values and print the
following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please
also understand the precedence of the operators.
3. Similarly write the DoubleOpt.java program by taking double value and doing the
same operations.
4. Write a LeapYear.java program that takes a year as input and outputs the Year is
a Leap Year or not a Leap Year.
The LeapYear program only works for year >= 1582, corresponding to a year in
the Gregorian calendar. So ensure to check for the same. Further the Leap Year
is a Year divisible by 4 and not 100 unless it is divisible by 400. For e.g. 1800 is
not a Leap Year and 2000 is a Leap Year.
5. Write a program SpringSeason.java that takes two int values m and d from the
command line and prints true if day d of month m is between March 20 (m = 3, d
=20) and June 20 (m = 6, d = 20), false otherwise.
6. Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can be found using a formula
delta = b*b ­ 4*a*c
Root 1 of x = (­b + sqrt(delta))/(2*a)
Root 2 of x = (­b ­ sqrt(delta))/(2*a)
Take a, b and c as input values to find the roots of x.
7. Write a program Distance.java that takes two integer command­line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
8. Write a program SumOfTwoDice.java that prints the sum of two random integers
between 1 and 6 (such as you might get when rolling dice).
Write a program Stats5.java that prints five uniform random values between 0 and 1,
their average value, and their minimum and maximum value. Use Math.random(),
Math.min(), and Math.max().
9. Write a program WindChill.java that takes two double command­line arguments t
and v and prints the wind chill. Use Math.pow(a, b) to compute ab.
Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour),
the National Weather Service defines the effective temperature (the wind chill) to
be:

Note : the formula is not valid if t is larger than 50 in absolute value or if v is larger
than 120 or less than 3 (you may assume that the values you get are in that range).
10. Write a program DayOfWeek.java that takes a date as input and prints the day of
the week that date falls on. Your program should take three command­line
arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February,
and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth.
Use the following formulas, for the Gregorian calendar (where / denotes integer
division):
y0 = y − (14 − m) / 12
x = y0 + y0
/4 − y0
/100 + y0
/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0

/ 12) mod 7

11. Write a TemperaturConversion.java program, given the temperature in fahrenheit
as input outputs the temperature in Celsius or viceversa using the formula
Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
Fahrenheit to Celsius: (°F − 32) x 5/9 = °C
