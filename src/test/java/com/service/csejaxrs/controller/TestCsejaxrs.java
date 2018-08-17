package com.service.csejaxrs.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCsejaxrs {

      CsejaxrsDelegate csejaxrsDelegate = new CsejaxrsDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = csejaxrsDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
