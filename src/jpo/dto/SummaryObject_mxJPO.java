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

@XmlRootElement(name = "summary")
public class SummaryObject_mxJPO {
    private long sessionCacheSize;
    private long numThreads;
    private long dbConnects;
    private long dbDisconnects;
    private long dbConnectsExceedPool;
    private long dbConnectAffinityMisses;
    private long sqlStmtsExecuted;
    private long sqlStmtsParsed;
    private long stateful;
    private long stateless;
    private long transStarted;
    private long transCommitted;
    private long transAborted;
    private long transTimedOut;
    private long exceptions;
    private long adminHandleOpen;
    private long instanceHandleOpen;
    private long maxProgramDepth;
    private long maxConcurrentThreads;
    private long freeTclInterp;
    private long busyTclInterp;
    private long systemAlerts;
    private long systemAlertsQueued;
    private long systemAlertsFlushed;
    private long systemAlertsSent;
    private long memoryHighwater;
    private long memoryBytesAllocated;
    private long memoryBlocksAllocated;
    private long memoryBytesReserved;
    private long memoryBlocksReserved;
    private long memorySystemLimit;
    private long memoryCacheLimit;
    private long startDateTime;
    private long upTime;
    private long jvmTotalMemory;
    private long jvmMaxMemory;
    private long jvmFreeMemory;
    private long jvmMemoryInUse;
    private long jvmAvailableProcessors;

    /**
     * @param buffer XML string
     * @return New instance of Summary
     */
    public static SummaryObject_mxJPO createFromString(String buffer) {
        SummaryObject_mxJPO obj = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(SummaryObject_mxJPO.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            StringReader reader = new StringReader(buffer);
            obj = (SummaryObject_mxJPO) jaxbUnmarshaller.unmarshal(reader);
        } catch (Exception e) {
            System.out.println(e.toString());
            obj = null;
        }

        return obj;
    }

    public SummaryObject_mxJPO() {
    }

    @XmlElement
    public void setSessionCacheSize(long sessionCacheSize) {
        this.sessionCacheSize = sessionCacheSize;
    }

    @XmlElement
    public void setNumThreads(long numThreads) {
        this.numThreads = numThreads;
    }

    @XmlElement
    public void setDbConnects(long dbConnects) {
        this.dbConnects = dbConnects;
    }

    @XmlElement
    public void setDbDisconnects(long dbDisconnects) {
        this.dbDisconnects = dbDisconnects;
    }

    @XmlElement
    public void setDbConnectsExceedPool(long dbConnectsExceedPool) {
        this.dbConnectsExceedPool = dbConnectsExceedPool;
    }

    @XmlElement
    public void setDbConnectAffinityMisses(long dbConnectAffinityMisses) {
        this.dbConnectAffinityMisses = dbConnectAffinityMisses;
    }

    @XmlElement
    public void setSqlStmtsExecuted(long sqlStmtsExecuted) {
        this.sqlStmtsExecuted = sqlStmtsExecuted;
    }

    @XmlElement
    public void setSqlStmtsParsed(long sqlStmtsParsed) {
        this.sqlStmtsParsed = sqlStmtsParsed;
    }

    @XmlElement
    public void setStateful(long stateful) {
        this.stateful = stateful;
    }

    @XmlElement
    public void setStateless(long stateless) {
        this.stateless = stateless;
    }

    @XmlElement
    public void setTransStarted(long transStarted) {
        this.transStarted = transStarted;
    }

    @XmlElement
    public void setTransCommitted(long transCommitted) {
        this.transCommitted = transCommitted;
    }

    @XmlElement
    public void setTransAborted(long transAborted) {
        this.transAborted = transAborted;
    }

    @XmlElement
    public void setTransTimedOut(long transTimedOut) {
        this.transTimedOut = transTimedOut;
    }

    @XmlElement
    public void setExceptions(long exceptions) {
        this.exceptions = exceptions;
    }

    @XmlElement
    public void setAdminHandleOpen(long adminHandleOpen) {
        this.adminHandleOpen = adminHandleOpen;
    }

    @XmlElement
    public void setInstanceHandleOpen(long instanceHandleOpen) {
        this.instanceHandleOpen = instanceHandleOpen;
    }

    @XmlElement
    public void setMaxProgramDepth(long maxProgramDepth) {
        this.maxProgramDepth = maxProgramDepth;
    }

