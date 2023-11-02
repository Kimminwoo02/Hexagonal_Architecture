package com.example.membershipservice.membership.application.port.out;

import com.example.membershipservice.membership.domain.Membership;

public interface RegisterMembershipPort {
    void createMembership(
            Membership.MembershipName membershipName,
            Membership.MembershipEmail membershipEmail,
            Membership.MembershipAddress membershipAddress,
            Membership.MembershipIsValid membershipIsValid,
            Membership.MembershipIsCorp membershipIsCorp);

}
