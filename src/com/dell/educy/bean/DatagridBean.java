package com.dell.educy.bean;

import java.util.List;

/**
 * @Author 马小姐
 * @Date 2020-10-05 17:05
 * @Version 1.0
 * @Description:
 */

public class DatagridBean<T> {
    private List<T> rows;
    private int total;
    public List<T> getRows() {
        return rows;
    }
    public void setRows(List<T> rows) {
        this.rows = rows;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    @Override
    public String toString() {
        return "PageBean [rows=" + rows + ", total=" + total + "]";
    }


}
