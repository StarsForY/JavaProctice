package Practices.Mode.Chain_of_Responsibility_Pattern;
// 5. 测试
public class Test_Main {
    public static void main(String[] args) {
        // 创建主管、经理、总经理对象
        Handler supervisor = new Supervisor();
        Handler manager = new Manager();
        Handler generalManager = new General_Manager();
        // 形成责任链
        supervisor.setHandler(manager);
        manager.setHandler(generalManager);
        // 测试责任链
        supervisor.Approval(1500);

    }
}
