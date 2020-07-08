package com.mooc.sb2.aop;

// need to be proxy class
public class ForumServiceImpl implements ForumService{

    public void removeTopic(int topicId) {
        System.out.println("mooc delete topic");
    }

    public void removeForum(int forumId) {
        System.out.println("mocc delete forum");
    }

}
