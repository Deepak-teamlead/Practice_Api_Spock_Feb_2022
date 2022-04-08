package groovypackage
import spock.lang.Specification
// fields -------Instance fields are a good place to store objects belonging to fixture methods
// fixture methods-----similar to @Before or @Before class etc annotations in Junit
// feature methods------here we write actual test
// helper methods
class Practice_Groovyclass extends Specification {
    def "first method"(){
    expect:
    1 == 1
    }
    def "checking max of two values using math.max method"(){
        expect:
        Math.max(1,2)==3
        println("checing println")
    }

    //main method shortcut write psvm and click tab, sytem.out.println shortcut write sout and press tab
    static void main(String[] args) {
        def x=1
        def y=2
        def z=x+y
        println(z)
    }


}
