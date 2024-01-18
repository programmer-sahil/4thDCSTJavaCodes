class ExceptionTest {
    public void method1(String firstString) {
        System.out.println(firstString);
    }
}

public class ExceptionExample5 {
    public static void main(string[] args) {
try {
    ExceptionTest obj = new ExceptionTest();
    obj.method1("This is the first method");
    obj.method2("This is the missing method");
}
catch(Exception e){
    System.out.println(e.getMessage());
}
    }
}

/*
try the codes with and without TRY-CATCH block
*/

/*
try {
    ExceptionTest obj = new ExceptionTest();
    obj.method1("This is the first method");
    obj.method2("This is the missing method");
}
catch(Exception e){
    System.out.println(e.getMessage());
}
*/        