package kr.vlaksuga.oms.api.Controller;

import kr.vlaksuga.oms.api.CResult;
import kr.vlaksuga.oms.api.mapper.FaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/s")
public class SelectContoller  extends Controller{
    @Autowired
    FaMapper mapper;


    @RequestMapping(value = "/listNotice.*", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    @CrossOrigin(origins="*")
    public CResult listNotice(@RequestParam(value = "mid") String mid) {
        CResult ret= new CResult();

        return ret;
    }

    @RequestMapping(value = "/getNotice.*", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    @CrossOrigin(origins="*")
    public CResult getNotice(@RequestParam(value = "mid") String mid) {
        CResult ret= new CResult();

        return ret;
    }

    @RequestMapping(value = "/listFaq.*", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    @CrossOrigin(origins="*")
    public CResult listFaq(@RequestParam(value = "mid") String mid) {
        CResult ret= new CResult();

        return ret;
    }

    @RequestMapping(value = "/getFaq.*", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    @CrossOrigin(origins="*")
    public CResult getFaq(@RequestParam(value = "mid") String mid) {
        CResult ret= new CResult();

        return ret;
    }


}
