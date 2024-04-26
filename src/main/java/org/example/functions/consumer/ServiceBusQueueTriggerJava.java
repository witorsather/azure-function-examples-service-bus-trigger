package org.example.functions.consumer;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.ServiceBusQueueTrigger;


/**
 * Azure Functions with Service Topic Trigger.
 */
public class ServiceBusQueueTriggerJava {
    /**
     * This function will be invoked when a new message is received at the Service Bus Topic.
     */
    @FunctionName("ServiceBusQueueTriggerJava")
    public void run(
            @ServiceBusQueueTrigger(
                    name = "message",
                    queueName = "message_queue",
                    connection = "ServiceBusConnection"
            )
            String message,
            final ExecutionContext context
    ) {
        context.getLogger().info("Java Service Bus Queue trigger function executed.");
        context.getLogger().info(message);
    }


}