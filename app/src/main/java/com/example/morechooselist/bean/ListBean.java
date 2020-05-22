package com.example.morechooselist.bean;

/**
 * Date:2020/5/22
 * des:
 * author:wankai
 **/
public class ListBean {
    private String title;
    private boolean btnStatus = false; // 关键代码，false代表未选中，true 选中

    public ListBean(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isBtnStatus() {
        return btnStatus;
    }

    public void setBtnStatus(boolean btnStatus) {
        this.btnStatus = btnStatus;
    }
}
