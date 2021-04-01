package com.matimbahobs;
import com.matimbahobs.TaxCalculator;
import org.json.JSONObject;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;


@RestController
@RequestMapping("/calculator")
public class TaxCalculatorController {



    @PostMapping(value = "/tax",produces = "application/json",consumes = "application/json")
    public double CalculateTax(@PathParam("age") int age, @PathParam("salary") double salary, @PathParam("year") int year,
                               @PathParam("nMember") double nMember,@PathParam("taxType") String taxType) throws Exception {


       TaxCalculator taxCalculator= new TaxCalculator(age,salary,year,nMember, taxType);
        taxCalculator.setYear(year);
        taxCalculator.setSalary(salary);
        taxCalculator.setAge(age);

        taxCalculator.calcTax();

        return taxCalculator.calcTax();
    }




}
