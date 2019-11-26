package kr.vlaksuga.oms.api.Controller;


import kr.vlaksuga.oms.api.CMap;
import kr.vlaksuga.oms.api.CResult;
import kr.vlaksuga.oms.api.mapper.FaMapper;
import kr.vlaksuga.oms.api.mapper.OmsMapperForSu;
import kr.vlaksuga.oms.api.service.OmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;

@RestController
@RequestMapping(value = "/adm")
public class SuController extends Controller{

    @Autowired
    OmsMapperForSu sumapper;

    @Autowired
    OmsService service;

    @RequestMapping(value = "/listUser.*", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    @CrossOrigin(origins="*")
    public CResult listUser() {
        CResult ret= new CResult();
        ret.put("list",sumapper.listUser());
        return ret;
    }


    @RequestMapping(value = "/listUserByChannel.*", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    @CrossOrigin(origins="*")
    public CResult listUserByChannel(@RequestParam(value = "channelid") String channelid) {
        CResult ret= new CResult();
        ret.put("list",sumapper.listUserByChannel(channelid));
        return ret;
    }



    @RequestMapping(value = "/listOrderByChannel.*", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    @CrossOrigin(origins="*")
    public CResult listOrderByChannel(@RequestParam(value = "channelid") String channelid) {
        CResult ret= new CResult();
        ret.put("list",sumapper.listOrderByChannel(channelid));
        return ret;
    }


    @RequestMapping(value = "/listChannel.*", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    @CrossOrigin(origins="*")
    public CResult listChannel() {
        CResult ret= new CResult();
        ret.put("list",sumapper.listChannel());
        return ret;
    }


}