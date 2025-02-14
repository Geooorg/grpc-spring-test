package com.example.grpc;

import customer.CustomerRequest;
import customer.CustomerResponse;
import customer.CustomerServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class CustomerServiceImpl extends CustomerServiceGrpc.CustomerServiceImplBase  {

    @Override
    public void getCustomer(CustomerRequest request, StreamObserver<CustomerResponse> responseObserver) {
        CustomerResponse response = CustomerResponse.newBuilder()
                .setId(request.getId())
                .setName("John Doe")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
