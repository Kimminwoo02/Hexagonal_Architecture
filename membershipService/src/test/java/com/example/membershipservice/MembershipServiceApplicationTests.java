package com.example.membershipservice;

import com.example.membershipservice.membership.adapter.in.web.RegisterMembershipRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest

class MembershipServiceApplicationTests {


    @Test
    void testRegisterMembership() throws Exception{
        RegisterMembershipRequest request = new RegisterMembershipRequest("name","email","address",true);


    }

}
