package groovypackage
import spock.lang.Specification
class Practice_spockseries2 extends Specification{
    // In below method we are generating some random number to identify whether we are using same object
    // because whenever object will be initialized it will generate some different random number
    def setup(){

            println new Random().nextInt()
        }

    def adder(a,b){
        a+b
    }




}
