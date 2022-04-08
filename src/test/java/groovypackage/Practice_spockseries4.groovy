package groovypackage
import spock.lang.Specification
class Practice_spockseries4 extends Specification{
    //Fixture Methods as in spock series video 4
    //def setupSpec() {}    // runs once -  before the first feature method
    //def setup() {}        // runs before every feature method
    //def cleanup() {}      // runs after every feature method
    //def cleanupSpec() {}  // runs once -  after the last feature method
    //

    def setupSpec(){
        println "setupSpec--this runs once before 1st feature method"
    }
    def setup(){
        println "setup()--this runs everytime before every feature method"
    }
    def "feature method one"(){
        given:
        println "this is feature method one"
    }
    def "feature method two"(){
        given:
        println "this is feature method two"
    }
    def cleanup(){
        println "cleanup()--this runs everytime after every feature method"
    }
    def cleanupSpec(){
        println "cleanupSpec()--this runs once after last feature method"
    }
}
