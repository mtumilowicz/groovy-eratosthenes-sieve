import spock.lang.Specification

/**
 * Created by mtumilowicz on 2018-11-18.
 */
class SieveTest extends Specification {
    
    def "10"() {
        expect:
        Sieve.get(10) == [2, 3, 5, 7]
    }

    def "2"() {
        expect:
        Sieve.get(2) == [2]
    }

    def "3"() {
        expect:
        Sieve.get(3) == [2, 3]
    }

    def "13"() {
        expect:
        Sieve.get(13) == [2, 3, 5, 7, 11, 13]
    }
}
