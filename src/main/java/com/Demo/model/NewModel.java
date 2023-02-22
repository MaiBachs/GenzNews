package com.Demo.model;

import java.util.Arrays;

public class NewModel extends AbstractModel<NewModel>{
	private Long id;
	private String title;
	private String thumbnail;
	private String shortdescription;
	private String content;
	private long categoryid;
	private CategoryModel category;
	private Long[] ids;

	@Override
	public String toString() {
		return "NewModel [id=" + id + ", title=" + title + ", thumbnail=" + thumbnail + ", shortdescription="
				+ shortdescription + ", content=" + content + ", categoryid=" + categoryid + ", ids="
				+ Arrays.toString(ids) + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getShortdescription() {
		return shortdescription;
	}
	public void setShortdescription(String shortdescription) {
		this.shortdescription = shortdescription;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public long getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(long categoryid) {
		this.categoryid = categoryid;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long[] getIds() {
		return ids;
	}
	public void setIds(Long[] ids) {
		this.ids = ids;
	}
	public CategoryModel getCategory() {
		return category;
	}
	public void setCategory(CategoryModel category) {
		this.category = category;
	}
}
