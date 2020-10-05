package com.dell.educy.dao;

import com.dell.educy.bean.Score;
import com.dell.educy.bean.ScoreSearchBean;

import java.util.List;

/**
 * @Author 马小姐
 * @Date 2020-10-05 16:46
 * @Version 1.0
 * @Description:
 */
public interface ScoreDao {
    public void addScore(Score score);
    public List<Score> getScoreListByTeacherId(ScoreSearchBean scoreSearchBean);
    public int getScoreListSizeByTeacherId(ScoreSearchBean scoreSearchBean);
    public void updateScore(Score score);
    public void deleteScoreByTeachingId(int teachingId);
}
