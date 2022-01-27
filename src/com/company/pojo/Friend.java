package com.company.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Friend {

    Map<User,List<User>> userMap = new HashMap<>();

    public Map<User, List<User>> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<User, List<User>> userMap) {
        this.userMap = userMap;
    }
}
