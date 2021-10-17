This challenge is a reduce problem that can be solved by iterating from the back, without saving the strings for optimal solution.

 Using the examples given, 
the total length of string can be found by calculating from 
outside to inside as below.

eg :  
chaka2stocks3,
we have 4 characters before a number and another 5 characters before the next number.

 therefore length = ((4* firstNumber)+ 5) * LastNumber)
 
with this length given, we will work backwards to the index we are to find.