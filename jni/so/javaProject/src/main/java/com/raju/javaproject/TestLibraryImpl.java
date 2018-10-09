/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raju.javaproject;

import com.sun.jna.Pointer;

/**
 *
 * @author ismail
 */
public class TestLibraryImpl implements TestLibrary{

    @Override
    public JNICALL Java_MyMain_printmsg(JNIEnv JNIEnvPtr1) {
        System.err.println(JNIEnvPtr1.getPointer());
        JNICALL call = new JNICALL(JNIEnvPtr1.getPointer());
        return call;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
