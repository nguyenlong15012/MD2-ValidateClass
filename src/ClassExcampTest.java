public class ClassExcampTest {
    private static ClassExample classExample;
    public static final String[] validClass = new String[] {"C0222G","A0123I","P5486M","A0000L"};
    public static final String[] invalidClass = new String[] {"B1534C","P5113J","Tasdas","00000M"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String lop : validClass){
            boolean isvalid = classExample.validate(lop);
            System.out.println("Class is " + lop + " is valid: " +isvalid);
        }

        for (String lop : invalidClass){
            boolean isvalid = classExample.validate(lop);
            System.out.println("Class is " + lop + " is valid: " + isvalid);
        }
    }
}
