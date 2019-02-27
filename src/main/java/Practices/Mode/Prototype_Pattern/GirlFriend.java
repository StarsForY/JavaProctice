package Practices.Mode.Prototype_Pattern;
// 1. 首先需要创建一个“女朋友”类
// 定义其属性：比如姓名、年龄、身体、智商等等
// 原型模式需要实现 Cloneable接口，这个接口是一个空接口，里面没有任何需要实现的方法，该接口表示该类能够复制且具体复制的能力
// clone方法是在Object种定义的,而且是protected型的,只有实现了这个接口，才可以在该类的实例上调用clone方法,
// 否则会抛出CloneNotSupportException。
// 然后重写clone() 方法
public class GirlFriend implements Cloneable {
    private String body;    // 身体属性
    private String name;    // 名字
    private String age;     // 年龄
    private String IQ;      // IQ

    // 四个属性的get和set方法
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIQ() {
        return IQ;
    }

    public void setIQ(String IQ) {
        this.IQ = IQ;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "body='" + body + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", IQ='" + IQ + '\'' +
                '}';
    }

    // 这里是浅克隆，书写方式基本一致，
    // 深克隆也差不多，在这个基础上将属性为应用对象的属性进行一次克隆，这些为引用对象的属性也需要实现浅克隆
    public Object clone(){
        GirlFriend new_Girl = null;
        try {
            new_Girl = (GirlFriend) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return new_Girl;
    }
}
