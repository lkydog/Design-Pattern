⭐⭐⭐⭐⭐java实现，23种设计模式

## Design-Pattern

设计模式一种在软件开发种非常重要的编程技巧，它提供了经过验证的解决方案，可以使代码更加可读、可扩展和可维护，我们可以将常见的变成模式抽象出来，从而形成一组通用的解决方案，应用于不同的情况。

ps：设计模式代表的是一种思想，至于怎么千变万化就看大家的了。

## Blog Address（博客地址）：

> 以下是博客地址，如有错误欢迎指正，如有侵权，请联系我删除。学习难度和使用频率的星级，仅代表个人观点。

### 一、创建型模式（5种）

[1.单例模式-Singleton Pattern](https://blog.csdn.net/weixin_45433817/article/details/130853883?spm=1001.2014.3001.5501)**【学习难度：★☆☆☆☆，使用频率：★★★★☆】**

定义：确保一个类最多只有一个实例，并提供一个全局访问点。

描述：包含饿汉式2种、懒汉式4种、静态内部类、枚举等实现方式。

[2.工厂模式-Factory Pattern](https://blog.csdn.net/weixin_45433817/article/details/130934548?spm=1001.2014.3001.5501)**【学习难度：★★☆☆☆，使用频率：★★★★★】**

定义：提供一个公共的接口，使得可以在不暴露对象创建逻辑的情况下创建。

描述：包含**简单工厂模式、方法工厂模式以及抽象工厂模式**。简单工厂和方法工厂以卖包子为例，抽象工厂以卖包子和卖蛋糕为例。

[3.抽象工厂模式（工厂模式已包含）](https://blog.csdn.net/weixin_45433817/article/details/130934548?spm=1001.2014.3001.5501)

[4.建造者模式-Builder Pattern](https://blog.csdn.net/weixin_45433817/article/details/131175862?spm=1001.2014.3001.5501)【**学习难度：★★★☆☆，使用频率：★★★☆☆**】

定义：封装一个复杂对象构造过程，并允许按步骤构造。

描述：以肯德基套餐为例。

[5.原型模式-Prototype Pattern](https://blog.csdn.net/weixin_45433817/article/details/131095164?spm=1001.2014.3001.5501)【**学习难度：★★★☆☆，使用频率：★★★☆☆**】

定义：通过复制现有实例来创建新的实例，无需知道相应类的信息。

描述：以英雄联盟塞拉斯窃取其他英雄大招为例。

### 二、结构型模式（7种）

[1.适配器模式-Adapter Pattern](https://blog.csdn.net/weixin_45433817/article/details/131153032?spm=1001.2014.3001.5501)【**学习难度：★★☆☆☆，使用频率：★★★☆☆**】

定义：允许不兼容的接口之间进行合作。

描述：以英汉互译为例，包含**类适配器、对象适配器、接口适配器**。

[2.装饰者模式-Decorator Pattern](https://blog.csdn.net/weixin_45433817/article/details/131074125?spm=1001.2014.3001.5501)【**学习难度：★★★☆☆，使用频率：★★★☆☆**】

定义：动态的将新功能附加到对象上。

描述：以LOL中盲僧学习技能（Q、W、E、R）为例。

[3.代理模式-Proxy Pattern](https://blog.csdn.net/weixin_45433817/article/details/130975792?spm=1001.2014.3001.5501)【**学习难度：★★☆☆☆，使用频率：★★★★☆**】

定义：给某一个对象提供一个代理对象，并由代理对象控制对原有对象的引用。

描述：以房屋中介为例，包含**静态代理、JDK动态代理和Cglib代理**。

[4.外观模式-Facade Pattern](https://blog.csdn.net/weixin_45433817/article/details/131214686?spm=1001.2014.3001.5501)【**学习难度：★☆☆☆☆，使用频率：★★★★★**】

定义：隐藏了系统的复杂性，并向客户端提供了一个可以访问系统的接口。

描述：以旅行社为例。

[5.桥接模式-Bridge Pattern](https://blog.csdn.net/weixin_45433817/article/details/131234978?spm=1001.2014.3001.5501)【**学习难度：★★★☆☆，使用频率：★★☆☆☆**】

定义：将抽象部分与它的实现部分分离，使它们都可以独立地变化。

描述：以不同品牌手机和蓝牙耳机为例。

[6.组合模式-Composite Pattern](https://blog.csdn.net/weixin_45433817/article/details/131293595?spm=1001.2014.3001.5501)【**学习难度：★★★☆☆，使用频率：★★★★☆**】

定义：将对象组合成树形的层次结构，用来表示“整体-部分”的关系。

描述：以算数表达式为例。

[7.享元模式-Flyweight Pattern](https://blog.csdn.net/weixin_45433817/article/details/131335574?spm=1001.2014.3001.5501)【**学习难度：★★★★☆，使用频率：★★☆☆☆**】

定义：通过共享的方式减少创建对象的数量，以减少内存占用和提升性能。

描述：以共享单车为例。

### 三、行为型模式（11种）

[1.策略模式-Strategy Pattern](https://blog.csdn.net/weixin_45433817/article/details/130874105?spm=1001.2014.3001.5501)【**学习难度：★☆☆☆☆，使用频率：★★★★★**】

定义：定义了一系列的算法，并将每个算法封装起来，是他们可以相互替换。

描述：以刷视频选择视频平台为例。

[2.模板模式-Template Pattern](https://blog.csdn.net/weixin_45433817/article/details/131355105?spm=1001.2014.3001.5501)【**学习难度：★★☆☆☆，使用频率：★★★★☆**】

定义：在抽象类中定义算法的骨架，把具体的操作留给子类来实现。

描述：以订外卖为例。

[3.观察者模式-Observer Pattern](https://blog.csdn.net/weixin_45433817/article/details/130994583?spm=1001.2014.3001.5501)【**学习难度：★★★☆☆，使用频率：★★★★☆**】

定义：它定义了对象之间的一对多依赖关系，当一个对象的状态发生变化时，它所有的依赖对象都会自动收到通知并更新自身。

描述：以报纸和报纸订阅者为例。

[4.迭代器模式-Iterator Pattern](https://blog.csdn.net/weixin_45433817/article/details/131382881?spm=1001.2014.3001.5501)【**学习难度：★★★☆☆，使用频率：★★★★☆**】

定义：提供了一种统一的方式来访问集合对象中的元素，而不是暴露集合内部的表示方式。

描述：以遍历班级学生为例。

[5.解释器模式-Interpreter Pattern](https://blog.csdn.net/weixin_45433817/article/details/131399271?spm=1001.2014.3001.5501)【**学习难度：★★★★★，使用频率：★☆☆☆☆**】

定义：定义了一种语言，并定义该语言中语句的解释器，从而允许以编程方式定义语法、解析语法以及处理语法中的解释器。

描述：以四则运算为例。

[6.中介者模式-Mediator Pattern](https://blog.csdn.net/weixin_45433817/article/details/131444884?spm=1001.2014.3001.5501)【**学习难度：★★★☆☆，使用频率：★★☆☆☆**】

定义：用于降低多个对象之间的耦合度，通过引入一个中介者对象来协调对象之间的交互。

描述：以物流公司协调运输公司和商家为例。

[7.责任链模式-Chain Pattern](https://blog.csdn.net/weixin_45433817/article/details/131054732?spm=1001.2014.3001.5501)【**学习难度：★★★☆☆，使用频率：★★☆☆☆**】

定义：使用一条链来处理请求，该请求沿着链顺序传递，直到有对象处理该请求为止，从而达到解耦请求发送者和请求处理者的目的。

描述：以学校请假审批流程为例。

[8.命令模式-Command Pattern](https://blog.csdn.net/weixin_45433817/article/details/131465270?spm=1001.2014.3001.5501)【**学习难度：★★★☆☆，使用频率：★★★★☆**】

定义：将请求封装成一个对象，从而使不同的请求可以参数化、队列化、记录日志、撤销和重做等操作。

描述：以餐厅点餐为例。

[9.备忘录模式-Memento Pattern](https://blog.csdn.net/weixin_45433817/article/details/131501970?spm=1001.2014.3001.5501)【**学习难度：★★★☆☆，使用频率：★★★☆☆**】

定义：允许将对象的内部状态保存到外部，从而在需要时可以将对象恢复到之前的状态。

描述：以为本编辑器为例。

[10.状态模式-State Pattern](https://blog.csdn.net/weixin_45433817/article/details/131521862?spm=1001.2014.3001.5501)【**学习难度：★★★☆☆，使用频率：★★☆☆☆**】

定义：允许对象在内部状态发生改变时改变它的行为。

描述：以自动售卖机状态为例。

[11.访问者模式-Visitor Pattern](https://blog.csdn.net/weixin_45433817/article/details/131562332?spm=1001.2014.3001.5501)【**学习难度：★★★★☆，使用频率：★☆☆☆☆**】

定义：用于在**不修改**已有对象结构的情况下，定义新的操作方式。

描述：以“旅游参观”为例。

## Project Structure（项目结构）

![](https://github.com/lkydog/Design-Pattern/blob/main/image/structure.png)

## Source Code（源代码路径）

一、创建型（5种）

[1.单例模式-Singleton Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/singleton)

[2.工厂模式-Factory Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/factory)

[3.抽象工厂模式](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/factory)

[4.建造者模式-Builder Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/builder)

[5.原型模式-Prototype Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/prototype)

二、结构型（7种）

[1.适配器模式-Adapter Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/adapter)

[2.装饰者模式-Decorator Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/decoration)

[3.代理模式-Proxy Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/proxy)

[4.外观模式-Facade Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/facade)

[5.桥接模式-Bridge Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/bridge)

[6.组合模式-Composite Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/composite)

[7.享元模式-Flyweight Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/flyweight)

三、行为型（11种）

[1.策略模式-Strategy Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/strategy)

[2.模板模式-Template Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/template)

[3.观察者模式-Observer Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/observer)

[4.迭代器模式-Iterator Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/iterator)

[5.解释器模式-Interpreter Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/interpreter)

[6.中介者模式-Mediator Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/mediator)

[7.责任链模式-Chain Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/chain)

[8.命令模式-Command Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/command)

[9.备忘录模式-Memento Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/memento)

[10.状态模式-State Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/state)

[11.访问者模式-Visitor Pattern](https://github.com/lkydog/Design-Pattern/tree/main/src/main/java/com/lky/designPattern/visitor)

## About me

- QQ：444168842
- CSDN：https://blog.csdn.net/weixin_45433817?type=blog
- E-mail：lkydog99@163.com
