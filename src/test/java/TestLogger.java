import org.junit.Test;
import org.suns.inspection.logger.InspectionLogger;

public class TestLogger {
    @Test
    public void test(){
        InspectionLogger.turnOnDebug();
        InspectionLogger.info("Test Info");
        InspectionLogger.debug("Debug Info");
        InspectionLogger.error("Test Error");

        InspectionLogger.turnOffDebug();
        InspectionLogger.info("Test Info");
        InspectionLogger.debug("Debug Info");
        InspectionLogger.error("Test Error");
    }

}
