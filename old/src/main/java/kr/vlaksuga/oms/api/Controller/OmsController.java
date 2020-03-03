package kr.vlaksuga.oms.api.Controller;


import kr.vlaksuga.oms.api.CMap;
import kr.vlaksuga.oms.api.CResult;
import kr.vlaksuga.oms.api.mapper.FaMapper;
import kr.vlaksuga.oms.api.service.OmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class OmsController extends Controller{

    @Autowired
    FaMapper mapper;

    @Autowired
    OmsService service;

   // PasswordEncoder pwEncoder = new BCryptPasswordEncoder();

    @RequestMapping(value = "/idpw.*", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    @CrossOrigin(origins="*")
    public CResult idpw(@RequestParam(value = "userid") String userid, @RequestParam(value = "pw") String pw, @RequestParam CMap param) {
        CResult ret= new CResult();
        List<Map> userauth = mapper.getperson(userid);


        if(1==1){
            String accesstoken = makeAccessToken();

            service.logon(accesstoken,param);
            ret.put("accesstoken",accesstoken);

        }else{
            throwError("error");
            return ret;
        }
        return ret;
    }

    private String makeAccessToken() {
        return "AAAAA";
    }


    @RequestMapping(value = "/user/changePw.*", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    @CrossOrigin(origins="*")
    public CResult changePw(@RequestParam(value = "mid") String mid) {
        CResult ret= new CResult();

        return ret;
    }

    @RequestMapping(value = "/user/iHateThis.*", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    @CrossOrigin(origins="*")
    public CResult ihatethis(@RequestParam(value = "mid") String mid) {
        CResult ret= new CResult();

        return ret;
    }

    @RequestMapping(value = "/user/setProfile.*", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    @CrossOrigin(origins="*")
    public CResult setProfile(@RequestParam(value = "mid") String mid) {
        CResult ret= new CResult();

        return ret;
    }

    @RequestMapping(value = "/user/logOut.*", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    @CrossOrigin(origins="*")
    public CResult logOut(@RequestParam(value = "mid") String mid) {
        CResult ret= new CResult();

        return ret;
    }



}