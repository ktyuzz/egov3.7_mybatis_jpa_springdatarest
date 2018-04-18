/*
 * Copyright 2014 MOSPA(Ministry of Security and Public Administration).
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sysmgnt.code.customer.api;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import com.sysmgnt.code.customer.CustomerCode;
import com.sysmgnt.code.customer.CustomerCodeService;
import egovframework.com.cmm.annotation.IncludedInfo;

/**
 * 거래처 관리 Controller
 * 
 * @author 기술연구소 김태용
 * @since 2018.04.02
 * @version 1.0
 * @see
 * 
 *      <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2018.04.02	기술연구소 김태용		최초생성
 * 
 *      </pre>
 */
@RestController
// @SessionAttributes(types = CustomerCode.class)
public class CustomerCodeRestController {
    /** CustomerCodeService */
    @Resource(name = "customerCodeService")
    private CustomerCodeService customerCodeService;
    @Resource(name = "validator")
    private Validator           beanValidator;

    /**
     * 거래처 코드 등록 화면으로 이동
     * 
     * @param model
     * @return "com/sysmgnt/code/customer/customerCodeRegister"
     * @throws Exception
     */
    @RequestMapping("/api/customerCodes2")
    public String insertView(@RequestParam String ceo) throws Exception {
        return "com/sysmgnt/code/customer/customerCodeRegister";
    }
}
