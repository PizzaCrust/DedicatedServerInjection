# DedicatedServerInjection
An PizzaMixin example. Prints out this text: ```"DedicatedInjection > Injection has injected to the Minecraft Server successfully!"``` after server has done booting.
## Injecting

- Retrieve a PizzaMixin JAR
- Retrieve a DedicatedServerInjection JAR
- Retrieve a compatible Minecraft server JAR
- Put all of the JARs in one empty directory
- Add these JVM arguments ($ <- stands for variable): ```-javaagent:$MIXINLOCATION.jar=$INJECTIONLOCATION.jar -javaagent:$INJECTIONLOCATION.jar```