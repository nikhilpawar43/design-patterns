package com.udemy.patterns.creational.builder;

import com.udemy.patterns.creational.builder.dto.UserDto;
import com.udemy.patterns.creational.builder.dto.UserDto.UserDtoBuilder;
import com.udemy.patterns.creational.builder.entity.Address;
import com.udemy.patterns.creational.builder.entity.User;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        UserDto userDto = directBuild(UserDto.getBuilder(), createUser());
        System.out.println(userDto);
    }

    private static UserDto directBuild(UserDtoBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                        .withLastName(user.getLastName())
                        .withBirthDate(user.getBirthDate())
                        .withAddress(user.getAddress())
                        .build();
    }

    private static User createUser() {
        Address address = new Address();
        address.setHouseNo("House no 12");
        address.setStreetName("Jefferson Lane #2");
        address.setCity("Millan");
        address.setState("Goa");
        address.setPinCode("411099");

        User user = new User();
        user.setFirstName("Rohit");
        user.setLastName("Sharma");
        user.setBirthDate(LocalDate.of(1993, 1, 8));
        user.setAddress(address);

        return user;
    }
}
