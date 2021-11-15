package tests;

import jpo.dto.SummaryObject_mxJPO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SummaryObject_mxJPOTest {
    private static SummaryObject_mxJPO obj;

    @BeforeAll
    static void beforeAll() {
        String buffer =
                "<summary>\n" +
                        "<sessionCacheSize> 0</sessionCacheSize>\n" +
                        "<numThreads>46</numThreads>\n" +
                        "<dbConnects>40</dbConnects>\n" +
                        "<dbDisconnects>0</dbDisconnects>\n" +
                        "<dbConnectsExceedPool>0</dbConnectsExceedPool>\n" +
                        "<dbConnectAffinityMisses>0</dbConnectAffinityMisses>\n" +
                        "<sqlStmtsExecuted>3565694</sqlStmtsExecuted>\n" +
                        "<sqlStmtsParsed>83653</sqlStmtsParsed>\n" +
                        "<stateful>885379</stateful>\n" +
                        "<stateless>2229689</stateless>\n" +
                        "<transStarted>1921113</transStarted>\n" +
                        "<transCommitted>1920501</transCommitted>\n" +
                        "<transAborted>611</transAborted>\n" +
                        "<transTimedOut>0</transTimedOut>\n" +
                        "<exceptions>1350</exceptions>\n" +
                        "<adminHandleOpen>24679231</adminHandleOpen>\n" +
                        "<instanceHandleOpen>707925</instanceHandleOpen>\n" +
                        "<maxProgramDepth>11</maxProgramDepth>\n" +
                        "<maxConcurrentThreads>1</maxConcurrentThreads>\n" +
                        "<freeTclInterp>10</freeTclInterp>\n" +
                        "<busyTclInterp>0</busyTclInterp>\n" +
                        "<systemAlerts>0</systemAlerts>\n" +
                        "<systemAlertsQueued>0</systemAlertsQueued>\n" +
                        "<systemAlertsFlushed>0</systemAlertsFlushed>\n" +
                        "<systemAlertsSent>0</systemAlertsSent>\n" +
                        "<memoryHighwater>239564764</memoryHighwater>\n" +
                        "<memoryBytesAllocated>108942580</memoryBytesAllocated>\n" +
                        "<memoryBlocksAllocated>9990</memoryBlocksAllocated>\n" +
                        "<memoryBytesReserved>38125568</memoryBytesReserved>\n" +
                        "<memoryBlocksReserved>2327</memoryBlocksReserved>\n" +
                        "<memorySystemLimit>8589934592</memorySystemLimit>\n" +
                        "<memoryCacheLimit>0</memoryCacheLimit>\n" +
                        "<startDateTime>1636471042</startDateTime>\n" +
                        "<upTime>489277  </upTime>\n" +
                        "<jvmTotalMemory>2119696384</jvmTotalMemory>\n" +
                        "<jvmMaxMemory>2119696384</jvmMaxMemory>\n" +
                        "<jvmFreeMemory>476178160</jvmFreeMemory>\n" +
                        "<jvmMemoryInUse>1643518224</jvmMemoryInUse>\n" +
                        "<jvmAvailableProcessors>12</jvmAvailableProcessors>\n" +
                        "</summary>";

        obj = SummaryObject_mxJPO.createFromString(buffer);
        System.out.println(obj);
    }

    @Test
    void createFromString() {
        assertNotNull(obj);
    }
}