package com.example.springstarterdemo.discount;

import com.example.springstarterdemo.member.Grade;
import com.example.springstarterdemo.member.Member;
import org.springframework.stereotype.Component;

//@Component
public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){
            return discountFixAmount;
        }else{
            return 0;
        }
    }
}
