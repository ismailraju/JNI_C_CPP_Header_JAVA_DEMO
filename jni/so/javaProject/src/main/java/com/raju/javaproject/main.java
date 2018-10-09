/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raju.javaproject;

/**
 *
 * @author ismail
 */
public class main {
    
    public static void main(String[] args) {
        TestLibraryImpl impl=new TestLibraryImpl();
        TestLibrary.JNIEnv JNIEnvPtr1 = new TestLibrary.JNIEnv();
        impl.Java_MyMain_printmsg(JNIEnvPtr1);
    }
    
}
