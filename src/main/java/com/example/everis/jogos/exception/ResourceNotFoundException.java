package com.example.everis.jogos.exception;

import lombok.Data;

@Data
public class ResourceNotFoundException {
//    private String title;
    private int status;
    private String details;
    private long timestamp;


    public static final class ResourceNotFoundExceptionBuilder {
//        private String title;
        private int status;
        private String details;
        private long timestamp;

        private ResourceNotFoundExceptionBuilder() {
        }

        public static ResourceNotFoundExceptionBuilder newBuilder() {
            return new ResourceNotFoundExceptionBuilder();
        }

//        public ResourceNotFoundExceptionBuilder title(String title) {
//            this.title = title;
//            return this;
//        }

        public ResourceNotFoundExceptionBuilder status(int status) {
            this.status = status;
            return this;
        }

        public ResourceNotFoundExceptionBuilder details(String details) {
            this.details = details;
            return this;
        }

        public ResourceNotFoundExceptionBuilder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public ResourceNotFoundException build() {
            ResourceNotFoundException resourceNotFoundException = new ResourceNotFoundException();
//            resourceNotFoundException.setTitle(title);
            resourceNotFoundException.setStatus(status);
            resourceNotFoundException.setDetails(details);
            resourceNotFoundException.setTimestamp(timestamp);
            return resourceNotFoundException;
        }
    }
}
