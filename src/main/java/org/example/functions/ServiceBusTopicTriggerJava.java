package org.example.functions;

import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusMessage;
import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;
import com.azure.messaging.servicebus.ServiceBusSenderClient;


/**
 * Azure Functions with Service Topic Trigger.
 */
public class ServiceBusTopicTriggerJava {
    /**
     * This function will be invoked when a new message is received at the Service Bus Topic.
     */
    @FunctionName("ServiceBusTopicTriggerJava")
    public void run(
        @ServiceBusTopicTrigger(
            name = "message",
            topicName = "sbt-vcom-plano-individual-familiar-dev-001",
            subscriptionName = "sbts-vcom-plano-individual-familiar-dev-001",
            connection = "ServiceBusConnection"
        )
        String message,
        final ExecutionContext context
    ) {
        context.getLogger().info("Java Service Bus Topic trigger function executed.");
        context.getLogger().info(message);
    }

}