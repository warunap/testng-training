package org.test;

import org.testng.IExecutionListener;

import java.io.*;

public class ExecutionHandler implements IExecutionListener {
    @Override
    public void onExecutionStart() {
        System.out.println("test-start");

        String dataSourceConfig = "TEST";
        try {
            File updatedFile = new File("/home/warunara/test.txt");
            FileOutputStream is = new FileOutputStream(updatedFile);
            OutputStreamWriter osw = new OutputStreamWriter(is);
            Writer w = new BufferedWriter(osw);
            w.write(dataSourceConfig);
            w.close();
        } catch (Exception e) {
            handleException("Error on initializing test environment ", e);
        }
    }

    @Override
    public void onExecutionFinish() {
        System.out.println("test-end");
    }

    private void handleException(String msg, Exception e) {
        throw new RuntimeException(msg, e);
    }
}
