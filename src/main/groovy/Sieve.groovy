/**
 * Created by mtumilowicz on 2018-11-18.
 */
class Sieve {
    static def get(limit) {
        def sieve = 2..limit
        (2..Math.sqrt(limit)).each { k -> sieve -= ((2*k)..(sieve.last()+1)).step(k) }
        return sieve
    }
}
