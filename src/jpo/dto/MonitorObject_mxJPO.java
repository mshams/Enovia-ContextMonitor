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
import java.io.File;
import java.io.StringReader;

@XmlRootElement(name = "monitorContext")
public class MonitorObject_mxJPO {
    private long objectCount;
    private jpo.dto.ContextObject_mxJPO[] contextInfo;
    private jpo.dto.SummaryObject_mxJPO summaryInfo;

    public static MonitorObject_mxJPO createFromString(String buffer) {
        MonitorObject_mxJPO obj = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(MonitorObject_mxJPO.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            StringReader reader = new StringReader(buffer);
            obj = (MonitorObject_mxJPO) jaxbUnmarshaller.unmarshal(reader);
        } catch (Exception e) {
            System.out.println(e.toString());
            obj = null;
        }

        return obj;
    }

    public static MonitorObject_mxJPO createFromString(File file) {
        MonitorObject_mxJPO obj = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(MonitorObject_mxJPO.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            obj = (MonitorObject_mxJPO) jaxbUnmarshaller.unmarshal(file);
        } catch (Exception e) {
            System.out.println(e.toString());
            obj = null;
        }

        return obj;
    }

    public MonitorObject_mxJPO() {
    }

    public long getObjectCount() {
        return objectCount;
    }

    @XmlElement(name = "objectCount")
    public void setObjectCount(long objectCount) {
        this.objectCount = objectCount;
    }

    public jpo.dto.ContextObject_mxJPO[] getContextInfo() {
        return contextInfo;
    }

    @XmlElement(name = "contextObject")
    public void setContextInfo(jpo.dto.ContextObject_mxJPO[] contextInfo) {
        this.contextInfo = contextInfo;
    }

    public jpo.dto.SummaryObject_mxJPO getSummaryInfo() {
        return summaryInfo;
    }

    @XmlElement(name = "summary")
    public void setSummaryInfo(jpo.dto.SummaryObject_mxJPO summaryInfo) {
        this.summaryInfo = summaryInfo;
    }

    @Override
    public String toString() {
        return "MonitorObject_mxJPO{" +
                "  \nobjectCount=" + objectCount +
                ", \ncontextInfo=" + contextInfo.length +
                ", \nsummaryInfo=" + summaryInfo +
                '}';
    }
}