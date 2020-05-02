package com.devarsh013;

public class currency {
    private String name;

        public void sameType(double amount)
        {
            System.out.println("Same Type Of Currency:"+amount);


        }

    public  double RsToUsd(double amount)
    {
        amount=amount/75.52;

        return  amount;

    }

    public  double UsdToRs(double amount)
    {
        amount=amount*75.52;

        return  amount;

    }

    public  double RsToEuro(double amount)
    {
        amount=amount/75.52;

        return  amount;

    }

    public  double EuroToRs(double amount)
    {
        amount=amount*75.52;

        return  amount;

    }

    public  double RsTo(double amount)
    {
        amount=amount*75.52;

        return  amount;

    }







}




