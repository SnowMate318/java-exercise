package Class.형변환;

public class Exercise {
    public static void main(String[] args) {

        Animal animal = null;

        Human human = new Human();
        Human human2 = null;

        animal = human; // animal = (Animal)human에서 Animal이 생략됨
        animal.eat();
        //animal.think(); -> 컴파일 에러: animal 자동 형변환이 됐기때문에 인간 기능을 쓸 수 없다.

        JiseongPark parkJisung = new JiseongPark();
        //YunaKim kimYuna = (YunaKim)parkJisung -> 컴파일에러: 김연아는 박지성이 될 수 없다. 이런식으로 형변환 안됨

        parkJisung.say();

        if(parkJisung instanceof Human == true) {
            System.out.println("박지성 -> 인간 가능");
        }

        if(animal instanceof Human == true) {
            System.out.println("동물 -> 인간 가능");
        }


        if(animal instanceof YunaKim == false) {
            System.out.println("동물 -> 김연아 불가능(2단진화는 안됨)");
        }

        // parkJisung instanceof YunaKim -> 컴파일에러: 위아래 관계가 아님


    }
}

class Animal {
    String name;
    int age;

    void eat() {
        System.out.println("냠냠냠냠");
    }

}

class Human extends Animal {
    void think() {
        System.out.println("생각즁~");
    }
}

class JiseongPark extends Human {
    void say() {
        System.out.println("나는 박지성이다!");
    }
}

class YunaKim extends Human {
    void say() {
        System.out.println("나는 김연아다");
    }
}
