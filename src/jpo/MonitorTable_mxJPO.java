/*
 * Copyright (c) 2021.
 * @author Muhammad Shams - mshamsj@gmail.com
 * @version 1.0
 *
 */

package jpo;

import com.matrixone.apps.domain.util.MapList;
import matrix.db.Context;
import matrix.db.JPO;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class MonitorTable_mxJPO {
    private final String PARAM_NAME = "paramName";
    private final String PARAM_VALUE = "paramVal";
    private final String HTML_START = "<html><body>";
    private final String HTML_END = "</body></html>";
    private final String HTML_PR_START = "<p>";
    private final String HTML_PR_END = "</p>";

    @com.matrixone.apps.framework.ui.ProgramCallable
    public MapList getMonitorLines(Context context, String[] args) throws Exception {
        MapList result = new MapList();

        try {
            jpo.dto.MonitorObject_mxJPO mon = jpo.Monitor_mxJPO.getData(context);
            jpo.dto.ContextObject_mxJPO[] information = mon.getContextInfo();
            for (jpo.dto.ContextObject_mxJPO item : information) {
                result.add(item.toMap());
            }

            return result;
        } catch (Exception e) {
            throw new Exception("getMonitorLines", e);
        }
    }

    @com.matrixone.apps.framework.ui.ProgramCallable
    public Vector getParamByColumnName(Context context, String[] args) throws Exception {
        Vector vResult = new Vector();
        HashMap programMap = JPO.unpackArgs(args);
        HashMap mapColumn = (HashMap) programMap.get("columnMap");
        String paramName = (String) mapColumn.get("name");
        MapList mapListObjects = (MapList) programMap.get("objectList");

        for (Object mapListObject : mapListObjects) {
            Map mapItem = (Map) mapListObject;
            String result;

            try {
                result = mapItem.get(paramName).toString();
            } catch (Exception e) {
                result = "-";
            }

            vResult.add(result);
        }
        return vResult;
    }

    public String getSummaryAsHTML(Context context, String[] args) throws Exception {
        try {
            jpo.dto.MonitorObject_mxJPO mon = jpo.Monitor_mxJPO.getData(context);
            String strLines = mon.getSummaryInfo().toString();
            String[] lines = strLines.split("\n");

            StringBuilder result = new StringBuilder("");
            for (String line : lines) {
                result.append(HTML_PR_START);
                result.append(line);
                result.append(HTML_PR_END);
            }

            return HTML_START + result + HTML_END;
        } catch (
                Exception e) {
            throw new Exception("getSummaryAsHTML", e);
        }
    }

    @com.matrixone.apps.framework.ui.ProgramCallable
    public MapList getSummaryLines(Context context, String[] args) throws Exception {
        MapList result = new MapList();

        try {
            jpo.dto.MonitorObject_mxJPO mon = jpo.Monitor_mxJPO.getData(context);
            String strLines = mon.getSummaryInfo().toString();
            String[] lines = strLines.split("\n");

            for (String line : lines) {
                String[] strTmp = line.split("=");
                if (strTmp.length == 2) {
                    Map obj = new HashMap();
                    obj.put(PARAM_NAME, strTmp[0]);
                    obj.put(PARAM_VALUE, strTmp[1]);

                    result.add(obj);
                }
            }

            return result;
        } catch (Exception e) {
            throw new Exception("getSummaryLines", e);
        }
    }

}
