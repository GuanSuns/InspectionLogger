package org.suns.inspection.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InspectionLogger {
    private static boolean isDebug = false;
    private static Logger logger = null;

    public static void turnOffDebug(){
        isDebug = false;
    }

    public static void turnOnDebug(){
        isDebug = true;
    }

    public static boolean isDebug(){
        return isDebug;
    }

    private static void initLogger(){
        logger = LoggerFactory.getLogger(org.suns.inspection.logger.InspectionLogger.class);
    }

    public static void debug(String info){
        if(logger == null){
            initLogger();
        }

        if(isDebug()){
            logger.debug(info);
        }
    }

    public static void info(String info){
        if(logger == null){
            initLogger();
        }

        logger.info(info);
    }

    public static void error(String info){
        if(logger == null){
            initLogger();
        }

        logger.error(info);
    }
}
