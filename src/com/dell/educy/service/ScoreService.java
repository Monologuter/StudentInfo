package com.dell.educy.service;

import com.dell.educy.bean.Score;
import com.dell.educy.bean.ScoreSearchBean;

import java.util.List;


@SuppressWarnings("unused")
public interface ScoreService {
	
	

	public List<Score> getScoreList(ScoreSearchBean scoreSearchBean);
	public int getScoreListSize(ScoreSearchBean scoreSearchBean);
	public void updateScore(Score score);
}
