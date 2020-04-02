package com.septemberhx.jingdong.controller;

import com.septemberhx.common.bean.MResponse;
import com.septemberhx.jingdong.utils.MBaseUtils;
import com.septemberhx.mclient.annotation.MFuncDescription;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2020/3/31
 */
@Controller
public class MainController {

    private Logger logger = LogManager.getLogger(this);

    @PostMapping(path = "/buy")
    @ResponseBody
    @MFuncDescription(value = "buy", level = 2)
    public MResponse buy(@RequestBody MResponse params, HttpServletRequest request) {
        boolean r = MBaseUtils.verDepRequest("pay", 18, request, logger);

        if (!r) {
            return MResponse.failResponse();
        }
        return MBaseUtils.generateResInKBSize(11);
    }

    @PostMapping(path = "/PDelivery")
    @ResponseBody
    @MFuncDescription(value = "PDelivery", level = 4)
    public MResponse pdelivery(@RequestBody MResponse params, HttpServletRequest request) {
        boolean r = MBaseUtils.verDepRequest("pay", 18, request, logger);

        if (!r) {
            return MResponse.failResponse();
        }
        return MBaseUtils.generateResInKBSize(15);
    }
}
