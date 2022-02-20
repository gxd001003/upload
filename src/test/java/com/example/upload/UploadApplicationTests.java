package com.example.upload;



import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.UUID;

@SpringBootTest
class UploadApplicationTests {


    @Test
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            System.out.println(uuid);
        }

    }



}
