package jp.co.dogtype.entity;

public class Dog {

	// DogタイトルNo
	private int titleNo;
	// 犬種
	private String breed;
	// 出身国
	private String country;
	// 特徴
	private String characteristic;

	/**
	 * コンストラクタ（初期化メソッド）
	 * 
	 * @param titleNo
	 * @param breed
	 * @param country
	 * @param characteristic
	 */
	public Dog(int titleNo, String breed, String country, String characteristic) {
	}

	public int getTitleNo() {
		return titleNo;
	}

	public void setTitleNo(int titleNo) {
		this.titleNo = titleNo;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCharacteristic() {
		return characteristic;
	}

	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}
}
