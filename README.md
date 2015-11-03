# StrassenAlgorithm
- algorithm from http://www.sanfoundry.com/java-program-strassen-algorithm/
- added counters for additions/subtractions and multiplications
- For a 4x4 matrices multiplied by another, the counter gets 198 additions
- For 8x8 times 8x8, counter gets 1674 additions
- For 9x9,add 1674,mult 343,
- For 27x27,add 21690,mult 2401
- sample input included
- Main located in MatrixMultiplicatio.java

# Strassen3By3.java
-The Strassen algorithm works by splitting matrices into 4 sub-matrices recursively, 
- ending with the multiplication of a large number 2x2 matrices. 

-The question is, suppose instead of recursion ending in 2x2 matrices, 
-you ended up with 3x3 matrices 
-(because you split each matrix into 9 instead of 4 sub-matrices). 
-How fast (i.e. how many multiplications) would you need to multiply 3 x 3 matrices to be asymptotically better than -Strassen? 
