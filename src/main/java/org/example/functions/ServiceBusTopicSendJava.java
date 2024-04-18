//package org.example.functions;
//
//import com.azure.messaging.servicebus.ServiceBusClientBuilder;
//import com.azure.messaging.servicebus.ServiceBusMessage;
//import com.azure.messaging.servicebus.ServiceBusSenderClient;
//import com.microsoft.azure.functions.*;
//import com.microsoft.azure.functions.annotation.AuthorizationLevel;
//import com.microsoft.azure.functions.annotation.FunctionName;
//import com.microsoft.azure.functions.annotation.HttpTrigger;
//import com.microsoft.azure.functions.annotation.ServiceBusTopicTrigger;
//
//
///**
// * Azure Functions with Service Topic Trigger.
// */
//public class ServiceBusTopicSendJava {
//    /**
//     * This function will be invoked when a new message is received at the Service Bus Topic.
//     */
//
//    @FunctionName("SendMessageToServiceBus")
//    public HttpResponseMessage run(
//            @HttpTrigger(
//                    name = "req",
//                    methods = {HttpMethod.POST},
//                    authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<String> request,
//            final ExecutionContext context) {
//
//
//                ServiceBusSenderClient senderClient = (new ServiceBusClientBuilder()).connectionString("Endpoint=sb://sbns-vcom-planos-dev-001.servicebus.windows.net/;SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=ZyOMhpTrF8K5oAOUNlrBdg7MkQ1dfWbBn+ASbE7EUzo=").sender()
//                        .topicName("sbt-vcom-plano-individual-familiar-dev-001").buildClient();
//                ServiceBusMessage mensagem = new ServiceBusMessage((request.toString()));
//                senderClient.sendMessage(mensagem);
//                senderClient.close();
//
//        context.getLogger().info("Java HTTP trigger processed a request.");
//
//        // Parse request body
//        String requestBody = request.getBody();
//
//        return request.createResponseBuilder(HttpStatus.OK).body("Message sent to Service Bus Topic.").build();
//    }
//}