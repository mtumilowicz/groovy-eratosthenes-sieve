# groovy-eratosthenes-sieve
Implementation of eratosthenes sieve in Groovy.

_Reference_: https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes  
_Reference_: http://docs.groovy-lang.org/latest/html/documentation/#_range_operator

# preface
In mathematics, the sieve of Eratosthenes is a simple, ancient 
algorithm for finding all prime numbers up to any given limit.

For more info take a look at reference.

# project description
Used groovy features (examples in `OperationsTest`):
* range operator `..`
    ```
    expect:
    5..Math.sqrt(40) == [5, 6]    
    ```
* overloaded `-` on lists
    ```
    
    ```