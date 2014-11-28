package org.test;

import org.testng.IExecutionListener;

import static org.testng.Assert.assertFalse;

public class ExecutionHandler implements IExecutionListener {
    @Override
    public void onExecutionStart() {
        System.out.println("test-start");
        assertFalse(true);

    }

    @Override
    public void onExecutionFinish() {
        System.out.println("test-end");
        assertFalse(true);

    }
}
