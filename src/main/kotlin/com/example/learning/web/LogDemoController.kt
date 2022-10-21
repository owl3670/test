package com.example.learning.web

import com.example.learning.common.MyLogger
import com.example.learning.logdemo.LogDemoService
import org.springframework.beans.factory.ObjectProvider
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import javax.servlet.http.HttpServletRequest

@Controller
class LogDemoController (
    private val logDemoService: LogDemoService,
    private val myLoggerProvider: ObjectProvider<MyLogger>
        ){
    @RequestMapping("log-demo")
    @ResponseBody
    fun logDemo(req: HttpServletRequest): String {
        val requestURL = req.requestURL.toString()
        val myLogger = myLoggerProvider.getObject()
        myLogger.setRequestUrl(requestURL)
        myLogger.writeLog("controller test")
        logDemoService.logic("testId")
        return "OK"
    }
}