package com.company.Proxy;

public class ProxySearcher implements Searcher {
    private RealSearch searcher = new RealSearch(); //维持一个对真实主题的引用
    private AccessValidator validator;
    private Logger logger;

    public String DoSearch(String userId, String keyword) {
        //如果身份验证成功，则执行查询
        if (this.Validate(userId)) {
            String result = searcher.DoSearch(userId, keyword); //调用真实主题对象的查询方法
            this.Log(userId); //记录查询日志
            return result; //返回查询结果
        }
        else {
            return null;
        }
    }

    //创建访问验证对象并调用其Validate()方法实现身份验证
    public boolean Validate(String userId) {
        validator = new AccessValidator();
        return validator.validate(userId);
    }

    //创建日志记录对象并调用其Log()方法实现日志记录
    public void Log(String userId) {
        logger = new Logger();
        logger.Log(userId);
    }

}