    @XmlElement
    public void setMaxConcurrentThreads(long maxConcurrentThreads) {
        this.maxConcurrentThreads = maxConcurrentThreads;
    }

    @XmlElement
    public void setFreeTclInterp(long freeTclInterp) {
        this.freeTclInterp = freeTclInterp;
    }

    @XmlElement
    public void setBusyTclInterp(long busyTclInterp) {
        this.busyTclInterp = busyTclInterp;
    }

    @XmlElement
    public void setSystemAlerts(long systemAlerts) {
        this.systemAlerts = systemAlerts;
    }

    @XmlElement
    public void setSystemAlertsQueued(long systemAlertsQueued) {
        this.systemAlertsQueued = systemAlertsQueued;
    }

    @XmlElement
    public void setSystemAlertsFlushed(long systemAlertsFlushed) {
        this.systemAlertsFlushed = systemAlertsFlushed;
    }

    @XmlElement
    public void setSystemAlertsSent(long systemAlertsSent) {
        this.systemAlertsSent = systemAlertsSent;
    }

    @XmlElement
    public void setMemoryHighwater(long memoryHighwater) {
        this.memoryHighwater = memoryHighwater;
    }

    @XmlElement
    public void setMemoryBytesAllocated(long memoryBytesAllocated) {
        this.memoryBytesAllocated = memoryBytesAllocated;
    }

    @XmlElement
    public void setMemoryBlocksAllocated(long memoryBlocksAllocated) {
        this.memoryBlocksAllocated = memoryBlocksAllocated;
    }

    @XmlElement
    public void setMemoryBytesReserved(long memoryBytesReserved) {
        this.memoryBytesReserved = memoryBytesReserved;
    }

    @XmlElement
    public void setMemoryBlocksReserved(long memoryBlocksReserved) {
        this.memoryBlocksReserved = memoryBlocksReserved;
    }

    @XmlElement
    public void setMemorySystemLimit(long memorySystemLimit) {
        this.memorySystemLimit = memorySystemLimit;
    }

    @XmlElement
    public void setMemoryCacheLimit(long memoryCacheLimit) {
        this.memoryCacheLimit = memoryCacheLimit;
    }

    @XmlElement
    public void setStartDateTime(long startDateTime) {
        this.startDateTime = startDateTime;
    }

    @XmlElement
    public void setUpTime(long upTime) {
        this.upTime = upTime;
    }

    @XmlElement
    public void setJvmTotalMemory(long jvmTotalMemory) {
        this.jvmTotalMemory = jvmTotalMemory;
    }

    @XmlElement
    public void setJvmMaxMemory(long jvmMaxMemory) {
        this.jvmMaxMemory = jvmMaxMemory;
    }

    @XmlElement
    public void setJvmFreeMemory(long jvmFreeMemory) {
        this.jvmFreeMemory = jvmFreeMemory;
    }

    @XmlElement
    public void setJvmMemoryInUse(long jvmMemoryInUse) {
        this.jvmMemoryInUse = jvmMemoryInUse;
    }

    @XmlElement
    public void setJvmAvailableProcessors(long jvmAvailableProcessors) {
        this.jvmAvailableProcessors = jvmAvailableProcessors;
    }

    public long getSessionCacheSize() {
        return sessionCacheSize;
    }

    public long getNumThreads() {
        return numThreads;
    }

    public long getDbConnects() {
        return dbConnects;
    }

    public long getDbDisconnects() {
        return dbDisconnects;
    }

    public long getDbConnectsExceedPool() {
        return dbConnectsExceedPool;
    }

    public long getDbConnectAffinityMisses() {
        return dbConnectAffinityMisses;
    }

    public long getSqlStmtsExecuted() {
        return sqlStmtsExecuted;
    }

    public long getSqlStmtsParsed() {
        return sqlStmtsParsed;
    }

    public long getStateful() {
        return stateful;
    }

    public long getStateless() {
        return stateless;
    }

    public long getTransStarted() {
        return transStarted;
    }

    public long getTransCommitted() {
        return transCommitted;
    }

    public long getTransAborted() {
        return transAborted;
    }

    public long getTransTimedOut() {
        return transTimedOut;
    }

    public long getExceptions() {
        return exceptions;
    }

    public long getAdminHandleOpen() {
        return adminHandleOpen;
    }

