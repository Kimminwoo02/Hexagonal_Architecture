package com.example.membershipservice.membership.application.port.in;


import com.example.membershipservice.membership.common.UseCase;
import com.example.membershipservice.membership.domain.Membership;

@UseCase
public interface RegisterMembershipUseCase {

    Membership registerMembership(RegisterMembershipCommand command);

}
