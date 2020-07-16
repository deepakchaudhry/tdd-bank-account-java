package org.xpdojo.bank;

/**
 * Immutable class to represent Money as a concept.
 * This class should have no accessor methods.
 */
public class Money {
    public static int initialMoney = 40000;
    public int transferBalance(int i) {
        initialMoney = initialMoney + i;
    return initialMoney;
    }
}
