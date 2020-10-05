package com.dell.educy.action;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.dell.educy.bean.Semester;
import com.dell.educy.service.SemesterService;
import com.dell.educy.utils.JsonUtil;


/**
 * @Author 马小姐
 * @Date 2020-10-05 16:34
 * @Version 1.0
 * @Description:
 */
public class SemesterAction {
    private SemesterService semesterService;
    private JsonUtil jsonUtil;

    public JsonUtil getJsonUtil() {
        return jsonUtil;
    }

    public void setJsonUtil(JsonUtil jsonUtil) {
        this.jsonUtil = jsonUtil;
    }

    public SemesterService getSemesterService() {
        return semesterService;
    }

    public void setSemesterService(SemesterService semesterService) {
        this.semesterService = semesterService;
    }

    public void list(){
        List<Semester> list=semesterService.getSemesterList();
        String result= JSON.toJSONString(list);
        jsonUtil.writeJson(result);
    }
}
