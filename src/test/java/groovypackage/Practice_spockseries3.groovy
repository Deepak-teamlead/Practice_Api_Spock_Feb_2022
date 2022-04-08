package groovypackage
import spock.lang.Shared
import spock.lang.Specification
class Practice_spockseries3 extends Specification{
    // Fields, @Shared, feature methods as in spock series video 3
    @Shared
    def obj1
    @Shared
    def obj2
    def setupSpec(){
        println ("runs once before 1st feature method")

    }
    def "1st feature method"(){
        given:
        obj1=2
        println (obj1)
    }
    def "2nd feature method"(){
        given:
        obj1=3
        println (obj1)
    }







}
