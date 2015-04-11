package com.hib.anno;

// Generated 11 Apr, 2015 7:37:56 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * LuxuryHotel generated by hbm2java
 */
@Entity
@Table(name = "LuxuryHotel", catalog = "Happyhack")
public class LuxuryHotel implements java.io.Serializable {

	private Integer idRawTable;
	private Double avgPrice;
	private Float overallRating;
	private String url;
	private String author;
	private String content;
	private String date;
	private String imgSrc;
	private float overall;
	private float value;
	private float rooms;
	private float locations;
	private float cleanliness;
	private float chekIn;
	private float service;
	private float businessService;
	private String hotelId;
	private String name;
	private int sleepQuality;
	private String stopWord;
	private String biGram;

	public LuxuryHotel() {
	}

	public LuxuryHotel(float overall, float value, float rooms,
			float locations, float cleanliness, float chekIn, float service,
			float businessService, int sleepQuality) {
		this.overall = overall;
		this.value = value;
		this.rooms = rooms;
		this.locations = locations;
		this.cleanliness = cleanliness;
		this.chekIn = chekIn;
		this.service = service;
		this.businessService = businessService;
		this.sleepQuality = sleepQuality;
	}

	public LuxuryHotel(Double avgPrice, Float overallRating, String url,
			String author, String content, String date, String imgSrc,
			float overall, float value, float rooms, float locations,
			float cleanliness, float chekIn, float service,
			float businessService, String hotelId, String name,
			int sleepQuality, String stopWord, String biGram) {
		this.avgPrice = avgPrice;
		this.overallRating = overallRating;
		this.url = url;
		this.author = author;
		this.content = content;
		this.date = date;
		this.imgSrc = imgSrc;
		this.overall = overall;
		this.value = value;
		this.rooms = rooms;
		this.locations = locations;
		this.cleanliness = cleanliness;
		this.chekIn = chekIn;
		this.service = service;
		this.businessService = businessService;
		this.hotelId = hotelId;
		this.name = name;
		this.sleepQuality = sleepQuality;
		this.stopWord = stopWord;
		this.biGram = biGram;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idRawTable", unique = true, nullable = false)
	public Integer getIdRawTable() {
		return this.idRawTable;
	}

	public void setIdRawTable(Integer idRawTable) {
		this.idRawTable = idRawTable;
	}

	@Column(name = "Avg_Price", precision = 22, scale = 0)
	public Double getAvgPrice() {
		return this.avgPrice;
	}

	public void setAvgPrice(Double avgPrice) {
		this.avgPrice = avgPrice;
	}

	@Column(name = "Overall_Rating", precision = 12, scale = 0)
	public Float getOverallRating() {
		return this.overallRating;
	}

	public void setOverallRating(Float overallRating) {
		this.overallRating = overallRating;
	}

	@Column(name = "URL", length = 45)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "Author", length = 100)
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Column(name = "Content", length = 10000)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "Date", length = 45)
	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Column(name = "img_src", length = 45)
	public String getImgSrc() {
		return this.imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

	@Column(name = "Overall", nullable = false, precision = 12, scale = 0)
	public float getOverall() {
		return this.overall;
	}

	public void setOverall(float overall) {
		this.overall = overall;
	}

	@Column(name = "Value", nullable = false, precision = 12, scale = 0)
	public float getValue() {
		return this.value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	@Column(name = "Rooms", nullable = false, precision = 12, scale = 0)
	public float getRooms() {
		return this.rooms;
	}

	public void setRooms(float rooms) {
		this.rooms = rooms;
	}

	@Column(name = "Locations", nullable = false, precision = 12, scale = 0)
	public float getLocations() {
		return this.locations;
	}

	public void setLocations(float locations) {
		this.locations = locations;
	}

	@Column(name = "Cleanliness", nullable = false, precision = 12, scale = 0)
	public float getCleanliness() {
		return this.cleanliness;
	}

	public void setCleanliness(float cleanliness) {
		this.cleanliness = cleanliness;
	}

	@Column(name = "ChekIn", nullable = false, precision = 12, scale = 0)
	public float getChekIn() {
		return this.chekIn;
	}

	public void setChekIn(float chekIn) {
		this.chekIn = chekIn;
	}

	@Column(name = "Service", nullable = false, precision = 12, scale = 0)
	public float getService() {
		return this.service;
	}

	public void setService(float service) {
		this.service = service;
	}

	@Column(name = "BusinessService", nullable = false, precision = 12, scale = 0)
	public float getBusinessService() {
		return this.businessService;
	}

	public void setBusinessService(float businessService) {
		this.businessService = businessService;
	}

	@Column(name = "HotelId", length = 45)
	public String getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	@Column(name = "Name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "SleepQuality", nullable = false)
	public int getSleepQuality() {
		return this.sleepQuality;
	}

	public void setSleepQuality(int sleepQuality) {
		this.sleepQuality = sleepQuality;
	}

	@Column(name = "Stop_Word", length = 10000)
	public String getStopWord() {
		return this.stopWord;
	}

	public void setStopWord(String stopWord) {
		this.stopWord = stopWord;
	}

	@Column(name = "BI_Gram", length = 10000)
	public String getBiGram() {
		return this.biGram;
	}

	public void setBiGram(String biGram) {
		this.biGram = biGram;
	}

}
