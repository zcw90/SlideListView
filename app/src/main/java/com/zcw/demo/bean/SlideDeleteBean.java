package com.zcw.demo.bean;

/**
 * 滑动删除实体类
 */
public class SlideDeleteBean {

    private String title;

    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return title + " - " + content;
    }
}
