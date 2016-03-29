package net.pizzacrust.dedicatedinjection;

import java.lang.instrument.Instrumentation;

/**
 * Allows for this application to be loaded as a Javaagent to load the Mixins to the class loader.
 *
 * @author PizzaCrust
 */
public class InjectionAgent {
    /**
     * The class mapping for the DedicatedServer.
     */
    public static final String DEDICATED_SERVER_MAPPING = "la";

    /**
     * The pre-main method that Java executes to enter this Javaagent.
     * @param agentArguments the arguments of the executor
     * @param instrumentation the instrumentation object as a Javaagent
     */
    public static void premain(String agentArguments, Instrumentation instrumentation) {
        System.out.println("DedicatedInjection > Injected Mixins into class loader!");
    }
}
