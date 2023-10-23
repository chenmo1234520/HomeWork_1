class Father {
  String name;
  int age;

  public Father() {

  }

  public Father(String name, int age) {
    this.name = name;
    this.age = age;

  }

  void Read() {
    System.out.println(name + "读书");

  }
}

class Son extends Father {
  String name;
  int age;

  public Son() {
    super();
  }

  public Son(String name, int age) {
    super("ls", 20);
    this.name = name;
    this.age = age;

  }

  void Read() {
    System.out.println(super.age + "" + super.name + "督导" + this.age + "" + this.name + "读书");

  }
}

public class test {
  public static void main(String[] args) {
    Father f = new Father();
    f.Read();
    Son s = new Son("zw", 19);

    s.Read();
  }
}
