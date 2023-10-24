
class Teacher {
    String name;
    int age;

    public Teacher() {
        setAge(25);
        setName("张三");
    }

    public Teacher(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void Teach() {
        System.out.println(this.age + "岁的" + this.name + "已经开始教学");
    }

    void Study() {
        System.out.println(name + "开始背教案！");

    }

}

class Student extends Teacher {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
        this.setName("赵六");
        super.setName("张三");
    }

    public Student(String name, int age) {
        super("张三", 25);
        this.name = name;
        this.age = age;
    }

    void Read() {

        System.out.println(this.name + "开始阅读了");

    }

    void Study() {

        System.out.println(this.name + "在" + super.name + "的教导下开始学习了");

    }

    void Teach() {
        System.out.println(this.name + "开始跟同学讨论问题！");

    }
}

public class HelloWorld {

    public static void main(String[] args) {
        // System.out.println("这是我第一个java程序");

        Teacher te = new Teacher();
        te.Teach();
        te.Study();
        Teacher te2 = new Teacher("李四", 19);
        te2.Teach();
        te2.Study();

        Student st = new Student();
        st.Read();
        st.Teach();
        st.Study();
        Student st2 = new Student("王五", 16);

        st2.Teach();
        st2.Study();

    }
}
