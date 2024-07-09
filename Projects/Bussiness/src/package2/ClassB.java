package package2;

public class ClassB {
    public void publicMethod() {
        System.out.println("This is a public method");
    }
    private void privateMethod(){
        System.out.println("This is the private method for class B");
    }
    protected void protectedMethod(){
        System.out.println("This is the protected method of class B");
    }
    void packageProtected() {
        System.out.println("This is the package protected method of class B");
    }
}
