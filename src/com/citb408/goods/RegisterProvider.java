package com.citb408.goods;

public abstract class RegisterProvider implements Provider {
    private String type;
    private String registerNumber;

    public RegisterProvider(String type, String registerNumber) {
        this.type = type;
        this.registerNumber = registerNumber;
    }

    @Override
    public String toString() {
        return "RegisterProvider{" +
                "type='" + type + '\'' +
                ", registerNumber='" + registerNumber + '\'' +
                '}';
    }
}
