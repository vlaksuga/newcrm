package kr.vlaksuga.oms.api.service;

import kr.vlaksuga.oms.api.CMap;
import kr.vlaksuga.oms.api.mapper.FaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OmsService {
    @Autowired
    FaMapper mapper;


    public void logon(String accesstoken, CMap param){
        param.put("accesstoken",accesstoken);
       // mapper.updateAccesstoken(param);

    }
}
