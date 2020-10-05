package com.dell.educy.service;

import com.dell.educy.bean.Score;
import com.dell.educy.bean.ScoreSearchBean;
import com.dell.educy.dao.ScoreDao;

import java.util.List;

public class ScoreServiceImpl implements ScoreService {
	private ScoreDao scoreDao;

	public ScoreDao getScoreDao() {
		return scoreDao;
	}

	public void setScoreDao(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}

	public List<Score> getScoreList(ScoreSearchBean scoreSearchBean) {
		return scoreDao.getScoreListByTeacherId(scoreSearchBean);
	}

	public int getScoreListSize(ScoreSearchBean scoreSearchBean) {
		return scoreDao.getScoreListSizeByTeacherId(scoreSearchBean);
	}

	public void updateScore(Score score) {
		scoreDao.updateScore(score);
	}


}
