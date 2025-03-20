package test.controllers;

import test.model.TesterCheking;

public class TestController {
    public static void main(String[] args) {
        TesterCheking tester1 = new TesterCheking("Luke", 'A', 'B');
        tester1.showResult();

        TesterCheking tester2 = new TesterCheking("John", 'C', 'C');
        tester2.showResult();

        TesterCheking tester3 = new TesterCheking("Jane", 'D', 'B');
        tester3.showResult();
    }
}
