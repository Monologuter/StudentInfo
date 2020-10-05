package com.dell.educy.bean;

/**
 * @Author 马小姐
 * @Date 2020-10-05 16:42
 * @Version 1.0
 * @Description:
 */
public class PageBean {
    private int page;
    private int rows;
    private int start;

    public int getStart() {
        start=(page-1)*rows;
        return start;
    }
    public void setStart(int start) {
        this.start = start;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public int getRows() {
        return rows;
    }
    public void setRows(int rows) {
        this.rows = rows;
    }
    @Override
    public String toString() {
        return "PageBean [page=" + page + ", rows=" + rows + ", start=" + start + "]";
    }



}
