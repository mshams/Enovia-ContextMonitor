/*
 * Copyright (c) 2021.
 * @author Muhammad Shams - mshamsj@gmail.com
 * @version 1.0
 *
 */

package jpo;

import matrix.db.Context;
import matrix.db.MQLCommand;
import matrix.util.MatrixException;


public class Monitor_mxJPO {
    private static final String MQL_GET_CONTEXT = "monitor context xml;";

    public Monitor_mxJPO(Context ctx) {
    }

    public static jpo.dto.MonitorObject_mxJPO getData(Context ctx) throws MatrixException {
        MQLCommand mqlCommand = new MQLCommand();
        mqlCommand.open(ctx);
        mqlCommand.executeCommand(ctx, MQL_GET_CONTEXT);
        String xmlStr = mqlCommand.getResult();
        jpo.dto.MonitorObject_mxJPO monitoringData = jpo.dto.MonitorObject_mxJPO.createFromString(xmlStr);
        mqlCommand.close(ctx);

        return monitoringData;
    }
}
