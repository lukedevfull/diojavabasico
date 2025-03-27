package edu.luke.clientConstructor.model;

public class ClientModel {
  private String name;
  private String email;
  private String phone;
  private String address;
  private String city;
  private String state;
  private String zipCode;

  //CONSTRUCTOR
  public ClientModel ( String name, String email){
    this.name = name; 
    this.email = email;
  }

  //GETTERS 
  public String getName() {
    return name;
  }
  public String getEmail() {
    return email;
  }
  public String getPhone() {
    return phone;
  }
  public String getAddress() {
    return address;
  }
  public String getCity() {
    return city;
  }
  public String getState() {
    return state;
  }
  public String getZipCode() {
    return zipCode;
  }

  //SETTERS

  public void setPhone(String phone) {
    this.phone = phone;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public void setState(String state) {
    this.state = state;
  }
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

}
