package Practices.Mode.Composite_Pattern;
// 2. 测试
// 组合模式就两个类，没有像之前的要定义接口和抽象类啥的
public class test_main {
    public static void main(String[] args) {
        // 先定义好班长、副班长、普通学生
        Student squad_leader = new Student("小明","班长");
        Student deputy_squad_leader = new Student("小红", "副班长");
        Student student = new Student("张三", "none");
        Student student2 = new Student("李四", "none");
        Student student3 = new Student("王五", "none");

        // 进行组合，副班长管理普通学员
        deputy_squad_leader.add_student(student);
        deputy_squad_leader.add_student(student2);
        deputy_squad_leader.add_student(student3);

        // 进行组合，班长管理副班长
        squad_leader.add_student(deputy_squad_leader);

        // 假设我们要查看副班长管理了哪些人
        for(Student s: deputy_squad_leader.getStudents()){
            System.out.println(s.toString());
        }
    }
}
