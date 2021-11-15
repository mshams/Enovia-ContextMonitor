/*
 * Copyright (c) 2021.
 * @author Muhammad Shams - mshamsj@gmail.com
 * @version 1.0
 *
 */

package jpo.dto;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Holder class for context data
 */

@XmlRootElement(name = "contextObject")
public class ContextObject_mxJPO {
    private final String SESSIONID = "sessionId";
    private final String USER = "user";
    private final String TENANT = "tenant";
    private final String VAULT = "vault";
    private final String COMMAND = "command";
    private final String IDLE = "idle";
    private final String IDLESECONDS = "idleSeconds";
    private final String CURRENT = "current";
    private final String BUSY = "busy";
    private final String LOGGEDIN = "loggedIn";
    private final String THREAD = "thread";
    private final String CACHESIZE = "cacheSize";

    private String sessionId;
    private String user;
    private String tenant;
    private String vault;
    private String command;
    private String idle;
    private long idleSeconds;
    private Boolean current;
    private Boolean busy;
    private Boolean loggedIn;
    private int thread;
    private int cacheSize;

    /**
     * @param buffer XML string
     * @return New instance of ContextObject
     */
    public static ContextObject_mxJPO createFromString(String buffer) {
        ContextObject_mxJPO obj = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ContextObject_mxJPO.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            StringReader reader = new StringReader(buffer);
            obj = (ContextObject_mxJPO) jaxbUnmarshaller.unmarshal(reader);
        } catch (Exception e) {
            System.out.println(e.toString());
            obj = null;
        }

        return obj;
    }

    public ContextObject_mxJPO() {
    }

    public String getSessionId() {
        return sessionId;
    }

    @XmlElement
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getUser() {
        return user;
    }

    @XmlElement
    public void setUser(String user) {
        this.user = user;
    }

    public String getTenant() {
        return tenant;
    }

    @XmlElement
    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public String getVault() {
        return vault;
    }

    @XmlElement
    public void setVault(String vault) {
        this.vault = vault;
    }

    public String getCommand() {
        return command;
    }

    @XmlElement
    public void setCommand(String command) {
        this.command = command;
    }

    public Boolean getCurrent() {
        return current;
    }

    @XmlElement
    public void setCurrent(Boolean current) {
        this.current = current;
    }

    public Boolean getBusy() {
        return busy;
    }

    @XmlElement
    public void setBusy(Boolean busy) {
        this.busy = busy;
    }

    public Boolean getLoggedIn() {
        return loggedIn;
    }

    @XmlElement
    public void setLoggedIn(Boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public int getThread() {
        return thread;
    }

    @XmlElement
    public void setThread(int thread) {
        this.thread = thread;
    }

    public String getIdle() {
        return idle;
    }

    @XmlElement
    public void setIdle(String idle) {
        this.idle = idle;

        long seconds = 0;
        int pos;
        String temp;
        if (idle != null && !idle.isEmpty()) {
            idle = idle.toUpperCase();
            idle = idle.replace("P", "");

            pos = idle.indexOf("DT");
            if (pos >= 0) {
                temp = idle.substring(0, pos);
                seconds += Integer.parseInt(temp) * 60 * 60 * 24;
                idle = idle.substring(pos + 2);
            }
            pos = idle.indexOf("H");
            if (pos >= 0) {
                temp = idle.substring(0, pos);
                seconds += Integer.parseInt(temp) * 60 * 60;
                idle = idle.substring(pos + 1);
            }
            pos = idle.indexOf("M");
            if (pos >= 0) {
                temp = idle.substring(0, pos);
                seconds += Integer.parseInt(temp) * 60;
                idle = idle.substring(pos + 1);
            }
            pos = idle.indexOf("S");
            if (pos >= 0) {
                temp = idle.substring(0, pos);
                seconds += Integer.parseInt(temp);
            }
        }

        this.idleSeconds = seconds;
    }

    public long getIdleSeconds() {
        return idleSeconds;
    }

    public int getCacheSize() {
        return cacheSize;
    }

    @XmlElement
    public void setCacheSize(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    @Override
    public String toString() {
        return "ContextObject{" +
                "  \nsessionId='" + sessionId + '\'' +
                ", \nuser='" + user + '\'' +
                ", \ntenant='" + tenant + '\'' +
                ", \nvault='" + vault + '\'' +
                ", \ncommand='" + command + '\'' +
                ", \ncurrent=" + current +
                ", \nbusy=" + busy +
                ", \nloggedIn=" + loggedIn +
                ", \nthread=" + thread +
                ", \nidle=" + idle +
                ", \nidleSeconds=" + idleSeconds +
                ", \ncacheSize=" + cacheSize +
                '}';
    }


    public Map toMap() {
        Map obj = new HashMap();
        obj.put(SESSIONID, getSessionId());
        obj.put(USER, getUser());
        obj.put(TENANT, getTenant());
        obj.put(VAULT, getVault());
        obj.put(COMMAND, getCommand());
        obj.put(IDLE, getIdle());
        obj.put(IDLESECONDS, String.valueOf(getIdleSeconds()));
        obj.put(CURRENT, getCurrent().toString());
        obj.put(BUSY, getBusy().toString());
        obj.put(LOGGEDIN, getLoggedIn().toString());
        obj.put(THREAD, String.valueOf(getThread()));
        obj.put(CACHESIZE, String.valueOf(getCacheSize()));
        return obj;
    }
}