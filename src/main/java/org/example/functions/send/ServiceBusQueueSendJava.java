//package org.example.functions.send;
//
//import com.azure.messaging.servicebus.ServiceBusClientBuilder;
//import com.azure.messaging.servicebus.ServiceBusMessage;
//import com.azure.messaging.servicebus.ServiceBusSenderClient;
//import com.microsoft.azure.functions.*;
//import com.microsoft.azure.functions.annotation.AuthorizationLevel;
//import com.microsoft.azure.functions.annotation.FunctionName;
//import com.microsoft.azure.functions.annotation.HttpTrigger;
//
///**
// * Azure Functions with Service Queue Send.
// */
//public class ServiceBusQueueSendJava {
//    /**
//     * This function will be invoked when a HTTP request is received.
//     */
//    @FunctionName("SendMessageToServiceBusQueue")
//    public HttpResponseMessage run(
//            @HttpTrigger(
//                    name = "req",
//                    methods = {HttpMethod.POST},
//                    authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<String> request,
//            final ExecutionContext context) {
//
//        // Initialize Service Bus sender client
//        ServiceBusSenderClient senderClient = new ServiceBusClientBuilder()
//                .connectionString("") // Substitua com sua connection string
//                .sender()
//                .queueName("message_queue") // Substitua com o nome da sua fila Azure
//                .buildClient();
//
//        // Send message to the queue
//        ServiceBusMessage message = new ServiceBusMessage(request.getBody());
//        senderClient.sendMessage(message);
//        senderClient.close();
//
//        context.getLogger().info("Java HTTP trigger processed a request.");
//
//        // Return a response
//        return request.createResponseBuilder(HttpStatus.OK).body("Message sent to Service Bus Queue.").build();
//    }
//}
