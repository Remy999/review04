package animal;

public class animal {
 private String name;
 private int age;

 public animal(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public void say() {
     System.out.println(name + "です。" + age + "歳です。");
 }
}
