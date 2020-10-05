package com.dell.educy.bean;

/**
 * @Author 马小姐
 * @Date 2020-10-05 16:39
 * @Version 1.0
 * @Description:
 */
public class Address {
    private String province;
    private String city;
    private String county;
    private String detailedAddress;
    private String address;

    public String getAddress() {

        this.address=province+"省"+city+"市"+county+detailedAddress;

        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCounty() {
        return county;
    }
    public void setCounty(String county) {
        this.county = county;
    }
    public String getDetailedAddress() {
        return detailedAddress;
    }
    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }
    @Override
    public String toString() {
        return "Address [province=" + province + ", city=" + city + ", county=" + county + ", detailedAddress="
                + detailedAddress + ", address=" + address + "]";
    }


}
