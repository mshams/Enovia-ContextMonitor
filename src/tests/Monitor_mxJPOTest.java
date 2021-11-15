/*
 * Copyright (c) 2021.
 * @author Muhammad Shams - mshamsj@gmail.com
 * @version 1.0
 *
 */

package tests;

import jpo.Monitor_mxJPO;
import jpo.dto.MonitorObject_mxJPO;
import matrix.db.Context;
import matrix.util.MatrixException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import tests.classes.Credential;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Monitor_mxJPOTest {
    private static Context ctx;
    private static MonitorObject_mxJPO obj;

    @BeforeAll
    static void beforeAll() {
        try {
            //Read credentials
            String filePath = "src\\tests\\xml\\ServerCredentials.xml";
            File file = new File(filePath);
            JAXBContext jaxbContext = JAXBContext.newInstance(Credential.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Credential obj = (Credential) jaxbUnmarshaller.unmarshal(file);

            //Create context
            ctx = new Context(obj.getServerURL());
            ctx.setRole(obj.getRole());
            ctx.setUser(obj.getUsername());
            ctx.setPassword(obj.getPassword());
            ctx.setVault(obj.getVault());
            ctx.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterAll
    static void afterAll() {
        if (ctx != null) {
            try {
                ctx.close();
                ctx.shutdown();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    void context() {
        assertTrue(ctx.isConnected());
    }

    @Test
    void getData() {
        try {
            obj = Monitor_mxJPO.getData(ctx);
            assertNotNull(obj);
            System.out.println(obj.toString());
        } catch (MatrixException e) {
            e.printStackTrace();
            assertTrue(false);
        }
    }
}