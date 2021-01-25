package org.json;

import java.util.List;

public class Employee {
private long page;
private long per_page;
private long total;
private long total_pages;
private List<Data> data;
public long getPage() {
	return page;
}
public void setPage(long page) {
	this.page = page;
}
public long getPer_page() {
	return per_page;
}
public void setPer_page(long per_page) {
	this.per_page = per_page;
}
public long getTotal() {
	return total;
}
public void setTotal(long total) {
	this.total = total;
}
public long getTotal_pages() {
	return total_pages;
}
public void setTotal_pages(long total_pages) {
	this.total_pages = total_pages;
}
public List<Data> getData() {
	return data;
}
public void setData(List<Data> data) {
	this.data = data;
}

}
