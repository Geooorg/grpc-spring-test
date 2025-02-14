package com.example.grpc;

import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class CustomerServiceImpl
//        extends CustomerServiceGrpc.CustomerServiceImplBase
{

//    @Override
//    public void getCustomer(Customer.CustomerRequest request, StreamObserver<Customer.CustomerResponse> responseObserver) {
//        Customer.CustomerResponse response = Customer.CustomerResponse.newBuilder()
//                .setId(request.getId())
//                .setName("John Doe")
//                .build();
//        responseObserver.onNext(response);
//        responseObserver.onCompleted();
//    }
}
