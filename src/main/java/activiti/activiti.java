package activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;

public class activiti {
    public static void main(String[] args) throws  Exception{
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();

        defaultProcessEngine.close();
        System.exit(0);
    }
}
