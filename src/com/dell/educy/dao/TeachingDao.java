package com.dell.educy.dao;

import com.dell.educy.bean.Teaching;
import com.dell.educy.bean.TeachingSearchBean;

import java.util.List;

/**
 * @Author 马小姐
 * @Date 2020-10-05 16:47
 * @Version 1.0
 * @Description:
 */

public interface TeachingDao {
    public List<Teaching> getTeachingList(TeachingSearchBean teachingSearchBean);
    public int getTeachingListSize(TeachingSearchBean teachingSearchBean);
    public void addTeaching(Teaching teaching);
    public void updateTeaching(Teaching teaching);
    public void deleteTeaching(int teachingId);
    public List<Teaching> getTeachingByTeacherId(TeachingSearchBean teachingSearchBean);
    public int getTeachingByTeacherIdSize(TeachingSearchBean teachingSearchBean);
}
