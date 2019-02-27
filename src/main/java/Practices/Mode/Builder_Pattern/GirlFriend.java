package Practices.Mode.Builder_Pattern;
// 1. 首先需要创建一个“女朋友”类
// 定义其属性：比如姓名、年龄、身体、智商等等
// 为了说明建造者模式的作用，勉强定义这样一个规则：定义“女朋友”姓名、年龄和智商之前，先得让“女朋友出生”
public class GirlFriend {
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
}
