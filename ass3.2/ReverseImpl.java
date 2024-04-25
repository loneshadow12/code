import ReverseModule.ReversePOA;

class ReverseImpl extends ReversePOA {
    ReverseImpl() {
        super();
        System.out.println("Reverse Object Created");
    }

    public String reverse_string(String name) {
        return "Server Send " + name.toUpperCase();
    }
}
// idlj -fall ReverseModule.idl
// javac *.java ReverseModule/*.java
// orbd -ORBInitialPort 1056
// java ReverseServer -ORBInitialPort 1056