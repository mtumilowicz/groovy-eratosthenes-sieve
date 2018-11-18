/**
 * Created by mtumilowicz on 2018-11-18.
 */
class Sieve {
    static def get(n) {
        def t = 2..n
        (2..Math.sqrt(n)).each { k -> t -= ((2*k)..(t.last()+1)).step(k) }
        return t
    }
}
