package groovypackage
import spock.lang.Ignore
import org.spockframework.runtime.model.parallel.ExecutionMode
import spock.lang.Execution
import spock.lang.Specification
import spock.lang.Unroll
class Practice_datadriventesting extends Specification {
    //Data driven testing is performed in where block which will be last part of a feature method
    //also look how @unroll works
    //@unroll annotation means every single scenario will be treated as separate test
    //Custom Annotations
    //learn to exclude tests by giving custom annotations names in SpockConfig.groovy
    @Internaluser
    @Unroll
    def "#a + #b should be #expectedsum"() {
        when:
        def sum = a + b
        then:
        sum == expectedsum
        where:
                a | b | expectedsum
                1 | 1 | 2
                2 | 2 | 4
                5 | 5 | 10
    }
    @Excludetest
    def "checking this test is excluded"(){
        expect:
        println  "checking this test is excluded"
    }
}














