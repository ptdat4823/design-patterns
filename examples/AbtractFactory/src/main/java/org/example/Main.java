package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BaloDesignCompany company;
        List<Integer> universities = List.of(2022, 2023, 2024);
        for (Integer year : universities) {
            BaloFactory factory;
            if (year == 2022) {
                factory = new BaloFactory_2022();
            } else if(year == 2023) {
                factory = new BaloFactory_2023();
            }
            else {
                factory = new BaloFactory_2024();
            }
            company = new BaloDesignCompany(factory);
            UIT_Balo uitBalo = company.createUITBalo();
            USSH_Balo usshBalo = company.createUSSHBalo();

            System.out.println(uitBalo.getLogo() + " has color " + uitBalo.getColor());
            System.out.println(usshBalo.getLogo() + " has color " + usshBalo.getColor());
        }
    }
}