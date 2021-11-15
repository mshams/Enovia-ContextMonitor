/*
 * Copyright (c) 2021.
 * @author Muhammad Shams - mshamsj@gmail.com
 * @version 1.0
 *
 */

package tests;

import jpo.dto.MonitorObject_mxJPO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class MonitorObject_mxJPOTest {
    private static MonitorObject_mxJPO obj;

    @BeforeAll
    static void beforeAll() {
        String filePath = "src\\tests\\xml\\InputData.xml";
        obj = MonitorObject_mxJPO.createFromString(new File(filePath));
        System.out.println(obj);
    }

    @Test
    void createFromString() {
        assertNotNull(obj);
    }

    @Test
    void getObjectCount() {
        assertEquals(obj.getContextInfo().length, obj.getObjectCount());
    }

    @Test
    void getContextInfo() {
        assertNotNull(obj.getContextInfo());
    }

    @Test
    void getSummaryInfo() {
        assertNotNull(obj.getSummaryInfo());
    }
}