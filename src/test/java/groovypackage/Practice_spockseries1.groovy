package groovypackage
import spock.lang.Shared
import spock.lang.Specification
// fields -------Instance fields are a good place to store objects belonging to fixture methods
// fixture methods-----similar to @Before or @Before class etc annotations in Junit
// feature methods------here we write actual test
// helper methods
class Practice_spockseries1 extends Specification{
 //creating first method as in spock series video 1
    def "checking max of 2 numbers using Math.max"(){
        expect:
        Math.max(1,2) ==2
        println ("checking first method")
    }
// Fields, @Shared, feature methods as in spock series video 3

    @Shared def obj=new Practice_spockseries2()
    def "feature method 1"(){
        given:
        println(obj)
    }
    def "feature method 2"(){
        given:
        println(obj)
    }



}
