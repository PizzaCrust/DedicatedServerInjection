package net.pizzacrust.inject;

import net.pizzacrust.mixin.Inject;
import net.pizzacrust.mixin.Mixin;

/**
 * An dedicated server injection.
 *
 * @author PizzaCrust
 */
@Mixin(InjectionAgent.DEDICATED_SERVER_MAPPING)
public class DedicatedServerMixin {
    /**
     * The annotation that indicates that the method is injected into line 1041 in the method of startServer in DedicatedServer.
     */
    @Inject(value = Inject.Execution.CUSTOM, line = 1041)
    /**
     * The startServer method in the DedicatedServer.
     */
    public static void j() {
        System.out.println("DedicatedInjection > Injection has injected to the Minecraft Server successfully!");
    }
}
