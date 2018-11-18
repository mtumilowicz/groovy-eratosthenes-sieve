/**
 * Created by mtumilowicz on 2018-11-18.
 */
class Sieve {
    static def get(max) {
        def sieve = 2..max
        (2..Math.sqrt(max)).each { k -> sieve -= ((2*k)..(sieve.last()+1)).step(k) }
        return sieve
    }
}
