package org.solvd.zoo.contractor;

public enum TicketType {
    ADULT("Adult", 20 ,"$"),
    CHILD5("Child under 5", 0, "$"),
    CHILD16("Child between 5 and 16", 10,"$"),
    GROUP("Group above 6 discount price", 10, "$"),
    ;

    TicketType(String s, int i, String $) {
    }
}
