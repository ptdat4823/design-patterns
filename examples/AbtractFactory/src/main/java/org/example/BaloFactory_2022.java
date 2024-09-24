package org.example;

public class BaloFactory_2022 implements BaloFactory{
    @Override
    public UIT_Balo createUITBalo() {
        return new UIT_Balo(2022, "Yellow");
    }

    @Override
    public USSH_Balo createUSSHBalo() {
        return new USSH_Balo(2022, "White");
    }
}
