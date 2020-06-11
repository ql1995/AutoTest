package com.tester.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
        private int id;
        private String userName;
        private String password;
        private String age;
        private String sex;
        private String permission;
        private String isDelete;

        @Override
        public String toString(){
              return (
              "id:"+id+","+
              "userName:"+userName+","+
              "password:"+password+","+
              "age:"+age+","+
              "sex:"+sex+","+
              "permission:"+permission+","+
              "isDelete:"+isDelete+"}"
              );
        }
}
