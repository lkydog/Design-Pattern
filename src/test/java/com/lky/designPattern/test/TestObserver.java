package com.lky.designPattern.test;

import com.lky.designPattern.observer.Newspaper;
import com.lky.designPattern.observer.NewspaperImpl;
import com.lky.designPattern.observer.Subscriber;
import com.lky.designPattern.observer.SubscriberImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/6/1
 * 观察者模式测试类
 */
@SpringBootTest
public class TestObserver {

    @Test
    void testObserver(){
        Newspaper newspaper = new NewspaperImpl();
        Subscriber li = new SubscriberImpl("李老头");
        Subscriber wang = new SubscriberImpl("王奶奶");
        //李老头和王奶奶订阅了报纸
        newspaper.addSubscriber(li);
        newspaper.addSubscriber(wang);
        //报纸到了，通知订阅者
        newspaper.notifySubscribers("今天的报纸到了！！！");
        //李老头取消订阅了，移除
        newspaper.removeSubscriber(li);

        newspaper.notifySubscribers("明天的报纸还是这个点到！！！");
    }
}
