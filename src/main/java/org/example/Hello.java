package org.example;

public class Hello {
    public static void main(String[] args) {

        Container<String> containerObj = new Container<>("Hello World");
        System.out.println(containerObj.getData());
    }

    static class Container<T> {
        private T data;

        public Container(T data) {
            this.data = data;
        }

        public T getData() {
            return this.data;
        }
    }


}