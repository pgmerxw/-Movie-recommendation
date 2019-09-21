package com.neudeu.pojo;

public class Movie {
	private String m_id;
	private String m_name;
	private Integer rate;
	private String director;
	private String screenwriter;
	private String actor;
	private String type;
	private String area;
	private String language;
	private Integer length;
	private String imgurl;
	private String star;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String m_id, String m_name, Integer rate, String director, String screenwriter, String actor,
			String type, String area, String language, Integer length, String imgurl, String star) {
		super();
		this.m_id = m_id;
		this.m_name = m_name;
		this.rate = rate;
		this.director = director;
		this.screenwriter = screenwriter;
		this.actor = actor;
		this.type = type;
		this.area = area;
		this.language = language;
		this.length = length;
		this.imgurl = imgurl;
		this.star = star;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getScreenwriter() {
		return screenwriter;
	}
	public void setScreenwriter(String screenwriter) {
		this.screenwriter = screenwriter;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getStar() {
		return star;
	}
	public void setStar(String star) {
		this.star = star;
	}
	
	
}
