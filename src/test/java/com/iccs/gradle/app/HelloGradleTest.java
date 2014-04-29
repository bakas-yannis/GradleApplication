package com.iccs.gradle.app;

import junit.framework.TestCase;

public class HelloGradleTest extends TestCase {

    public void testSayHello() throws Exception {
        assertEquals("Hello", new HelloGradle().sayHello());
    }
}