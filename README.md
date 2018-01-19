# DesignPattern
记录设计模式的学习过程，看完后自己照着书上的思路写了一遍。

2018-01-09

git初始化，将之前做的几个练习上传到了git上，同时完成了迭代器模式（iterator）的练习

2018-01-12 10:29 

练习完成策略模式(strategy)

2018-01-17 11:15

练习完成了代理模式(proxy)
代理模式书中介绍的有三种：远程代理 虚拟代理 保护代理 还有很多野生的代理比如缓存代理等 书中没有详细介绍。

1.远程代理举的例子是JAVA的RMI(真实对象和代理不在同一个JVM上)，程序很容易写出来，但是由于环境没有弄清楚，实际程序没有跑起来。

2.虚拟代理就是用代理暂时代理开销比较大，加载时间长的大对象，真实对象没有加载完的时候用户调用的是虚拟代理，等加载完了调用时候就自动变成了真实的对象。程序比较简单，就没有实现了。

3.保护代理利用代理来对真实对象进行控制保护，控制用户调用真实对象的方法，有的可以调用，有的则不能调用，实现时候用JAVA API内置的proxy，用invocationHandler来做具体的控制保护。
不同的控制权限需要生成不同的代理。之所以不同代理具有不同权限，是因为这些代理中的invocationHandler不一样。

2017-01-18 21：41

练习混合模式 -- 为了练习加入各种设计模式...

需求变更各个阶段：

1.鸭子，又是鸭子。一开始一群鸭子呱呱叫，各自叫声不一样。书上直接实现一个quackable的接口，然后各自鸭子实现自己的叫声。不过这里我是用策略模式来实现的，毕竟学过了，这里不用浪费了，本来这次练习就是为了模式而模式。

2.鸭子突然里混入了一只鹅，但是对于鸭子模拟器来说要只能调用鸭子来叫，所以适配器模式就用上咯。

3.某天来了个闲的无聊的鸭子观察员，对鸭子总共叫了几次很感兴趣。希望能够得到鸭子总共叫了多少次。模拟器需要在最后时候返回一个总数给鸭子观察员。书上提供了一种装饰者模式的思路，在鸭子叫的行为上添加一个自我统计的行为，每次叫就将总数自增一，最后打印出最后的统计总数。不过我感觉这里用观察者模式也可以，叫的时候调用update，统计这个行为由鸭子观察员来完成，而不是像装饰着模式那样由鸭子来完成。用装饰着模式的话可以保证不改变原先鸭子里的代码。观察者模式证明是可以的。

4.鸭子创建的过程需要鸭子模拟器一个个创建，每个鸭子又都要加个装饰者（假定之前用的是装饰者），难免有时候会忘记。为了做统一的创建鸭子控制，而且将鸭子的创建过程封装起来，并且这里是要创建一群鸭子，
相当于一个产品簇，所以引入工厂模式。

5.鸭子模拟器觉得要让每个鸭子都叫要一个个调用太麻烦了，如果能对一群鸭子进行操作就好了，由此引进组合模式。在对一群鸭子进行迭代操作的时候还跟入了迭代器模式。

6.鸭子观察员想追踪其中几只鸭子的行为，他需要知道哪只鸭子叫了。所以加入观察者模式。

2018-01-19 16:14  完成混合模式

总结：通过练习顺利完成各种模式，在练习需求3的时候装饰者模式和观察者模式都成功实现。感觉用观察者模式更好，毕竟后面用到了观察者模式。另外用策略模式而不是实现quackable的接口可以使得后面观察者模式的实现变得更加容易。减少更多的重复代码。