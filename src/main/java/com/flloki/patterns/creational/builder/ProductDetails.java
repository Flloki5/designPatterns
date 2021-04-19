package com.flloki.patterns.creational.builder;

public class ProductDetails {

    private final String name;
    private final String description;
    private final int weight;
    private final int price;
    private final String producer;
    private final String categories;

    private ProductDetails(Builder builder){
        this.name = builder.name;
        this.description = builder.description;
        this.weight = builder.weight;
        this.price = builder().price;
        this.producer = builder().producer;
        this.categories = builder().categories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder{
        private String name = "UNKNOWN";
        private String description = "UNKNOWN";
        private int weight = 0;
        private int price = 0;
        private String producer = "UNKNOWN";
        private String categories = "UNKNOWN";

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withDescription(String description){
            this.description = description;
            return this;
        }

        public Builder withWeight(int weight){
            this.weight = weight;
            return this;
        }

        public Builder withPrice(int price){
            this.price = price;
            return this;
        }

        public Builder withProducer(String producer){
            this.producer = producer;
            return this;
        }

        public Builder withCategories(String categories){
            this.categories = categories;
            return this;
        }

        public ProductDetails build() {
            return new ProductDetails(this);
        }
    }
}
