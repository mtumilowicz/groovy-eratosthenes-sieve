import spock.lang.Specification


/**
 * Created by mtumilowicz on 2018-11-18.
 */
class OperationsTest extends Specification {
    def "range operator 1..10 as IntRange"() {
        expect:
        1..10 == new IntRange(1, 10)
    }

    def "range operator 1..10 as integer List"() {
        expect:
        1..10 instanceof List<Integer>
    }

    def "range operator 1..3 is equal to List"() {
        expect:
        1..3 == [1, 2, 3]
    }
    
    def "range operator 10..8"() {
        expect:
        10..8 == [10, 9, 8]
    }

    def "range operator 10..sqrt(17) is Range<Double>"() {
        expect:
        5..Math.sqrt(40) instanceof Range<Double>
    }

    def "range operator 10..sqrt(17) is equal to int list"() {
        expect:
        5..Math.sqrt(40) == [5, 6]
    }
    
}