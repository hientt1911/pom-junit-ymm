package vn.mmj.ymeetme.models;

import org.apache.commons.lang3.RandomStringUtils;

public class ConstantData {
	public static final String URL = "https://test.ymeet.me/";
	public static final UserAccount USERACCOUNT = new UserAccount("test.cani123@gmail.com", "hien_cani123");
		
	// Search conditions 
	public static final String MAX_AGE_SEARCH_CONDITION = "18";
	public static final String MIN_AGE_SEARCH_CONDITION = "50";
	public static final String MAX_HEIGHT_SEARCH_CONDITION = "135";
	public static final String MIN_HEIGHT_SEARCH_CONDITION = "200";
//	public static final String COUNTRY_SEARCH_CONDITION = "Việt Nam";
//	public static final String CUR_CITY_SEARCH_CONDITION = "Hà Nội";
	public static final String HOMETOWN_SEARCH_CONDITION = "Hà Nội";
	public static final String CONSTELLATION_SEARCH_CONDITION[] = {"Song Tử", "Bò Cạp"};
	public static final String BODY_TYPE_SEARCH_CONDITION[] = {"Mảnh mai", "Cao lớn"};
	public static final String BLOOD_TYPE_SEARCH_CONDITION[] = {"A", "B"};
	public static final String EDUCATION_SEARCH_CONDITION[] = {"Đại học", "Tiến sĩ"};
	public static final String JOB_SEARCH_CONDITION[] = {"Nghệ thuật", "Kinh doanh"};
	public static final String INCOME_SEARCH_CONDITION[] = {"15 đến 20 Triệu VNĐ", "Trên 20 Triệu VNĐ"};
	public static final String RELATIONSHIP_SEARCH_CONDITION[] = {"Độc thân", "Độc thân(Đã ly hôn)"};
	public static final String HOUSE_MATE_CONDITION[] = {"Một mình"};
	public static final String INTENTION_MARRIAGE_CONDITION[] = {"Khi gặp người phù hợp"};
	public static final String HOLIDAY_CONDITION[] = {"Thứ 7 và chủ nhật"};
	public static final String DRINKING_CONDITION[] = {"Thi thoảng"};
	public static final String SMOKING_CONDITION[] = {"Thi thoảng"};
	public static final String OTHER_CONDITION[] = {"Có giới thiệu", "Có ảnh phụ"};
	
	// New fb_user
	public static final String NAME = RandomStringUtils.randomAlphanumeric(8);
}
