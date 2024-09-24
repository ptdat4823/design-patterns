package org.example;

public class BaloFactory_2024 implements BaloFactory{
    @Override
    public UIT_Balo createUITBalo() {
        return new UIT_Balo(2024, "Pink");
    }

    @Override
    public USSH_Balo createUSSHBalo() {
        return new USSH_Balo(2024, "Brown");
    }

}
