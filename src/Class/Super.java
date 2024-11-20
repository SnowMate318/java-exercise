package Class;

public class Super {

    public static void main(String[] args) {
        Child c = new Child(3,5,7,9); // super 생성자 실습

        c.printParentX();
        c.printChildX();
        c.printParentY();
        c.printChildY();

        c.printABCD();
    }

}

class Parent {

    int x = 20; // default 이상의 범위의 접근제어자를 설정해야함
    int y = 30;
    int a,b,c;

    public Parent(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


}

class Child extends Parent {
    int x = 10;

    int d;

    Child(int a, int b, int c, int d) {
        super(a,b,c); // parent 생성자 실행
        this.d = d;
    }

    public void printParentX() {
        System.out.println("super.x: "+super.x); // Parent 클래스의 x값
    }

    public void printChildX() {
        System.out.println("this.x: "+this.x); // Child 클래스의 x값
    }

    public void printParentY() {
        System.out.println("super.y: "+super.y); // Parent 클래스의 y값
    }

    public void printChildY() {
        System.out.println("this.y: "+this.y); // Child 클래스의 y값 (y값이 없으므로 부모 값 가져옴)
    }

    public void printABCD() {
        System.out.println("a= "+a+" b= "+b+" c= "+c+" d= "+d);
    }
}