    public long getInstanceHandleOpen() {
        return instanceHandleOpen;
    }

    public long getMaxProgramDepth() {
        return maxProgramDepth;
    }

    public long getMaxConcurrentThreads() {
        return maxConcurrentThreads;
    }

    public long getFreeTclInterp() {
        return freeTclInterp;
    }

    public long getBusyTclInterp() {
        return busyTclInterp;
    }

    public long getSystemAlerts() {
        return systemAlerts;
    }

    public long getSystemAlertsQueued() {
        return systemAlertsQueued;
    }

    public long getSystemAlertsFlushed() {
        return systemAlertsFlushed;
    }

    public long getSystemAlertsSent() {
        return systemAlertsSent;
    }

    public long getMemoryHighwater() {
        return memoryHighwater;
    }

    public long getMemoryBytesAllocated() {
        return memoryBytesAllocated;
    }

    public long getMemoryBlocksAllocated() {
        return memoryBlocksAllocated;
    }

    public long getMemoryBytesReserved() {
        return memoryBytesReserved;
    }

    public long getMemoryBlocksReserved() {
        return memoryBlocksReserved;
    }

    public long getMemorySystemLimit() {
        return memorySystemLimit;
    }

    public long getMemoryCacheLimit() {
        return memoryCacheLimit;
    }

    public long getStartDateTime() {
        return startDateTime;
    }

    public long getUpTime() {
        return upTime;
    }

    public long getJvmTotalMemory() {
        return jvmTotalMemory;
    }

    public long getJvmMaxMemory() {
        return jvmMaxMemory;
    }

    public long getJvmFreeMemory() {
        return jvmFreeMemory;
    }

    public long getJvmMemoryInUse() {
        return jvmMemoryInUse;
    }

    public long getJvmAvailableProcessors() {
        return jvmAvailableProcessors;
    }

    @Override
    public String toString() {
        return "\nsessionCacheSize=" + sessionCacheSize +
                "\nnumThreads=" + numThreads +
                "\ndbConnects=" + dbConnects +
                "\ndbDisconnects=" + dbDisconnects +
                "\ndbConnectsExceedPool=" + dbConnectsExceedPool +
                "\ndbConnectAffinityMisses=" + dbConnectAffinityMisses +
                "\nsqlStmtsExecuted=" + sqlStmtsExecuted +
                "\nsqlStmtsParsed=" + sqlStmtsParsed +
                "\nstateful=" + stateful +
                "\nstateless=" + stateless +
                "\ntransStarted=" + transStarted +
                "\ntransCommitted=" + transCommitted +
                "\ntransAborted=" + transAborted +
                "\ntransTimedOut=" + transTimedOut +
                "\nexceptions=" + exceptions +
                "\nadminHandleOpen=" + adminHandleOpen +
                "\ninstanceHandleOpen=" + instanceHandleOpen +
                "\nmaxProgramDepth=" + maxProgramDepth +
                "\nmaxConcurrentThreads=" + maxConcurrentThreads +
                "\nfreeTclInterp=" + freeTclInterp +
                "\nbusyTclInterp=" + busyTclInterp +
                "\nsystemAlerts=" + systemAlerts +
                "\nsystemAlertsQueued=" + systemAlertsQueued +
                "\nsystemAlertsFlushed=" + systemAlertsFlushed +
                "\nsystemAlertsSent=" + systemAlertsSent +
                "\nmemoryHighwater=" + memoryHighwater +
                "\nmemoryBytesAllocated=" + memoryBytesAllocated +
                "\nmemoryBlocksAllocated=" + memoryBlocksAllocated +
                "\nmemoryBytesReserved=" + memoryBytesReserved +
                "\nmemoryBlocksReserved=" + memoryBlocksReserved +
                "\nmemorySystemLimit=" + memorySystemLimit +
                "\nmemoryCacheLimit=" + memoryCacheLimit +
                "\nstartDateTime=" + startDateTime +
                "\nupTime=" + upTime +
                "\njvmTotalMemory=" + jvmTotalMemory +
                "\njvmMaxMemory=" + jvmMaxMemory +
                "\njvmFreeMemory=" + jvmFreeMemory +
                "\njvmMemoryInUse=" + jvmMemoryInUse +
                "\njvmAvailableProcessors=" + jvmAvailableProcessors;
    }
}