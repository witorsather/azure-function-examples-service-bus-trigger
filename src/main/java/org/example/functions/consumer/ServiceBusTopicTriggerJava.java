//package org.example.functions.consumer;
//
//import com.microsoft.azure.functions.annotation.*;
//import com.microsoft.azure.functions.*;
//
//
///**
// * Azure Functions with Service Topic Trigger.
// */
//public class ServiceBusTopicTriggerJava {
//    /**
//     * This function will be invoked when a new message is received at the Service Bus Topic.
//     */
//    @FunctionName("ServiceBusTopicTriggerJava")
//    public void run(
//        @ServiceBusTopicTrigger(
//            name = "message",
//            topicName = "test20240419-sbt-vcom-planos-dev-001",
//            subscriptionName = "test20240419-sbts-vcom-planos-dev-001",
//            connection = "ServiceBusConnection"
//        )
//        String message,
//        final ExecutionContext context
//    ) {
//        context.getLogger().info("Java Service Bus Topic trigger function executed.");
//        context.getLogger().info(message);
//    }
//
//}