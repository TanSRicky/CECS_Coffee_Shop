/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorators;

import Products.Drink;

/**
 *
 * @author tansr
 */
public class SoyMilk extends Milk {
    
    public SoyMilk(Drink base){
        super(base);
    }

    @Override
    public String getDescription() {
        return base.getDescription() + "Added: Soy Milk";
    }

    @Override
    public double getCost() {
        return base.getCost() + 1;
    }
}