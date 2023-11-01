package org.example.design_patterns.exercise2;

public class RuntimeDetails {
    public static void main(String[] args) {
        // TODO: Print the number of processors available to the Java virtual machine.
        System.out.println(Runtime.getRuntime().availableProcessors());

        // TODO: Print the amount of free memory in the Java Virtual Machine.
        System.out.println(Runtime.getRuntime().freeMemory());

        // TODO: Call an INSTANCE method to shut down the JVM
        Runtime.getRuntime().exit(0);
        System.exit(0);

        // TODO: What class did you use to accomplish the above? Which design pattern was used?
    }
}
