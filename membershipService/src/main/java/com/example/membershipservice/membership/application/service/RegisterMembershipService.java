package com.example.membershipservice.membership.application.service;

import com.example.membershipservice.membership.application.port.in.RegisterMembershipCommand;
import com.example.membershipservice.membership.application.port.in.RegisterMembershipUseCase;
import com.example.membershipservice.membership.domain.Membership;

public class RegisterMembershipService implements RegisterMembershipUseCase {
    @Override
    public Membership registerMembership(RegisterMembershipCommand command) {

        //  command - >  DB 와 통신



        return null;

    }
}
