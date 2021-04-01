package com.matimbahobs;

public class TaxCalculator {

      int age;
     double salary;
     double tax;
     int year;
     double nMember;
     double netSalary;
     String taxType;



    public TaxCalculator(int age, double salary, int year, double nMember, String taxType)
    {
        this.age=age;
        this.salary=salary;
        this.year=year;
        this.nMember=nMember;
        this.taxType = taxType;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getnMember() {
        return nMember;
    }

    public void setnMember(double nMember) {
        this.nMember = nMember;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public double calcTax()
    {
        double total = 0;

        double substractions = 0;


        //check the kind of tax to be calculated Annually or Monthly
        if(taxType.equalsIgnoreCase("monthly"))
        {
            salary = salary*12;
        }
        else if(taxType.equalsIgnoreCase("annually"))
        {
            salary= salary;
        }

        int add = 0;

        if(year ==2021){

            final  double primary = 14958;
            final double secondary = 8199;
            final double tertiary = 2736;

            //Threshold valadations
            //the employee doesn't pay tax if this is true
            if(salary <= 83100 && age <65){

                total = total;
            }

            //if age is greater than 65 and less than 75 with annual salary of less than R128650 no tax
            if(salary <=128650 && age >=65 &&age <75)
            {
                total = total;

            }
            //if age is above 75 and annual salary is less than R143850
            if(age >75 && salary <=143850){
                total = total;

            }
            //Calculations for Memdical aid members
            double medicalAidCredit = 0;
            for (int i = 0; i < nMember;i++)
            {
                //Main Member and first dependent will pay R319
                if(i == 0 || i==1)
                {
                    medicalAidCredit = medicalAidCredit+319;
                }
                //if there are more than one dependents, they will each pay R215
                else if(i >1){
                    medicalAidCredit = medicalAidCredit+215;
                }
            }

            //Validations for Tax Rebates
            if(age <65)
                substractions = primary+medicalAidCredit;
            if(age >=65 && age <75)
                substractions= primary+secondary+medicalAidCredit;
            if(age>=75)
                substractions = primary+tertiary+medicalAidCredit;

            //Tax brackets calculations depending on annual income
            //Tax brackets classes
            double classA = 195850;
            double classB = 305850;
            double classC = 423300;
            double classD = 555600;
            double classE = 708310;
            double classF = 1500000;


            if(salary >0 && salary <= classA){
                total = salary*0.18;
            }
            if(salary > classA && salary<=classB)
            {
                add = 37062;
                double total_Perc = salary-classA;
                total =(((total_Perc*0.26)+add)- substractions)/12;
            }
             if(salary >classB && salary <classC)
            {
                add = 67144;


                double total1 = salary-classB;
                total = (((total1*0.31)+add)- substractions)/12;

            }

            if(salary >classC && salary <classD)
            {
                add = 105429;


                double total1 = salary-classD;
                total = (((total1*0.36)+add)- substractions)/12;

            }

            if(salary >classD && salary <classE)
            {
                add = 155505;


                double total1 = salary-classE;
                total = (((total1*0.39)+add)- substractions)/12;

            }

            if(salary >classE && salary <classF)
            {
                add = 218139;


                double total1 = salary-classF;
                total = (((total1*0.41)+add)- substractions)/12;

            }
            if(salary >classF)
            {
                add = 559464;


                double total1 = salary-classF;
                total = (((total1*0.45)+add)- substractions)/12;

            }
        }


        if(year ==2020){

            final  double primary = 14220;
            final double secondary = 7794;
            final double tertiary = 2601;

            //Threshold valadations
            //the employee doesn't pay tax if this is true
            if(salary <= 79000 && age <65){

                total = total;
            }

            //if age is greater than 65 and less than 75 with annual salary of less than R128650 no tax
            if(salary <=122300 && age >=65 &&age <75)
            {
                total = total;

            }
            //if age is above 75 and annual salary is less than R143850
            if(age >75 && salary <=136750){
                total = total;

            }
            //Calculations for Memdical aid members
            double medicalAidCredit = 0;
            for (int i = 0; i < nMember;i++)
            {
                //Main Member and first dependent will pay R319
                if(i == 0 || i==1)
                {
                    medicalAidCredit = medicalAidCredit+310;
                }
                //if there are more than one dependents, they will each pay R215
                else if(i >1){
                    medicalAidCredit = medicalAidCredit+209;
                }
            }

            //Validations for Tax Rebates
            if(age <65)
                substractions = primary;
            if(age >=65 && age <75)
                substractions= primary+secondary;
            if(age>=75)
                substractions = primary+tertiary;

            //Tax brackets calculations depending on annual income
            //Tax brackets classes
            double classA = 205900;
            double classB = 321600;
            double classC = 445100;
            double classD = 584200;
            double classE = 744800;
            double classF = 1577300;


            if(salary >0 && salary <= classA){
                total = salary*0.18;
            }
            if(salary > classA && salary<=classB)
            {
                add = 35253;
                double total_Perc = salary-classA;
                total =(((total_Perc*0.26)+add)- substractions)/12;
            }
            if(salary >classB && salary <classC)
            {
                add = 63853;


                double total1 = salary-classB;
                total = (((total1*0.31)+add)- substractions)/12;

            }

            if(salary >classC && salary <classD)
            {
                add = 100263;


                double total1 = salary-classD;
                total = (((total1*0.36)+add)- substractions)/12;

            }

            if(salary >classD && salary <classE)
            {
                add = 147891;


                double total1 = salary-classE;
                total = (((total1*0.39)+add)- substractions)/12;

            }

            if(salary >classE && salary <classF)
            {
                add = 207448;


                double total1 = salary-classF;
                total = (((total1*0.41)+add)- substractions)/12;

            }
            if(salary >classF)
            {
                add = 532041;


                double total1 = salary-classF;
                total = (((total1*0.45)+add)- substractions)/12;

            }
        }






        return total;
    }

    public double getNetSal()
    {
        netSalary = salary - tax;
        return netSalary;
    }
}
