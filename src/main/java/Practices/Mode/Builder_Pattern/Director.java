package Practices.Mode.Builder_Pattern;
// 4, 重点来了，敲了好久，一定要写这句话
// 刚刚说了那么多，也可以创建一种对象了，但是这个Director 类就是我们决定创建时候规则的地方
public class Director {
    // 这个创建方法的入参就是之前的接口，可以根据实现类的不同，从而实现创建不同属性的对象。
    // 我觉得这里可以在创建多个方法，以实现不同的规则
    public GirlFriend CreateGirlFriendByDirector(Builder_GirlFriend gf){
        // 之前的规则：定义“女朋友”姓名、年龄和智商之前，先得让“女朋友出生”
        // 所以我们先创建“她”的身体
        gf.buildBody();
        // 其次赋给“她”其他属性
        gf.buildname();
        gf.buildBage();
        gf.buildIQ();
        return gf.CreateGirl();
    }
}
