package com.example.graphql_compras.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tourist {
    private float page;
    private float per_page;
    private float totalrecord;
    private float total_pages;
    private ArrayList<TouristInfo> datas;

    public float getPage() {
        return page;
    }

    public void setPage(float page) {
        this.page = page;
    }

    public float getPer_page() {
        return per_page;
    }

    public void setPer_page(float per_page) {
        this.per_page = per_page;
    }

    public float getTotalrecord() {
        return totalrecord;
    }

    public void setTotalrecord(float totalrecord) {
        this.totalrecord = totalrecord;
    }

    public float getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(float total_pages) {
        this.total_pages = total_pages;
    }

    public ArrayList<TouristInfo> getData() {
        return datas;
    }

    public void setData(ArrayList<TouristInfo> data) {
        this.datas = data;
    }
}
