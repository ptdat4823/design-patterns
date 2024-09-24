package org.example;

public class BaloDesignCompany {
    BaloFactory factory;
    public BaloDesignCompany(BaloFactory factory) {
        this.factory = factory;
    }
    public UIT_Balo createUITBalo() {
        return factory.createUITBalo();
    }
    public USSH_Balo createUSSHBalo() {
        return factory.createUSSHBalo();
    }
}
