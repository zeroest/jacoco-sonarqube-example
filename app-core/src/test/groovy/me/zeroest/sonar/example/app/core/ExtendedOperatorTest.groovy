package me.zeroest.sonar.example.app.core

import spock.lang.Specification

class ExtendedOperatorTest extends Specification {
    def "Apply"() {
        given:
        def x = 1
        def y = 2

        when:
        def apply = ExtendedOperator.apply(Operation.TIMES, x, y)

        then:
        apply.equals(x * y)
    }
}
