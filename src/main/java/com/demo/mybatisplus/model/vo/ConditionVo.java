package com.demo.mybatisplus.model.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * @author zhangfeng
 */
public class ConditionVo implements Serializable {

    /**
     * 此处翻译为页码
     */
    private int currentPage = 1;

    /**
     * 每页行数，值小于0时表示不分页
     */
    private int pageSize = 10;

    /**
     * 排序字段
     */
    private String sort;

    /**
     * 排序方式
     */
    private String order;

    @JsonIgnore
    private String sortIndex;

    public String getSortIndex() {
        if (StringUtils.isNotBlank(getSort()) && StringUtils.isNotBlank(getOrder())) {
            sortIndex = getSort() + " " + getOrder();
        }
        return sortIndex;
    }

    public void setSortIndex(String sortIndex) {
        this.sortIndex = sortIndex;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
