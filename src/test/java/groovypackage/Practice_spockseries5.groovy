package groovypackage

import groovyx.net.http.RESTClient
import spock.lang.Shared
import spock.lang.Specification
class Practice_spockseries5 extends Specification {
    //Blocks as in spock series video 5
    def "two plus two equal to 4"(){
        given:
        int a = 2
        int b = 2
        println "this is given block"
        when:
        int c=a+b
        println "this is when block"
        then:
        c==4
        println "this is then block"
    }

    //Feature methods as in spock series video 6

       def "am hungry"(){
        given:
        println "i go to hotel"
        when:
        println "i order my food"
        then:
        println "i eat my food"
       }





}
