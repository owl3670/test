package com.example.learning.xml

import com.example.learning.member.MemberService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.context.support.ClassPathXmlApplicationContext

class XmlAppContext {
    @Test
    fun xmlAppContext() {
        val context = ClassPathXmlApplicationContext("appConfig.xml")
        val memberService = context.getBean("memberService")
        assertThat(memberService).isInstanceOf(MemberService::class.java)
    }
}