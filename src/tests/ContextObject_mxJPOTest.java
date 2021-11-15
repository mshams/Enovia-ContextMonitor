/*
 * Copyright (c) 2021.
 * @author Muhammad Shams - mshamsj@gmail.com
 * @version 1.0
 *
 */

package tests;


import jpo.dto.ContextObject_mxJPO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ContextObject_mxJPOTest {

    private static ContextObject_mxJPO obj;

    @BeforeAll
    static void beforeAll() {
        String buffer = "<contextObject>\n" +
                "<sessionId><![CDATA[09AC7B7E86173DA9A51C7FA70AA66956:mx12253193920:(emxNavigator_jsp.java:481)]]></sessionId>\n" +
                "<current>false</current>\n" +
                "<busy>false</busy>\n" +
                "<user><![CDATA[USERNAME]]></user>\n" +
                "<loggedIn>false</loggedIn>\n" +
                "<tenant><![CDATA[]]></tenant>\n" +
                "<vault><![CDATA[eService Production]]></vault>\n" +
                "<thread>16228</thread>\n" +
                "<command>freeContext.bosInterface</command>\n" +
                "<idle>P17H46M32S</idle>\n" +
                "<cacheSize>0</cacheSize>\n" +
                "</contextObject>";

        obj = ContextObject_mxJPO.createFromString(buffer);
        System.out.println(obj);
    }

    @Test
    void createFromString() {
        assertNotNull(obj);
    }

    @Test
    void getSessionId() {
        assertNotNull(obj.getSessionId());
    }

    @Test
    void getUser() {
        assertNotNull(obj.getUser());
    }

    @Test
    void getTenant() {
        assertNotNull(obj.getTenant());
    }

    @Test
    void getVault() {
        assertNotNull(obj.getVault());
    }

    @Test
    void getCommand() {
        assertNotNull(obj.getCommand());
    }

    @Test
    void getCurrent() {
        assertNotNull(obj.getCurrent());
    }

    @Test
    void getBusy() {
        assertNotNull(obj.getBusy());
    }

    @Test
    void getLoggedIn() {
        assertNotNull(obj.getLoggedIn());
    }

    @Test
    void getIdle() {
        assertNotNull(obj.getIdle());
    }

}