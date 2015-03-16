/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tramasoli.testjaxws.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author fabio
 */

@WebService(serviceName = "Calculadora")
public class Math {
    
    @WebMethod
    public int sum(int x, int y) {
        return x+y;
    }
    
    @WebMethod
    public int sub(int x, int y) {
        return x-y;
    }
    
    @WebMethod
    public int mult(int x, int y) {
        return x*y;
    }
    
    @WebMethod
    public int division(int x, int y) {
        return x/y;
    }
    
    @WebMethod
    public int pow(int x, int y) {
        return (int)java.lang.Math.pow(x, y);
    }
    
}
