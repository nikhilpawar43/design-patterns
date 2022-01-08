package com.udemy.patterns.creational.builder.dto;

import com.udemy.patterns.creational.builder.entity.Address;

import java.time.LocalDate;
import java.time.Period;

public class UserDto {

    private String name;
    private Integer age;
    private String address;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    private void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public static UserDtoBuilder getBuilder() {
        return new UserDtoBuilder();
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static class UserDtoBuilder {

        private String firstName;
        private String lastName;
        private String address;
        private Integer age;

        public UserDtoBuilder() {

        }

        public UserDtoBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDtoBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDtoBuilder withBirthDate(LocalDate birthDate) {
            this.age = Period.between(birthDate, LocalDate.now()).getYears();
            return this;
        }

        public UserDtoBuilder withAddress(Address address) {
            StringBuilder addressBuilder = new StringBuilder();

            addressBuilder.append(address.getHouseNo()).append(", ").append(address.getStreetName()).append("\n");
            addressBuilder.append(address.getCity()).append(", ").append(address.getState()).append(" ");
            addressBuilder.append(address.getPinCode());

            this.address = addressBuilder.toString();
            return this;
        }

        public UserDto build() {
            UserDto userDto = new UserDto();
            userDto.setName(firstName + " " + lastName);
            userDto.setAge(age);
            userDto.setAddress(address);

            return userDto;
        }
    }
}
