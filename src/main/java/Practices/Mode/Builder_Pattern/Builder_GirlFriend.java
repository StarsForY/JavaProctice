package Practices.Mode.Builder_Pattern;
//  2. 创建一个建造“女朋友”的接口
// 在这个节口中，需要给“女朋友”的属性赋值，还要有一个创建女朋友的方法
// 为什么要定义一个这样的接口，我们创建对象的时候斌可能只创建一种类型，或者说只创建属性一致的对象。
public interface Builder_GirlFriend {
    public void buildBody();
    public void buildname();
    public void buildBage();
    public void buildIQ();
    public GirlFriend CreateGirl();
}
