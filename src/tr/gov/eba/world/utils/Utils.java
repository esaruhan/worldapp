/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.eba.world.utils;

import java.sql.Timestamp;
import java.util.ResourceBundle;
import tr.gov.eba.log.EBALog;
import tr.gov.eba.log.EBALogger;

/**
 *
 * @author maktas
 */
public class Utils {

    public static final String appName;
    
    static {
        ResourceBundle rb = ResourceBundle.getBundle("tr.gov.eba.world.resources.resources");
        appName = rb.getString("eba.app.name");
    }

    public static void insertErrorLog(String methodName, Exception e) {
        EBALog log = new EBALog(methodName + "()", e.getMessage(), "1", appName, EBALog.LEVEL.Error);
        EBALogger.addLog(log);
    }
     public static void insertErrorLog(String methodName, String msg) {
        EBALog log = new EBALog(methodName + "()", msg, "1", appName, EBALog.LEVEL.Error);
        EBALogger.addLog(log);
    }
    

    public static boolean checkAndReturnBoolean(String param) {
        try {
            int paramINT = Integer.parseInt(param);
            return paramINT == 1 ? true : paramINT == 0 ? false : false;
        } catch (Exception e) {
        }
        return false;
    }

    public static Integer checkAndReturnInteger(String param) {
        try {
            return Integer.parseInt(param);
        } catch (Exception e) {
            return null;
        }
    }

    public static Long checkAndReturnLong(String param) {
        try {
            return Long.parseLong(param);
        } catch (Exception e) {
            return null;
        }
    }

    public static Timestamp checkAndReturnTimeStamp(String param) {
        try {
            return Timestamp.valueOf(param);
        } catch (Exception e) {
            return null;
        }
    }

    public static String checkAndReturnQuestionType(String param) {
        try {
            if (param.equals("SINGLE") || param.equals("MULTI")) {
                return param;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public static String checkAndReturnOptionType(String param) {
        try {
            if (param.equals("TEXT") || param.equals("CHOICE")) {
                return param;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public static String checkAndReturnType(String param) {
        try {
            if (param.equals("s") || param.equals("q") || param.equals("o")) {
                return param;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public static boolean anyNulls(Object... params) {
        for (Object o : params) {
            if (o == null) {
                return true;
            }
        }
        return false;
    }
    /*Sanitizers*/

    public static String sanitize(String param) {
        if (param == null || param.equals("")) {
            return null;
        } else {
            String clean = param.trim();
            clean = clean.replaceAll("'", ""); // <---- Big5
            clean = clean.replaceAll("\"", "");//   |
            clean = clean.replaceAll("&", ""); //   |
            clean = clean.replaceAll("<", ""); //   |
            clean = clean.replaceAll(">", ""); // <---- Big5

            if (clean.length() == 0) {
                return null;
            }
            return clean;
        }
    }
}
