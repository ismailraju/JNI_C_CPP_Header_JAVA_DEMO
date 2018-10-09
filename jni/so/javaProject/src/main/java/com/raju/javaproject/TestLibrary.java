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
import com.ochafik.lang.jnaerator.runtime.LibraryExtractor;
import com.ochafik.lang.jnaerator.runtime.MangledFunctionMapper;
import com.ochafik.lang.jnaerator.runtime.Mangling;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;

/**
 * JNA Wrapper for library <b>test</b><br>
 * This file was autogenerated by
 * <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that
 * <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a
 * few opensource projects.</a>.<br>
 * For help, please visit
 * <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> ,
 * <a href="http://rococoa.dev.java.net/">Rococoa</a>, or
 * <a href="http://jna.dev.java.net/">JNA</a>.
 */
public interface TestLibrary extends Library {

    public static final String JNA_LIBRARY_NAME = "prtmsg";
    public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(TestLibrary.JNA_LIBRARY_NAME);
    public static final TestLibrary INSTANCE = (TestLibrary) Native.loadLibrary(TestLibrary.JNA_LIBRARY_NAME, TestLibrary.class);
//	public static final String JNA_LIBRARY_NAME = LibraryExtractor.getLibraryPath("test", true, TestLibrary.class);
//	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(TestLibrary.JNA_LIBRARY_NAME, MangledFunctionMapper.DEFAULT_OPTIONS);
//	public static final TestLibrary INSTANCE = (TestLibrary)Native.loadLibrary(TestLibrary.JNA_LIBRARY_NAME, TestLibrary.class, MangledFunctionMapper.DEFAULT_OPTIONS);

    /**
     * Original signature :
     * <code>JNICALL Java_MyMain_printmsg(JNIEnv*)</code><br>
     * <i>native declaration : line 15</i>
     */
    @Mangling({"_Z20Java_MyMain_printmsgP6JNIEnv", "?Java_MyMain_printmsg@@YA7JNICALLPA6JNIEnv@Z"})
    TestLibrary.JNICALL Java_MyMain_printmsg(TestLibrary.JNIEnv JNIEnvPtr1);
    /// Pointer to unknown (opaque) type

    public static class JNICALL extends PointerType {

        public JNICALL(Pointer address) {
            super(address);
        }

        public JNICALL() {
            super();
        }
    };
    /// Pointer to unknown (opaque) type

    public static class JNIEnv extends PointerType {

        public JNIEnv(Pointer address) {
            super(address);
        }

        public JNIEnv() {
            super();
        }
    };
}
