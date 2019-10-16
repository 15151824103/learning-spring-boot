package com.ht.entity;

import java.util.List;

public class Child {

    private String childName;

    private int childAge;

    private List<People> friends;

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public int getChildAge() {
        return childAge;
    }

    public void setChildAge(int childAge) {
        this.childAge = childAge;
    }

    public List<People> getFriends() {
        return friends;
    }

    public void setFriends(List<People> friends) {
        this.friends = friends;
    }
}
