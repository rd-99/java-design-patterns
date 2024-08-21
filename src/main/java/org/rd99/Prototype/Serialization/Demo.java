package org.rd99.Prototype.Serialization;
import org.apache.commons.lang3.SerializationUtils;
import java.io.Serializable;

class Foo implements Serializable {
    public int stuff;
    public String whatever;

    public Foo(int stuff, String whatever) {
        this.stuff = stuff;
        this.whatever = whatever;
    }

    @Override
    public String toString(){
        return "Foo{" + "stuff=" + stuff + " , whatever = '" + whatever + '\'' + '}' ;
    }
}
class Demo{
    public static void main(String[] args){
        Foo foo = new Foo(5 , "hello");
        System.out.println(foo);
        Foo foo2 = SerializationUtils.roundtrip(foo);
        foo2.whatever = "world";
        System.out.println(foo2);   
    
    }
}
