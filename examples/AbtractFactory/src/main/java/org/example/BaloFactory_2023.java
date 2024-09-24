package org.example;

public class BaloFactory_2023 implements BaloFactory{
    @Override
    public UIT_Balo createUITBalo() {
        return new UIT_Balo(2023, "Red");
    }

    @Override
    public USSH_Balo createUSSHBalo() {
        return new USSH_Balo(2023, "Blue");
    }

}
