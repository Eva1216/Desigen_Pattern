package com.company.Proxy;

import java.io.Console;

public class Proxy {
    public static void main(String[] args) {
        ProxySearcher proxySearcher = new ProxySearcher();
        String result = proxySearcher.DoSearch("杨过", "玉女心经");

    }
}


interface Searcher
{
    String DoSearch(String userId, String keyword);
}

class RealSearch implements Searcher{

    @Override
    public String DoSearch(String userId, String keyword) {
        System.out.println("用户使用关键词查询商务信息！" + userId + keyword);
        return "返回具体内容";
    }
}

