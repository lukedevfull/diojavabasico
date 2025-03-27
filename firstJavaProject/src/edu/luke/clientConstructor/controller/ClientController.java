package edu.luke.clientConstructor.controller;

import edu.luke.clientConstructor.model.ClientModel;

public class ClientController {
  ClientModel client = new ClientModel("Luke", "luke@luke.com"); {
  client.setPhone("1234567890");
  client.setAddress("123 Main St");
  client.setCity("Springfield");
  client.setState("IL");
  client.setZipCode("62704");
}


  public void showClient() {
    System.out.println(client.getName());
    System.out.println(client.getEmail());
  }

  public void showClientInfo() {
    System.out.println(client.getName());
    System.out.println(client.getEmail());
    System.out.println(client.getPhone());
    System.out.println(client.getAddress());
    System.out.println(client.getCity());
    System.out.println(client.getState());
    System.out.println(client.getZipCode());
  }
  public static void main(String[] args) {
    ClientController controller = new ClientController();
    controller.showClientInfo();
  }
}
