package com.home.springmvc.dao;

import com.home.springmvc.model.Group;

import java.util.List;

/**
 * Created by premnath on 29/11/15.
 */
public interface GroupDao {

    Group findById(Long id);
    void saveGroup(Group group);
    void deleteGroup(Group group);
    List<Group> lisAllGroups();
}
