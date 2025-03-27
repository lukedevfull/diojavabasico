package edu.luke.enumPlayground.consume;

import edu.luke.enumPlayground.BrasilianStates;

public class FakeInstitute {
 public static void main(String[] args) {
  System.out.println("Verification of cadastred states:");
  System.out.println("------------------");
  for(BrasilianStates state : BrasilianStates.values()) {
    System.out.println("State: " + state.getName() + " - " + state.getAbbreviation());
    System.out.println("------------------");
  }
  System.out.println("------------------");
  System.out.println("One State Verification: ");
  BrasilianStates CE = BrasilianStates.CEARA;
  System.out.println("State: " + CE.getName() + " - " + CE.getAbbreviation() + "\n" + CE.getUpperCaseName());
  System.out.println("------------------");
  System.out.println("End of verification");
 }
}
