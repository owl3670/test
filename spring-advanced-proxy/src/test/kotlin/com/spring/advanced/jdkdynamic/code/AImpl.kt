package com.spring.advanced.jdkdynamic.code

class AImpl : AInterface {
    private val logger = mu.KotlinLogging.logger {  }
    override fun call(): String {
        logger.info("A 호출")
        return "a"
    }
}